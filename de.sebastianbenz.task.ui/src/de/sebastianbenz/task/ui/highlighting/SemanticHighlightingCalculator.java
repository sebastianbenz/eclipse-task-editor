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

import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Iterables.toArray;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.NOTE_DONE_ID;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.PROJECT1_DONE_ID;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.PROJECT2_DONE_ID;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.PROJECT2_ID;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.PROJECT3_DONE_ID;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.PROJECT3_ID;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.TAG_ID;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.TASK_DONE_ID;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.TASK_URL_ID;
import static de.sebastianbenz.task.util.Contents.offset;
import static de.sebastianbenz.task.util.Contents.region;
import static java.util.Collections.sort;
import static org.eclipse.xtext.util.Strings.isEmpty;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

import de.sebastianbenz.task.Code;
import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.Link;
import de.sebastianbenz.task.Note;
import de.sebastianbenz.task.Project;
import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.Task;
import de.sebastianbenz.task.TextSegment;
import de.sebastianbenz.task.impl.CodeImplCustom;
import de.sebastianbenz.task.tagging.Region;
import de.sebastianbenz.task.util.Contents;
import de.sebastianbenz.task.util.TaskSwitch;

public class SemanticHighlightingCalculator implements ISemanticHighlightingCalculator{
	
	private static final int CODE_SEPARATOR = CodeImplCustom.PREFIX.length();

	private static class Position implements Comparable<Position>{
		
		public final int offset;
		public final int length;
		public final String[] id;
		
		public Position(int offset, int length, String[] id) {
			this.offset = offset;
			this.length = length;
			this.id = id;
		}

		public int compareTo(Position other) {
			return this.offset < other.offset ? -1 : this.offset == other.offset ? 0 : 1;
		}
		
		@Override
		public String toString() {
			return offset + "-" + length + " " + id;
		}
		
	}

	public static class FilteringAcceptor implements IHighlightedPositionAcceptor {
		
		private final int baseOffset;
		private List<Position> matches = Lists.newArrayList();
		private final IHighlightedPositionAcceptor acceptor;
		
		private FilteringAcceptor(IHighlightedPositionAcceptor acceptor, int base) {
			this.acceptor = acceptor;
			this.baseOffset = base;
		}
	
		public void addPosition(int offset, int length, String... id) {
			matches.add(new Position(offset, length, id));
		}
	
		public void flush() {
			Position[] positions = filterHiddenMatches();
			for (Position match : positions) {
				if(match != null){
					acceptor.addPosition(baseOffset + match.offset, match.length, match.id);
				}
			}
		}
	
		private Position[] filterHiddenMatches() {
			sort(matches);
			Position[] positions = toArray(matches, Position.class);
			for(int i = 0; i < positions.length; i++){
				Position current = positions[i];
				if(isInsideOtherMatch(positions, current, i)){
					 positions[i] = null;
				}
			}
			return positions;
		}
	
		private boolean isInsideOtherMatch(Position[] positions, Position current, int i) {
			for(int j = 0; j < i; j++){
				Position other =  positions[j];
				if(other != null && current.offset < other.offset + other.length){
					return true;
				}
			}
			return false;
		}
	}

	private class Implementation extends TaskSwitch<Boolean>{

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
			for (Link link : concat(content.getLinks(), content.getImages())) {
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
			Region region = Contents.region(content);
			int begin = 0;
			int lastTagEnd = region.getOffset();
			int taskOffset = lastTagEnd;
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
				acceptor.addPosition(lastTagEnd, taskLength-begin, doneStyle);
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


		private void highlightTags(Content content, Iterable<Tag> allTags) {
			for (Tag tag : allTags) {
				acceptor.addPosition(offset(content) + tag.getOffset(), tag.getLength(), TAG_ID);
			}
		}

		
		
		@Override
		public Boolean caseProject(Project project) {
			int level = project.getLevel();
			if(level == 1){
				highlight(project, PROJECT2_ID, PROJECT2_DONE_ID);
			}else if(level >= 2) {
				highlight(project, PROJECT3_ID, PROJECT3_DONE_ID);
			}else if(project.isDone()){
				highlight(project, PROJECT1_DONE_ID);
			}
			return Boolean.TRUE;
		}

		private void highlight(Project project, String normal,
				String done) {
			String id = project.isDone() ? done : normal;
			highlight(project, id);
		}

		protected void highlight(Content content, String id) {
			Region region = region(content);
 			acceptor.addPosition(region.getOffset(), region.getLength(), id);
		}
		
		@Override
		public Boolean caseCode(Code code) {
			applyBrushes(code);
			return Boolean.TRUE;
		}

		protected void applyBrushes(Code code) {
			FilteringAcceptor filter = new FilteringAcceptor(acceptor, codeOffset(code));
			Brush brush = brushFor(code);
			brush.apply(textOf(code), filter);
			filter.flush();
		}

		protected String textOf(Code code) {
			String text = code.getText();
			return text.substring(CODE_SEPARATOR, text.length()-CODE_SEPARATOR);
		}

		protected Brush brushFor(Code code) {
			return configurationRegistry.get(code.getLang());
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
		return resource == null || resource.getParseResult() == null || root(resource) == null;
	}
	
}
