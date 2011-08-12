package de.sebastianbenz.task.model;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import de.sebastianbenz.task.Code;
import de.sebastianbenz.task.TaskFactory;

public class CodeTest {

	@Test
	public void shouldResolveBrushNameFromFirstWordInText() {
		assertThat(code("java ").getLang(), is("java"));
		assertThat(code(" java ").getLang(), is(""));
	}

	private Code code(String value) {
		Code code = TaskFactory.eINSTANCE.createCode();
		code.setText("'''" + value  + "'''");
		return code;
	}

}
