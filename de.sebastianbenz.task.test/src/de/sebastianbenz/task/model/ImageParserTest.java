package de.sebastianbenz.task.model;

import static de.sebastianbenz.task.util.Tasks.newTask;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.google.common.base.Joiner;

public class ImageParserTest {
	@Test
	public void shouldReturnNoImagesForNullOrEmptyString() {
		assertThat(newTask(null).getImages().isEmpty(), is(true));
		assertThat(newTask("").getImages().isEmpty(), is(true));
	}
	
	@Test
	public void shouldParseSimpleImages() throws Exception {
		assertThat(imagesIn("text ![The Description](www.myimage.de)"), is("![The Description](www.myimage.de)"));
	}
	
	private String imagesIn(String string) {
		return Joiner.on(", ").join(newTask(string).getImages());
	}
}
