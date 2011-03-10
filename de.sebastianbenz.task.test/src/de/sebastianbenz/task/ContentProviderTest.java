package de.sebastianbenz.task;

import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;
import static de.sebastianbenz.task.util.Contents.textOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import com.google.common.base.Function;

import de.sebastianbenz.task.model.ContentProvider;
import de.sebastianbenz.task.taskPaper.Content;
import de.sebastianbenz.task.taskPaper.Todo;

public class ContentProviderTest extends AbstractTest{

	private ContentProvider fixture = new ContentProvider();
	
	@Test
	public void shouldReturnEmptyListForEmptyTodos() throws IOException {
		assertThat(fixture.getContents(root("")), is(Collections.<Content>emptyList()));
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
		Todo root = root("text\n");
		List<Content> first =  fixture.getContents(root);
		List<Content> second =  fixture.getContents(root);
		assertSame(first, second);
	}
	
	
	@Test
	public void shouldResolveAllContainedTasksOfAProject() throws Exception {
		Todo root = root("project:\n" +
						 " note\n" +
						 " - task\n" +
						 "project2:\n" +
						 "  note2\n");
		EList<Content> contents = root.getContents();
		assertThat(contentsOf(contents.get(0)), is(array("note", "task")));
		assertThat(contentsOf(contents.get(3)), is(array("note2")));
	}
	
	@Test
	public void aTaskHasNoContents() throws Exception {
		Todo root = root("note\n" +
				 		 " note2\n");
		assertThat(contentsOf(root.getContents().get(0)), is(array()));
	}
	
	@Test
	public void aNoteHasNoContents() throws Exception {
		Todo root = root("- task\n" +
		 " note2\n");
		assertThat(contentsOf(root.getContents().get(0)), is(array()));
	}
	
	private String[] contentsOf(Content content) {
		List<Content> contents = fixture.getContents(content);
		return toString(contents);
	}

	private String[] array(String... string) {
		return string;
	}

	private String[] contentsOf(String input) throws IOException {
		List<Content> contents = fixture.getContents(root(input));
		return toString(contents);
	}

	protected String[] toString(List<Content> contents) {
		return newArrayList(transform(contents, new Function<Content, String>() {
			@Override
			public String apply(Content content) {
				return textOf(content);
			}
		})).toArray(new String[0]);
	}
}
