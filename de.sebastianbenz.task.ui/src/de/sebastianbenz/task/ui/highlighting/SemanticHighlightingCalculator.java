/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 *******************************************************************************/
package de.sebastianbenz.task.ui.highlighting;

import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.PROJECT2_ID;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.PROJECT3_ID;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.TAG_ID;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.Project;
import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.Task;
import de.sebastianbenz.task.util.TaskSwitch;

public class SemanticHighlightingCalculator implements ISemanticHighlightingCalculator{

	private class Implementation extends TaskSwitch<Boolean>{

		private final IHighlightedPositionAcceptor acceptor;

		public Implementation(IHighlightedPositionAcceptor acceptor) {
			this.acceptor = acceptor;
		}

		@Override
		public Boolean caseTask(Task task) {
			Iterable<Tag> allTags = task.getTags();
			if(task.isDone()){
				highlightText(task, allTags);
			}
			highlightTags(task, allTags);
			return Boolean.TRUE;
		}
		
		private void highlightText(Task task, Iterable<Tag> allTags) {
			int begin = getStartPosition(task);
			int lastTagEnd = 0;
			int taskOffset = offset(task);
			for (Tag tag : allTags) {
				int length = tag.getOffset() - begin - 1;
				if(length > 0){
					int offset = taskOffset + begin;
					acceptor.addPosition(offset, length, HighlightingConfiguration.TASK_DONE_ID);
					lastTagEnd = offset + length + tag.getLength();
				}
				begin = tag.getOffset() + tag.getLength() + 1;
			}
			
			int taskLength = length(task);
			if(lastTagEnd < taskOffset + taskLength){
				acceptor.addPosition(lastTagEnd + 2, taskLength-begin, HighlightingConfiguration.TASK_DONE_ID);
			}
		}

		protected int getStartPosition(Task task) {
			String text = task.getText();
			for(int i = 1; i < text.length(); i++){
				if(text.charAt(i) != ' '){
					return i;
				}
			}
			return 1;
		}

		private void highlightTags(Task task, Iterable<Tag> allTags) {
			for (Tag tag : allTags) {
				acceptor.addPosition(offset(task) + tag.getOffset(), tag.getLength(), TAG_ID);
			}
		}

		private int offset(Task task) {
			ICompositeNode node = NodeModelUtils.getNode(task);
			return node.getOffset() + task.getIntend().size();
		}
		
		private int length(Task task) {
			ICompositeNode node = NodeModelUtils.getNode(task);
			return node.getLength();
		}

		@Override
		public Boolean caseProject(Project project) {
			int level = project.getIntend().size();
			if(level == 1){
				highlight(project, PROJECT2_ID);
			}else if(level >= 2) {
				highlight(project, PROJECT3_ID);
			}
			return Boolean.TRUE;
		}

		protected void highlight(Content content, String id) {
			ICompositeNode node = NodeModelUtils.getNode(content);
			if(node == null){
				return;
			}
			int offset = node.getOffset() + content.getIntend().size();
			int length = node.getLength();
			acceptor.addPosition(offset, length, id);
		}
	}
	
	
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if (noNodeModel(resource)){
			return;
		}
		
		Implementation highlighter = new Implementation(acceptor);
		Iterator<EObject> contents = resource.getAllContents();
		while (contents.hasNext()) {
			highlighter.doSwitch((EObject) contents.next());
		}
	}

	protected EObject root(XtextResource resource) {
		return resource.getParseResult().getRootASTElement();
	}

	protected boolean noNodeModel(XtextResource resource) {
		return resource == null || resource.getParseResult() == null
				|| root(resource) == null;
	}

	
	
}