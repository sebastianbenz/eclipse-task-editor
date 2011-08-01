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
package de.sebastianbenz.task.contentassist;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import de.sebastianbenz.task.ui.contentassist.SimplePrefixMatcher;

public class SimplePrefixMatcherTest {

	private SimplePrefixMatcher fixture = new SimplePrefixMatcher();
	
	@Test
	public void shouldRemoveExistingPrefix() {
		assertThat(apply("", "proposal"), is("proposal"));
		assertThat(apply("p", "proposal"), is("roposal"));
		assertThat(apply("pr", "proposal"), is("oposal"));
		assertThat(apply("proposal pro", "posal"), is("posal"));
	}

	private String apply(String text, String proposal) {
		return fixture.apply(text, text.length(), proposal);
	}

}
