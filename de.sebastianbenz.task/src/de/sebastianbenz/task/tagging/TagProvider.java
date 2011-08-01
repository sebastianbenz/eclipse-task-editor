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

import static com.google.common.collect.Iterables.concat;

import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.ecore.resource.Resource;

import com.google.common.collect.Iterators;

import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.Task;

public class TagProvider {

	public Iterable<Tag> in(Resource r) {
		Iterator<Task> tasks = Iterators.filter(r.getAllContents(), Task.class);
		Iterable<Tag> result = Collections.emptyList();
		while (tasks.hasNext()) {
			result = concat(tasks.next().getTags(), result);
		}
		return result;
	}

}
