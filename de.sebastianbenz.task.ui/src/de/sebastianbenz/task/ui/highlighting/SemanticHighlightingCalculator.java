package de.sebastianbenz.task.ui.highlighting;

import static de.sebastianbenz.task.ui.highlighting.Configuration.PROJECT2_ID;
import static de.sebastianbenz.task.ui.highlighting.Configuration.PROJECT3_ID;
import static de.sebastianbenz.task.ui.highlighting.Configuration.TAG_ID;
import static de.sebastianbenz.task.util.Tasks.isDone;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import de.sebastianbenz.task.tagging.Region;
import de.sebastianbenz.task.tagging.Tag;
import de.sebastianbenz.task.taskPaper.Content;
import de.sebastianbenz.task.taskPaper.Project;
import de.sebastianbenz.task.taskPaper.Task;
import de.sebastianbenz.task.taskPaper.util.TaskPaperSwitch;
import de.sebastianbenz.task.util.Tasks;

public class SemanticHighlightingCalculator implements ISemanticHighlightingCalculator{

	private class Implementation extends TaskPaperSwitch<Boolean>{

		private final IHighlightedPositionAcceptor acceptor;

		public Implementation(IHighlightedPositionAcceptor acceptor) {
			this.acceptor = acceptor;
		}

		@Override
		public Boolean caseTask(Task task) {
			Iterable<Tag> allTags = Tasks.allTags(task);
			if(isDone(task)){
				highlightText(task, allTags);
			}
			highlightTags(task, allTags);
			return Boolean.TRUE;
		}
		
		private void highlightText(Task task, Iterable<Tag> allTags) {
			int begin = task.getText().startsWith("- ") ? 2 : 1;
			
			for (Region tag : allTags) {
				int length = tag.getOffset() - begin;
				if(length > 0){
					int offset = offset(task) + begin;
					acceptor.addPosition(offset, length, Configuration.TASK_DONE_ID);
				}
				begin = tag.getOffset() + tag.getLength();
			}
			
		}

		private void highlightTags(Task task, Iterable<Tag> allTags) {
			for (Region tag : allTags) {
				acceptor.addPosition(offset(task) + tag.getOffset(), tag.getLength(), TAG_ID);
			}
		}

		private int offset(Task task) {
			ICompositeNode node = NodeModelUtils.getNode(task);
			return node.getOffset() + task.getIntend().size();
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
	
	
	@Override
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
