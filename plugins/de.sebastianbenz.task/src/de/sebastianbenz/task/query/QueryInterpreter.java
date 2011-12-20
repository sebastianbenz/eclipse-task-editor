/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 ******************************************************************************/
package de.sebastianbenz.task.query;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.SimpleCache;
import org.eclipse.xtext.util.Tuples;

import com.google.common.base.Function;
import com.google.common.base.Joiner;

import de.sebastianbenz.task.Container;
import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.Note;
import de.sebastianbenz.task.Project;
import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.Task;

public class QueryInterpreter {

	private PolymorphicDispatcher<Boolean> selectDispatcher = PolymorphicDispatcher
			.createForSingleTarget("_select", 2, 2, this);

	
	private SimpleCache<Pair<Query, EObject>, Boolean> selectionCache = new SimpleCache<Pair<Query,EObject>, Boolean>(new Function<Pair<Query, EObject>, Boolean>() {
		public Boolean apply(Pair<Query, EObject> args) {
			Query query = args.getFirst();
			EObject element = args.getSecond();
			if (element instanceof Container) {
				for (Content child : ((Container)element).getChildren()) {
					if(select(query, child)){
						return true;
					}
				}
			}
			return internalSelect(query.getExpression(), element);
		}
	});
	
	
	public boolean select(Query query, EObject element) {
		if (query == null || element == null) {
			return true;
		}
		if (query.getExpression() == null) {
			return true;
		}
		return selectionCache.get(Tuples.create(query, element));
	}

	protected boolean internalSelect(Expression expr, EObject target) {
		if (expr == null || target == null) {
			return true;
		}
		return selectDispatcher.invoke(expr, target); 	
	}

	protected boolean _select(EObject expr, EObject object) {
		return false;
	}

	protected boolean _select(AndExpr andExpr, EObject object) {
		return internalSelect(andExpr.getLeft(), object)
				&& internalSelect(andExpr.getRight(), object);
	}

	protected boolean _select(ParenExpr expr, EObject object) {
		return internalSelect(expr.getExpr(), object);
	}

	protected boolean _select(OrExpr expr, EObject object) {
		return internalSelect(expr.getLeft(), object)
				|| internalSelect(expr.getRight(), object);
	}

	protected boolean _select(CompEqExpr expr, Task task) {
		if (isNotValue(expr.getLeft())) {
			return false;
		}
		if (isNotValue(expr.getRight())) {
			return false;
		}
		String left = valueOf((Value) expr.getLeft(), task);
		String right = valueOf((Value) expr.getRight(), task);
		
		if(left == null || right == null){
			return false;
		}
		
		boolean isEqual = left.equals(right);

		if (expr.getOperator() == CompEqOperator.EQUAL) {
			return isEqual;
		} else {
			return !isEqual;
		}
	}

	protected boolean _select(CompExpr expr, Task task) {
		// FIXME left / right might be words
		String left = valueOf(expr.getLeft(), task);
		String right = valueOf(expr.getRight(), task);
		
		switch (expr.getOperator()) {
		case GREATER:
			return left.compareTo(right) > 0;
		case GREATER_EQUAL:
			return left.compareTo(right) >= 0;
		case LESS:
			return left.compareTo(right) < 0;
		case LESS_EQUAL:
			return left.compareTo(right) <= 0;
		}
		
//		try{
//			Number left = asNumber((Value) expr.getLeft(), task);
//			if(left == null){
//				return false;
//			}
//			Number right = asNumber((Value) expr.getRight(), task);
//			if(right == null){
//				return false;
//			}
//		}catch (NumberFormatException e) {
//			// TODO: handle exception
//		}
//		
//		switch (expr.getOperator()) {
//		case GREATER:
//			return Numbers.greater(left, right);
//		case GREATER_EQUAL:
//			return Numbers.greaterEqual(left, right);
//		case LESS:
//			return Numbers.less(left, right);
//		case LESS_EQUAL:
//			return Numbers.lessEqual(left, right);
//		}
		return false;
	}
	
	
	protected boolean _select(Words words, Content content){
		for (String word : words.getValues()) {
			if(!matches(content, word)){
				return false;
			}
		}
		return true;
	}
	
	protected boolean _select(Word word, Content content){
		return matches(content, word.getValue());
	}

	
	protected boolean _select(Phrase phrase, Content content){
		return matches(content, phrase.getValue());
	}
	
	protected boolean matches(Content content, String string) {
		return content.getValue().contains(string);
	}

	private String valueOf(Expression value, Task task) {
		if (value instanceof TagReference) {
			for (Tag tag : task.getTags()) {
				TagReference tagReference = (TagReference)value;
				if (tag.getName().equals(tagReference.getValue())) {
					return tag.getValue();
				}
			}
			return "";
		} else if (value instanceof Value) {
			return ((Value) value).getValue();
		}else if (value instanceof Words) {
			Words words = (Words) value;
			return Joiner.on(" ").join(words.getValues());
		}else{
			return "";
		}
	}

	protected boolean isNotValue(Expression expr) {
		return expr == null || !(expr instanceof Value) || ((Value)expr).getValue() == null;
	}

	protected boolean _select(UnaryExpr expr, EObject object) {
		return !internalSelect(expr.getExpr(), object);
	}

	protected boolean _select(TagReference tagReference, Content content) {
		String tag = tagReference.getValue();
		for (Tag current : content.getTags()) {
			if (current.getName().startsWith(tag)) {
				return true;
			}
		}
		return false;
	}
	
	protected boolean _select(TaskReference taskReference, Task task) {
		return task.getValue().contains(taskReference.getValue());
	}
	
	protected boolean _select(TextReference taskReference, Note note) {
		return note.getValue().contains(taskReference.getValue());
	}

	protected boolean _select(ProjectReference projectReference, Project project) {
		String projectName = projectReference.getValue();
		if (projectName == null) {
			return true;
		}
		if(project.getValue() == null){
			return false;
		}
		if (project.getValue().startsWith(projectName)) {
			return true;
		}
		return internalSelect(projectReference, project.getParent());
	}

	protected boolean _select(ProjectReference projectReference, Content content) {
		Container parent = content.getParent();
		while (parent != null) {
			if (parent instanceof  Project && internalSelect(projectReference, parent)) {
				return true;
			}
			if (parent instanceof Content) {
				parent = ((Content) parent).getParent();
			}else{
				parent = null;
			}
		}
		return false;
	}

}
