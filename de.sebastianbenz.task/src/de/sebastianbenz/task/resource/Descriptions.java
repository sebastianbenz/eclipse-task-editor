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
package de.sebastianbenz.task.resource;

import static java.util.Collections.emptySet;

import java.util.Set;

import org.eclipse.xtext.resource.IEObjectDescription;

import com.google.common.collect.Sets;

public class Descriptions {

	public static final String TAG_KEY = "tags";
	public static final String SEPARATOR = "|";
	public static Set<String> tagsOf(IEObjectDescription description) {
		String userData = description.getUserData(TAG_KEY);
		if(userData == null || userData.length() == 0){
			return emptySet();
		}
		String[] tags = userData.split("\\" + SEPARATOR);
		Set<String> result = Sets.newHashSetWithExpectedSize(tags.length);
		for (String tag : tags) {
			result.add(tag);
		}
		return result;
	}

}
