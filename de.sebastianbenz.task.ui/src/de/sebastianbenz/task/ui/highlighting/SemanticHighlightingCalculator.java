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
package de.sebastianbenz.task.ui.highlighting;

import static com.google.common.collect.Lists.newLinkedList;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.NOTE_DONE_ID;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.PROJECT2_ID;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.PROJECT3_ID;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.TAG_ID;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.TASK_DONE_ID;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.TASK_URL_ID;
import static de.sebastianbenz.task.util.Contents.offset;
import static org.eclipse.xtext.util.Strings.isEmpty;

import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import com.google.inject.Inject;

import de.sebastianbenz.task.Code;
import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.Link;
import de.sebastianbenz.task.Note;
import de.sebastianbenz.task.Project;
import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.Task;
import de.sebastianbenz.task.impl.CodeImplCustom;
import de.sebastianbenz.task.util.Contents;
import de.sebastianbenz.task.util.TaskSwitch;

public class SemanticHighlightingCalculator implements ISemanticHighlightingCalculator{
	
	private static final int CODE_SEPARATOR = CodeImplCustom.PREFIX.length();

	private static class Position{
		
		public final int offset;
		public final int length;
		public final String[] id;
		
		public Position(int offset, int length, String[] id) {
			this.offset = offset;
			this.length = length;
			this.id = id;
		}
		
	}

	private class Implementation extends TaskSwitch<Boolean>{


		private final class FilteringAcceptor
				implements IHighlightedPositionAcceptor {
			
			private final int baseOffset;
			private LinkedList<Position> matches = newLinkedList();
			
			private FilteringAcceptor(int base) {
				this.baseOffset = base;
			}

			public void addPosition(int offset, int length, String... id) {
				matches.add(new Position(offset, length, id));
			}

			public void flush() {
				filterHiddenMatches();
				
				for (Position match : matches) {
					acceptor.addPosition(baseOffset + match.offset, match.length, match.id);
				}
			}

			private void filterHiddenMatches() {
				Iterator<Position> iterator = matches.iterator();
				while (iterator.hasNext()) {
					Position current = iterator.next();
					if(isInsideOtherMatch(current)){
						iterator.remove();
					}
				}
			}

			private boolean isInsideOtherMatch(Position current) {
				for (Position other : matches) {
					if((current.offset > other.offset) && (current.offset < other.offset + other.length)){
						return true;
					}
				}
				return false;
			}
		}

		private final IHighlightedPositionAcceptor acceptor;

		public Implementation(IHighlightedPositionAcceptor acceptor) {
			this.acceptor = acceptor;
		}

		@Override
		public Boolean caseTask(Task content) {
			return applyHighlighting(content, TASK_DONE_ID, TASK_URL_ID);
		}

		private Boolean applyHighlighting(Content content, String doneStyle, String urlStyle) {
			Iterable<Tag> allTags = content.getTags();
			if(content.isDone()){
				markAsDone(content, allTags, doneStyle);
			}else{
				highlightUrls(content, urlStyle);
			}
			highlightTags(content, allTags);
			return Boolean.TRUE;
		}
		
		private void highlightUrls(Content content, String style) {
			int offset = offset(content);
			for (Link link : content.getLinks()) {
				int linkOffset;
				int linkLength;
				if(isEmpty(link.getDescription())){
					linkOffset = offset + link.getOffset();
					linkLength = link.getLength();
				}else{
					int descriptionLength = link.getDescription().length();
					linkOffset = offset + link.getOffset() + descriptionLength + 3;
					linkLength = link.getLength() - descriptionLength - 4;
				}
				acceptor.addPosition(linkOffset, linkLength, style);
			}
		}

		@Override
		public Boolean caseNote(Note content) {
			return applyHighlighting(content, NOTE_DONE_ID, HighlightingConfiguration.NOTE_URL_ID);
		}
		
		private void markAsDone(Content content, Iterable<Tag> allTags, String doneStyle) {
			int begin = getStartPosition(content);
			int lastTagEnd = 0;
			int taskOffset = offset(content);
			for (Tag tag : allTags) {
				int length = tag.getOffset() - begin - whiteSpaces(content, tag.getOffset());
				if(length > 0){
					int offset = taskOffset + begin;
					if(isNotWhiteSpace(content, taskOffset, length, offset)){
						acceptor.addPosition(offset, length, doneStyle);
					}
					lastTagEnd = offset + length + tag.getLength();
				}
				begin = tag.getOffset() + tag.getLength() + 1;
			}
			
			int taskLength = content.getText().trim().length();
			if(lastTagEnd < taskOffset + taskLength){
				acceptor.addPosition(lastTagEnd + 2, taskLength-begin, doneStyle);
			}
		}

		private int whiteSpaces(Content content, int offset) {
			int whiteSpaceCount = 0;
			for(int i = offset-1; content.getText().charAt(i) == ' '; i--){
				whiteSpaceCount++;
			}
			return whiteSpaceCount;
		}

		private boolean isNotWhiteSpace(Content content, int taskOffset,
				int length, int offset) {
			int beginIndex = offset - taskOffset;
			return content.getText().substring(beginIndex, beginIndex + length).trim().length() > 0;
		}

		protected int getStartPosition(Content content) {
			String text = content.getText();
			for(int i = 0; i < text.length(); i++){
				if(text.charAt(i) != '-' && text.charAt(i) != ' '){
					return i;
				}
			}
			return 1;
		}

		private void highlightTags(Content content, Iterable<Tag> allTags) {
			for (Tag tag : allTags) {
				acceptor.addPosition(offset(content) + tag.getOffset(), tag.getLength(), TAG_ID);
			}
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
			int offset = node.getOffset();
			int length = node.getLength();
			acceptor.addPosition(offset, length, id);
		}
		
		@Override
		public Boolean caseCode(Code code) {
			applyBrushes(code);
			return Boolean.TRUE;
		}

		protected void applyBrushes(Code code) {
			FilteringAcceptor filter = new FilteringAcceptor(codeOffset(code));
			Brush brush = brushFor(code);
			brush.apply(textOf(code), filter);
			filter.flush();
		}

		protected String textOf(Code code) {
			String text = code.getText();
			return text.substring(CODE_SEPARATOR, text.length()-CODE_SEPARATOR);
		}

		protected Brush brushFor(Code code) {
			Brush configuration = configurationRegistry.get(code.getLang());
			return configuration;
		}

		protected int codeOffset(Code code) {
			return offset(code) + CODE_SEPARATOR;
		}

	}
	
	@Inject
	public SemanticHighlightingCalculator(BrushRegistry configurationRegistry){
		this.configurationRegistry = configurationRegistry;
	}
	
	private final BrushRegistry configurationRegistry;

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
