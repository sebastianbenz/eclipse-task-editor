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
package de.sebastianbenz.task.ui.views;

import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.resource.IResourceDescription.Delta;

import com.google.common.collect.Sets;
import com.google.inject.Singleton;

@Singleton
public class ViewerUpdater implements IXtextBuilderParticipant {

	public interface ResourceDescriptionsChangeListener{

		public void handleResourceDescriptionChange(List<Delta> deltas);
		
	}

	private Set<ResourceDescriptionsChangeListener> listeners = Sets.newHashSet();
	
	
	public void build(IBuildContext context, IProgressMonitor monitor)
			throws CoreException {
		for (ResourceDescriptionsChangeListener listener : listeners) {
			listener.handleResourceDescriptionChange(context.getDeltas());
		}
	}

	public void addListener(ResourceDescriptionsChangeListener eventListener) {
		listeners.add(eventListener);
	}

	public void removeListener(ResourceDescriptionsChangeListener listener) {
		listeners.remove(listener);
	}

}
