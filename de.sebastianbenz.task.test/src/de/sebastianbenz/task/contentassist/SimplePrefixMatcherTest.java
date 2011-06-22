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
