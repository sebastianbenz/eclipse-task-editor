/*******************************************************************************
* Copyright (c) 2008 - 2010 itemis AG (http://www.itemis.eu) and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package de.sebastianbenz.task.impl;


public class ProjectImplCustom extends de.sebastianbenz.task.impl.ProjectImpl {

	private String value = null;
	
	@Override
	public String getValue() {
		if(value == null){
			value = text.trim();
			if(value.endsWith(":")){
				value = value.substring(0, value.length() - 1);
			}
		}
		return value;
	}
	
	@Override
	public void setText(String newText) {
		value = null;
		super.setText(newText);
	}
}
