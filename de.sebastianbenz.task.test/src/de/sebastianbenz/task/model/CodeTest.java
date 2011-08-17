package de.sebastianbenz.task.model;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import de.sebastianbenz.task.Code;
import de.sebastianbenz.task.TaskFactory;

public class CodeTest {

	@Test
	public void shouldResolveBrushNameFromFirstWordInText() {
		assertThat(code("'''java '''").getLang(), is("java"));
		assertThat(code("''' java '''").getLang(), is(""));
		assertThat(code("'''\njava '''").getLang(), is(""));
	}
	
	private Code code(String value) {
		return code("", value);
	}

	private Code code(String intend, String value) {
		Code code = TaskFactory.eINSTANCE.createCode();
		code.setText(value);
		code.setIntend(intend);
		return code;
	}

	@Test
	public void shouldRemovePreAndPostfix() throws Exception {
		assertThat(code("'''test'''").getValue(), is("test"));
		assertThat(code("     ", "'''test'''").getValue(), is("test"));
		assertThat(code("     ", "'''\ntest\n     '''").getValue(), is("test\n"));
	}
	
	@Test
	public void shouldNormalizeWhitespacesBasedOnWhitespacesInFrontOfPrefix() throws Exception {
		assertThat(code("    ", "'''\n" +
						"    text'''").getValue(), is("text"));
		
		assertThat(code("    ", "'''\n" +
						"    text\n" +
						"    text2'''").getValue(), is("text\n" +
													   "text2"));
		assertThat(code("    ", "'''\n" +
						"    text\n" +
						"  text2'''").getValue(), is("text\n" +
													 "  text2"));
		
		assertThat(code("    ", "'''\n" +
						"    text\n" +
						"  text2'''").getValue(), is("text\n" +
													 "  text2"));
	}
}
