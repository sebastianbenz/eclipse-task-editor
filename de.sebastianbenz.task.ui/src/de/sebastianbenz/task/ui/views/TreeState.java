/*******************************************************************************
 * Copyright (c) 2011 Sebastian.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sebastian - initial API and implementation
 ******************************************************************************/
package de.sebastianbenz.task.ui.views;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.IMemento;

public class TreeState {
	
	private static final String EXPANDED_ELEMENTS = "TaskTreeExpandedElements";
	private static final String QUERY = "TaskTreeQuery";

	public Object[] restoreExpandedElements(IMemento memento, GlobalStateManager globalState) {
		List<EObject> result = newArrayList();
		for (IMemento child : memento.getChildren(EXPANDED_ELEMENTS)) {
			EObject eObject = globalState.get(URI.createURI(child.getTextData()));
			if(eObject != null){
				result.add(eObject);
			}
		}
		return result.toArray();
	}

	public void saveExpandedElements(Object[] expandedElements,
			IMemento memento) {
		for (Object object : expandedElements) {
			if (object instanceof EObject) {
				EObject eObject = (EObject) object;
				memento.createChild(EXPANDED_ELEMENTS).putTextData(EcoreUtil.getURI(eObject).toString());
			}
		}
	}

	public void saveQuery(String text, IMemento memento) {
		memento.putString(QUERY, text);
		
	}

	public String restoreQuery(IMemento memento) {
		String query = memento.getString(QUERY);
		return query == null ? "" : query;
	}

}
