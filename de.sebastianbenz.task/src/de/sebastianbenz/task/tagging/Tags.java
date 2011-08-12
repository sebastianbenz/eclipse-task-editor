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
package de.sebastianbenz.task.tagging;

import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.TaskFactory;


public class Tags  {

	public static final Tag EMPTY_TAG = Tags.create(null, null, 0, 0);

	public static Tag from(String name) {
		return create(name, null, 0, 0);
	}

	public static Tag create(String name, String value, int offset, int length) {
		Tag tag = TaskFactory.eINSTANCE.createTag();
		tag.setLength(length);
		tag.setOffset(offset);
		tag.setName(name);
		tag.setValue(value);
		return tag;
	}

	
}
