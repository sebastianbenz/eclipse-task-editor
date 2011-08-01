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
package de.sebastianbenz.task.ui.contentassist;

public class SimplePrefixMatcher {

	public String apply(String text, int position, String proposal) {
		String s = "";
		String lastPrefix = "";
		for (int i = 0; i < proposal.length(); i++) {
			int index = position - 1 - i;
			if (index >= text.length() || index < 0) {
				return removePrefix(proposal, lastPrefix);
			}
			s = text.charAt(index) + s;
			if (proposal.startsWith(s)) {
				lastPrefix = s;
			}
		}
		return removePrefix(proposal, lastPrefix);
	}

	protected String removePrefix(String proposal, String lastPrefix) {
		return proposal.substring(lastPrefix.length());
	}

}
