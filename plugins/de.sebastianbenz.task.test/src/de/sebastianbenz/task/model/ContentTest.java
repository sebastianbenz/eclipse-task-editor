package de.sebastianbenz.task.model;

import static de.sebastianbenz.task.util.Tasks.newTask;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.Task;
import de.sebastianbenz.task.tagging.Tags;
import de.sebastianbenz.task.util.Tasks;

public class ContentTest {
	
	Content fixture = Tasks.newTask();
	
	@Test
	public void shouldNotBeDoneIfNoTagIsDone() throws Exception {
		assertFalse(fixture.isDone());
	}
	
	@Test
	public void shouldBeDoneIfOneTagIsDone() throws Exception {
		markAsDone(fixture);
		assertTrue(fixture.isDone());
	}

	public void markAsDone(Content content) {
		content.getTags().add(doneTag());
	}

	public Tag doneTag() {
		return Tags.from("done");
	}
	
	@Test
	public void shouldBeDoneIfParentIsDone() throws Exception {
		Task parent = newTask();
		markAsDone(parent);
		parent.getChildren().add(fixture);
		assertTrue(fixture.isDone());
	}

	public Task parent() {
		return newTask();
	}

}
