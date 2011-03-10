package de.sebastianbenz.task;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.google.common.base.Joiner;

import de.sebastianbenz.task.tagging.DefaultTagsProcessor;
import de.sebastianbenz.task.tagging.Region;
import de.sebastianbenz.task.tagging.TagsProcessor;

@SuppressWarnings("unchecked")
public class TagProcessorTest {
	
	private TagsProcessor fixture = new DefaultTagsProcessor();

	@Test
	public void shouldReturnNoTagsForNullOrEmptyString() {
		assertThat(fixture.parse(null).isEmpty(), is(true));
		assertThat(fixture.parse("").isEmpty(), is(true));
	}
	
	@Test
	public void shouldParseSimpleTags() throws Exception {
		assertThat(tagsIn("@today"), is("@today"));
		assertThat(tagsIn("  @today"), is("@today"));
		assertThat(tagsIn("  @today  "), is("@today"));
		assertThat(tagsIn("  @a @b  "), anyOf(is("@a, @b"), is("@b, @a")));
		assertThat(tagsIn("  @today @today  "), is("@today, @today"));
		assertThat(tagsIn("@ asdf"), is(""));
	}
	
	@Test
	public void shouldParseValues() throws Exception {
		assertThat(tagsIn("@today(1)"), is("@today(1)"));
		assertThat(tagsIn("@today(A)"), is("@today(A)"));
		assertThat(tagsIn("@today(A1)"), is("@today(A1)"));
		assertThat(tagsIn("@today(1A1)"), is("@today(1A1)"));
		assertThat(tagsIn("adfafds @ asdfdsaf @today(1A1) adsf (6)23 23"), is("@today(1A1)"));
	}
	
	@Test
	public void shouldStoreOffsetAndLength() throws Exception {
		Region firstTag = fixture.parse("01234 @to(1) ").values().iterator().next();
		assertThat(firstTag.getOffset(), is(6));
		assertThat(firstTag.getLength(), is(6));
	}

	private String tagsIn(String string) {
		return Joiner.on(", ").join(fixture.parse(string).values());
	}

}
