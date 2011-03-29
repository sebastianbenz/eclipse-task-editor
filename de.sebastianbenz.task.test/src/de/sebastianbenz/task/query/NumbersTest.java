package de.sebastianbenz.task.query;

import static de.sebastianbenz.task.util.Numbers.parse;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NumbersTest {
	
	@Test(expected=NumberFormatException.class)
	public void shouldThrowExceptionOnNonNumber() throws Exception {
		parse("asdfasdf");
	}
	
	@Test
	public void shouldParseLong() throws Exception {
		Number actual = parse("1");
		assertThat(actual, is(asLong("1")));
		assertThat(parse("10"), is(asLong("10")));
		assertThat(parse("-10"), is(asLong("-10")));
		assertThat(parse("-10a"), is(asLong("-10")));
		assertThat(parse("-10vsa"), is(asLong("-10")));
		assertThat(parse("-10."), is(asLong("-10")));
	}
	
	@Test
	public void shouldParseDouble() throws Exception {
		assertThat(parse("1.0"), is(asDouble("1.0")));
		assertThat(parse("-1.0"), is(asDouble("-1.0")));
		assertThat(parse("1.0a"), is(asDouble("1.0")));
		assertThat(parse("1.0vsa"), is(asDouble("1.0")));
		assertThat(parse("10.0"), is(asDouble("10.0")));
		assertThat(parse("10.001"), is(asDouble("10.001")));
	}
	
	private Number asDouble(String string){
		return Double.valueOf(string);
	}
	
	private Number asLong(String string){
		return Long.valueOf(string);
	}
	
}
