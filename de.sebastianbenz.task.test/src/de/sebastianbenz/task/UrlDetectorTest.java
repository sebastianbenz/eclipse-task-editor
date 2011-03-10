package de.sebastianbenz.task;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

import de.sebastianbenz.task.tagging.Region;
import de.sebastianbenz.task.ui.highlighting.UrlDectector;

public class UrlDetectorTest {

	UrlDectector fixture = new UrlDectector();
	
	@Test
	public void shouldFindAllUrlsInAString() throws Exception {
		List<Region> detect = fixture.detect("0123 www.google.de 20 http://www.test.com asdfafsd");
		assertThat(detect.size(), is(2));
	}
	
}
