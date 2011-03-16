package de.sebastianbenz.task.ui.editor;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.eclipse.ui.part.FileEditorInput;

/**
 * Matches unlinked and linked files.
 * 
 */
public class ExtLinkedXtextEditorMatchingStrategy implements IEditorMatchingStrategy {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IEditorMatchingStrategy#matches(org.eclipse.ui.IEditorReference, org.eclipse.ui.IEditorInput)
	 */
	public boolean matches(IEditorReference editor, IEditorInput input) {
		IEditorPart part = (IEditorPart) editor.getPart(false);
		if(part == null)
			return false; // TODO: may be wrong if part not restored See EditorManager.findEditors
		IEditorInput editorInput = part.getEditorInput();
		if(editorInput instanceof FileEditorInput && input instanceof FileStoreEditorInput) {
			FileEditorInput fei = (FileEditorInput) editorInput;
			FileStoreEditorInput fsei = (FileStoreEditorInput) input;
			if(fei.getFile().isLinked() && fei.getURI().equals(fsei.getURI()))
				return true;
		}
		return editorInput.equals(input);
	}

}