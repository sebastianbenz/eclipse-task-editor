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
package de.sebastianbenz.task.util;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.Tag;

public class TaskQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider{

	QualifiedName qualifiedName(Content content){
		return QualifiedName.create(content.getValue());
	}
	
	QualifiedName qualifiedName(Tag tag){
		return QualifiedName.create(tag.getName());
	}

}
