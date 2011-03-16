package de.sebastianbenz.task.ui.editor;

import org.eclipse.jface.action.IMenuManager;

import com.google.inject.ImplementedBy;

/**
 * 
 *
 */
@ImplementedBy(DefaultExtXtextEditorCustomizer.class)
public interface IExtXtextEditorCustomizer {
	public void customizeEditorContextMenu(IMenuManager menuManager);
}