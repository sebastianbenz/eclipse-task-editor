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

public class Region {

	protected final int offset;
	protected final int length;

	public Region(int offset, int length) {
		super();
		this.offset = offset;
		this.length = length;
	}

	public int getOffset() {
		return offset;
	}

	public int getLength() {
		return length;
	}

	@Override
	public String toString() {
		return offset + "->" + length;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + length;
		result = prime * result + offset;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		if (length != other.length)
			return false;
		if (offset != other.offset)
			return false;
		return true;
	}

	public static Region create(int offset, int length) {
		return new Region(offset, length);
	}
	
	
}
