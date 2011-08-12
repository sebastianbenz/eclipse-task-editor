package de.sebastianbenz.task.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public abstract class AbstractEditorHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {

		final XtextEditor xtextEditor = EditorUtils.getActiveXtextEditor(event);
		if (xtextEditor == null) {
			return null;
		}
		final IXtextDocument document = xtextEditor.getDocument();
		document.modify(new IUnitOfWork.Void<XtextResource>() {
			@Override
			public void process(XtextResource state) throws Exception {
				doExecute(xtextEditor, state);
			}

		});
		return null;
	}

	protected abstract void doExecute(final XtextEditor xtextEditor,
			XtextResource resource);
}