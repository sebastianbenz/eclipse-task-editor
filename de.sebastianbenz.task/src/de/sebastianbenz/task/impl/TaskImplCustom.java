/*******************************************************************************
 * Copyright (c) 2008 - 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.sebastianbenz.task.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.TaskPackage;
import de.sebastianbenz.task.tagging.Tags;

public class TaskImplCustom extends de.sebastianbenz.task.impl.TaskImpl {


	@Override
	protected String cleanText(String string) {
		if (string.startsWith("- ")) {
			string = string.substring(2, string.length());
		} else if (string.startsWith("-")) {
			string = string.substring(1, string.length());
		}
		return string;
	}


}
