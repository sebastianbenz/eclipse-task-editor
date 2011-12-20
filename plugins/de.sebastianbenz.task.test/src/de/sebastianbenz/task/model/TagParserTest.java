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
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.google.common.base.Joiner;

import de.sebastianbenz.task.Tag;

@SuppressWarnings("unchecked")
public class TagParserTest {
	

	@Test
	public void shouldReturnNoTagsForNullOrEmptyString() {
		assertThat(newTask(null).getTags().isEmpty(), is(true));
		assertThat(newTask("").getTags().isEmpty(), is(true));
	}

	@Test
	public void shouldParseSimpleTags() throws Exception {
		assertThat(tagsIn(" @today"), is("@today"));
		assertThat(tagsIn(" @m,aaa"), is("@m"));
		assertThat(tagsIn("  @today"), is("@today"));
		assertThat(tagsIn("  @today  "), is("@today"));
		assertThat(tagsIn("  @a @b  "), anyOf(is("@a, @b"), is("@b, @a")));
		assertThat(tagsIn("  @today @today  "), is("@today, @today"));
		assertThat(tagsIn("@ asdf"), is(""));
	}
	
	@Test
	public void shouldParseValues() throws Exception {
		assertThat(tagsIn(" @today(1)"), is("@today(1)"));
		assertThat(tagsIn(" @today(A)"), is("@today(A)"));
		assertThat(tagsIn(" @today(A1)"), is("@today(A1)"));
		assertThat(tagsIn(" @today(1A1)"), is("@today(1A1)"));
		assertThat(tagsIn("adfafds @ asdfdsaf @today(1A1) adsf (6)23 23"), is("@today(1A1)"));
	}
	
	@Test
	public void shouldStoreOffsetAndLength() throws Exception {
		Tag firstTag = newTask("01234 @to(1) ").getTags().get(0);
		assertThat(firstTag.getOffset(), is(6));
		assertThat(firstTag.getLength(), is(6));
	}

	private String tagsIn(String string) {
		return Joiner.on(", ").join(newTask(string).getTags());
	}

}
