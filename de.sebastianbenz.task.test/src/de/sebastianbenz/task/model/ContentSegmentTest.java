package de.sebastianbenz.task.model;

import static de.sebastianbenz.task.util.ContentTypesMatcher.are;
import static de.sebastianbenz.task.util.Tasks.newTask;
import static de.sebastianbenz.task.util.Tasks.newTaskWithIntend;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import de.sebastianbenz.task.Image;
import de.sebastianbenz.task.Link;
import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.Task;
import de.sebastianbenz.task.Text;

public class ContentSegmentTest {
	
	private static final String SPACE = " ";
	private static final String TAB = "\t";

	@Test
	public void shouldCalculateLevelBasedOnNumberOfIntends() throws Exception {
		assertThat(newTaskWithIntend("").getLevel(), is(0));
		assertThat(newTaskWithIntend(SPACE).getLevel(), is(0));
		assertThat(newTaskWithIntend(TAB).getLevel(), is(1));
		assertThat(newTaskWithIntend(SPACE + SPACE).getLevel(), is(1));
		assertThat(newTaskWithIntend(TAB + TAB + "text").getLevel(), is(2));
		assertThat(newTaskWithIntend(SPACE + SPACE + TAB + "text").getLevel(), is(2));
		assertThat(newTaskWithIntend(SPACE + TAB +  SPACE + "text").getLevel(), is(1));
	}
	
	@Test
	public void shouldOrderSegmentsBasedOnOffset() throws Exception {
		assertThat(newTask("text").getSegments(), are(Text.class));
		assertThat(newTask("text @tag").getSegments(), are(Text.class,Tag.class));
		assertThat(newTask("www.link.de").getSegments(), are(Link.class));

		Task task = newTask("text @tag text www.link.de text ![The Description](www.myimage.de) text");
		assertThat(task.getSegments(), are(Text.class, Tag.class, Text.class, Link.class, Text.class, Image.class, Text.class));
	}

}
