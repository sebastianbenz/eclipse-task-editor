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
package de.sebastianbenz.task.ui.scoping;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsBasedContainer;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;

import com.google.inject.Inject;

public class TaskGlobalScopeProvider extends DefaultGlobalScopeProvider {

	@Inject
	private IResourceDescriptions resourceDescriptions;
	
	@Override
	protected List<IContainer> getVisibleContainers(Resource resource) {
		return Collections.<IContainer>singletonList(new ResourceDescriptionsBasedContainer(resourceDescriptions));
	}
}
