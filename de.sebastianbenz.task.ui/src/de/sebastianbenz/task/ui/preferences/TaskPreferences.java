package de.sebastianbenz.task.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.xtext.ui.editor.preferences.LanguageRootPreferencePage;

import de.sebastianbenz.task.ui.internal.TaskActivator;

public class TaskPreferences extends LanguageRootPreferencePage implements
		IWorkbenchPreferencePage {

	public TaskPreferences() {
		setPreferenceStore(TaskActivator.getInstance().getPreferenceStore());
		setDescription("General Settings");
	}

	@Override
	public void createFieldEditors() {
		Composite parent = getFieldEditorParent();
		addField(new BooleanFieldEditor(TaskPreferenceConstants.SPELL_CHECKING,
				"Enable spell checking", parent));
		IntegerFieldEditor field = new IntegerFieldEditor(TaskPreferenceConstants.TAB_WIDTH,
				"Displayed tab width", parent, 2);
		addField(field);
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

}