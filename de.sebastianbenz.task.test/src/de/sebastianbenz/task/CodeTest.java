package de.sebastianbenz.task;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CodeTest {

	@Test
	public void shouldResolveClassNameFromFirstWordInText() {
		assertThat(code("java ").getLang(), is("java"));
		assertThat(code(" java ").getLang(), is(""));
	}

	private Code code(String value) {
		Code code = TaskFactory.eINSTANCE.createCode();
		code.setText("'''" + value  + "'''");
		return code;
	}

}
