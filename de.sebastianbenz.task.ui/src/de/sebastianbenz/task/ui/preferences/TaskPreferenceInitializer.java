
package de.sebastianbenz.task.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import de.sebastianbenz.task.ui.internal.TaskActivator;

/**
 * Class used to initialize default preference values.
 */
public class TaskPreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = TaskActivator.getInstance().getPreferenceStore();
		store.setDefault(TaskPreferenceConstants.SPELL_CHECKING, true);
		store.setDefault(TaskPreferenceConstants.TAB_WIDTH, 2);
	}

}
