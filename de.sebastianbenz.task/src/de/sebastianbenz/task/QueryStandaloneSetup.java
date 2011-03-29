
package de.sebastianbenz.task;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class QueryStandaloneSetup extends QueryStandaloneSetupGenerated{

	public static void doSetup() {
		new QueryStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

