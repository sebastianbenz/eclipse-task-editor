package de.sebastianbenz.task.model;

import static de.sebastianbenz.task.util.ContentTypesMatcher.are;
import static de.sebastianbenz.task.util.Tasks.newTask;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import de.sebastianbenz.task.Image;
import de.sebastianbenz.task.Link;
import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.Task;
import de.sebastianbenz.task.Text;

public class ContentSegmentTest {
	
	@Test
	public void shouldOrderSegmentsBasedOnOffset() throws Exception {
		assertThat(newTask("text").getSegments(), are(Text.class));
		assertThat(newTask("text @tag").getSegments(), are(Text.class,Tag.class));
		assertThat(newTask("www.link.de").getSegments(), are(Link.class));

		Task task = newTask("text @tag text www.link.de text ![The Description](www.myimage.de) text");
		assertThat(task.getSegments(), are(Text.class, Tag.class, Text.class, Link.class, Text.class, Image.class, Text.class));
	}

}
