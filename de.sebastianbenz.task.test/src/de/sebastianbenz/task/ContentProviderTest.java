/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 *******************************************************************************/
package de.sebastianbenz.task;

import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import com.google.common.base.Function;

public class ContentProviderTest extends AbstractTest{

	
	@Test
	public void shouldReturnEmptyListForEmptyTodos() throws IOException {
		assertThat(root("").getChildren(), is(Collections.<Content>emptyList()));
	}

	@Test
	public void shouldReturnAllProjectsWithZeroIntendation() throws Exception {
		assertThat(contentsOf("project1:\n"), is(array("project1")));
		assertThat(contentsOf("project1:\n" +
							  " project2:\n"), is(array("project1")));
	}
	
	@Test
	public void shouldReturnTasksAndNotesWithNoProject() throws Exception {
		assertThat(contentsOf("- task1\n"), is(array("task1")));
		assertThat(contentsOf("note\n"), is(array("note")));
		assertThat(contentsOf("note\n" +
							  "project:\n" +
							  " note2\n"), is(array("note", "project")));
		assertThat(contentsOf(" project:\n"), is(array("project")));
		assertThat(contentsOf(" project1:\n" +
							  " project2:\n"), is(array("project1", "project2")));
		assertThat(contentsOf(" project1:\n" +
		  					  " project2:\n" +
		  					  "  project3:\n"), is(array("project1", "project2")));
		assertThat(contentsOf(" project1:\n" +
				  			  "  project2:\n" +
				  			  "note\n"), is(array("project1", "note")));
		assertThat(contentsOf(" project1:\n" +
	  			  			  " project2:\n" +
	  			  			  "note\n"), is(array("project1", "project2", "note")));
	}

	@Test
	public void shouldReturnChildProjects() throws Exception {
		assertThat(contentsOf(" project1:\n" +
	  			  " project2:\n" +
	  			  "note\n"), is(array("project1", "project2", "note")));
	}
	
	@Test
	public void shouldCacheResults() throws Exception {
		TaskModel root = root("text\n");
		List<Content> first =  root.getChildren();
		List<Content> second =  root.getChildren();
		assertSame(first, second);
	}
	
	
	@Test
	public void shouldResolveAllContainedTasksOfAProject() throws Exception {
		TaskModel root = root("project:\n" +
						 " note\n" +
						 " - task\n" +
						 "project2:\n" +
						 "  note2\n");
		EList<Content> contents = root.getContents();
		assertThat(contentsOf((Project) contents.get(0)), is(array("note", "task")));
		assertThat(contentsOf((Project) contents.get(3)), is(array("note2")));
	}
	
	
	private String[] contentsOf(Project content) {
		List<Content> contents = content.getChildren();
		return toString(contents);
	}

	private String[] array(String... string) {
		return string;
	}

	private String[] contentsOf(String input) throws IOException {
		List<Content> contents = root(input).getChildren();
		return toString(contents);
	}

	protected String[] toString(List<Content> contents) {
		return newArrayList(transform(contents, new Function<Content, String>() {
			public String apply(Content content) {
				return content.getValue();
			}
		})).toArray(new String[0]);
	}
}
