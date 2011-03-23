package de.sebastianbenz.task.app.actions;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.text.MessageFormat;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.editors.text.EditorsPlugin;

import de.sebastianbenz.task.ui.editor.TmpFileStoreEditorInput;

public class NewTodoAction extends Action implements
		IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow fWindow;

	public NewTodoAction() {
		setEnabled(true);
	}

	public void dispose() {
		fWindow = null;
	}

	public void init(IWorkbenchWindow window) {
		fWindow = window;
	}

	public void run(IAction action) {
		run();
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}

	/*
	 * @see org.eclipse.jface.action.Action#run()
	 */
	public void run() {
		IWorkbenchPage page = fWindow.getActivePage();
		try {
			// TaskActivator.getInstance().getClass();
			IPath stateLocation= EditorsPlugin.getDefault().getStateLocation();
			IPath path= stateLocation.append("/untitled.todo"); //$NON-NLS-1$
			IFileStore fileStore = EFS.getLocalFileSystem().getStore(path);
			new File(fileStore.toURI()).createNewFile();
			IDE.openEditor(page, new TmpFileStoreEditorInput(fileStore),
					"de.sebastianbenz.task.Task");
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}