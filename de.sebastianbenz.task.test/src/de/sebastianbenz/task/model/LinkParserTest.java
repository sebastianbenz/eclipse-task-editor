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
package de.sebastianbenz.task.model;

import static de.sebastianbenz.task.util.Tasks.newTask;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.google.common.base.Joiner;

public class LinkParserTest {
	

	@Test
	public void shouldReturnNoLinksForNullOrEmptyString() {
		assertThat(newTask(null).getLinks().isEmpty(), is(true));
		assertThat(newTask("").getLinks().isEmpty(), is(true));
	}

	@Test
	public void shouldParseSimpleLinks() throws Exception {
		assertThat(linksIn("text http://www.google.de text"), is("http://www.google.de"));
		assertThat(linksIn("text www.google.de text"), is("www.google.de"));
	}
	
	@Test
	public void shouldParseLinksWithDescription() throws Exception {
		assertThat(linksIn("text [Google](http://www.google.de) text"), is("[Google](http://www.google.de)"));
	}
	
	@Test
	public void shouldParseMultipleLinks() throws Exception {
		assertThat(linksIn("text [Google](http://www.google.de) text [Amazon](http://www.amazon.de) text"), is("[Google](http://www.google.de), [Amazon](http://www.amazon.de)"));
	}
	
	@Test
	public void shouldParseMultipleLinksWithWhiteSpaceInBetween() throws Exception {
		assertThat(linksIn("text [This is Google](http://www.google.de) text [This is Amazon](http://www.amazon.de) text"), is("[This is Google](http://www.google.de), [This is Amazon](http://www.amazon.de)"));
	}
	

	private String linksIn(String string) {
		return Joiner.on(", ").join(newTask(string).getLinks());
	}

	

}
