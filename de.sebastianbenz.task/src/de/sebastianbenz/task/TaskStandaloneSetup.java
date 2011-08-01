/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 ******************************************************************************/
package de.sebastianbenz.task;

import com.google.inject.Injector;

import de.sebastianbenz.task.query.QueryPackage;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TaskStandaloneSetup extends TaskStandaloneSetupGenerated{

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		TaskPackage.eINSTANCE.getClass();
		QueryPackage.eINSTANCE.getClass();
		new QueryStandaloneSetup().createInjectorAndDoEMFRegistration();
		return super.createInjectorAndDoEMFRegistration();
	}
	
	public static void doSetup() {
		new TaskStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

