package de.sebastianbenz.task.ui.editor.handler;

import static com.google.common.collect.Iterators.filter;
import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IRegion;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.common.base.Predicate;

import de.sebastianbenz.task.Task;

public class RemoveDoneTasks extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		final XtextEditor xtextEditor = EditorUtils.getActiveXtextEditor(event);
		if (xtextEditor != null) {
			final IXtextDocument document = xtextEditor.getDocument();
			document.modify(new IUnitOfWork.Void<XtextResource>() {
				@Override
				public void process(XtextResource state) throws Exception {
					List<Task> doneTasks = allDoneTasks(state);
					for (Task task : doneTasks) {
						deleteLine(document, task);
					}
				}

			});
		}
		return null;
	}

	private List<Task> allDoneTasks(XtextResource state) {
		return newArrayList(filter(filter(state.getAllContents(), Task.class),
				new Predicate<Task>() {
					public boolean apply(Task task) {
						return task.isDone();
					}
				}));
	}

	private void deleteLine(final IXtextDocument document, Task task)
			throws BadLocationException {
		ICompositeNode node = NodeModelUtils.getNode(task);
		IRegion line = document.getLineInformationOfOffset(node.getOffset());
		document.replace(line.getOffset(), line.getLength(), "");
	}
}
