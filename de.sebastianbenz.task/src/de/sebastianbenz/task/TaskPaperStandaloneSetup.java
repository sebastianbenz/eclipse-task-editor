
package de.sebastianbenz.task;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TaskPaperStandaloneSetup extends TaskPaperStandaloneSetupGenerated{

	public static void doSetup() {
		new TaskPaperStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

