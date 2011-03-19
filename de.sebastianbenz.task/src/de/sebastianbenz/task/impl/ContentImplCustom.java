/*******************************************************************************
* Copyright (c) 2008 - 2010 itemis AG (http://www.itemis.eu) and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package de.sebastianbenz.task.impl;

import org.eclipse.emf.common.util.EList;

import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.Project;


public class ContentImplCustom extends de.sebastianbenz.task.impl.ContentImpl {

	@Override
	public int getLevel() {
		return getIntend().size();
	}
	
	private boolean isInitialized = false;
	
	@Override
	public de.sebastianbenz.task.Container getParent() {
		if(!isInitialized){
			isInitialized  = true;
			setParent(resolveContainer());
		}
		return super.getParent();
	}

	protected de.sebastianbenz.task.Container resolveContainer() {
		EList<Content> allContents = getTaskModel().getContents();
		for (int i = allContents.indexOf(this) - 1; i >= 0; i--) {
			Content candidate = allContents.get(i);
			if ((candidate instanceof Project)
					&& candidate.getLevel() < getLevel()) {
				return (de.sebastianbenz.task.Container) candidate;
			}
		}
		return getTaskModel();
	}
	
}
