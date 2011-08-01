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
/*
 * generated by Xtext
 */
package de.sebastianbenz.task.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory;
import org.eclipse.xtext.ui.editor.model.ResourceForIEditorInputFactory;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.resource.SimpleResourceSetProvider;

import de.sebastianbenz.task.ui.scoping.TaskGlobalScopeProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class QueryUiModule extends de.sebastianbenz.task.ui.AbstractQueryUiModule {
	public QueryUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return TaskGlobalScopeProvider.class;
	}
	
	@Override
	public Class<? extends IResourceForEditorInputFactory> bindIResourceForEditorInputFactory() {
		return ResourceForIEditorInputFactory.class;
	}

	@Override
	public Class<? extends IResourceSetProvider> bindIResourceSetProvider() {
		return SimpleResourceSetProvider.class;
	}

	@Override
	public com.google.inject.Provider<org.eclipse.xtext.resource.containers.IAllContainersState> provideIAllContainersState() {
		return org.eclipse.xtext.ui.shared.Access.getWorkspaceProjectsState();
	}
}
