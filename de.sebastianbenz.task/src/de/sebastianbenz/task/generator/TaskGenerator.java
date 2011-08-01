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
package de.sebastianbenz.task.generator;

import org.eclipse.xtext.xtend2.lib.StringConcatenation;

import de.sebastianbenz.task.TaskModel;

public interface TaskGenerator {

	StringConcatenation generate(TaskModel taskModel);
	
}
