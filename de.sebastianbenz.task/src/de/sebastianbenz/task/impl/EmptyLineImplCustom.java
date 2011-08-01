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
package de.sebastianbenz.task.impl;

import de.sebastianbenz.task.Container;


public class EmptyLineImplCustom extends de.sebastianbenz.task.impl.EmptyLineImpl {

	@Override
	public Container getParent() {
		return null;
	}
	
	
}
