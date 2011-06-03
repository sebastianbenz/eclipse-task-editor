package de.sebastianbenz.task.app.actions;

import java.io.File;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.eclipse.ui.ide.IDE;

public class EditorOpener {

	private final File file;
	private final IWorkbenchWindow window;

	public EditorOpener(IWorkbenchWindow fWindow, File file) {
		this.window = fWindow;
		this.file = file;
	}

	public static void open(IWorkbenchWindow window, File file) {
		new EditorOpener(window, file).open();		
	}

	public void open() {
		IWorkbenchPage page= window.getActivePage();
		try {
//			TaskActivator.getInstance().getClass();
			IFileStore fileStore= EFS.getStore(file.toURI());
			IDE.openEditor(page, new FileStoreEditorInput(fileStore),  "de.sebastianbenz.task.Task");
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

}
