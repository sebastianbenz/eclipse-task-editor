package de.sebastianbenz.task.highlighting;

import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Maps.newHashMap;
import static com.google.common.collect.Sets.newHashSet;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.internal.matchers.Each.each;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.matchers.Each;

import com.google.common.base.Function;
import com.google.common.base.Joiner;

import de.sebastianbenz.task.tagging.Region;
import de.sebastianbenz.task.ui.highlighting.Brush.Mapping;
import de.sebastianbenz.task.ui.highlighting.BrushRegistry;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.*;

@SuppressWarnings("restriction")
public class BrushTest {

	
	private Map<Region, String> highlightedRegions = newHashMap();
	
	private IHighlightedPositionAcceptor acceptor = new IHighlightedPositionAcceptor() {
		

		public void addPosition(int offset, int length, String... id) {
			highlightedRegions.put(new Region(offset, length), id[0]);
		}
	};

	private BrushRegistry brushs = new BrushRegistry();
	private String input;
	private String key;
	
	
	@Test
	public void javaSyntaxHighlighting() throws Exception {
		language("java");
		highlight(
				"package MyPackage;",
				"",
				"/*",
				" * A block comment",
				" */",
				"@annotation",
				"// singleline",
				"public static class HelloWorld{",
					"String greeting = \"Hello\";",
					"char char = 'c';",
					"int value = 0;");
		
		assertThat(styles("package", "static", "class","public", "int"), each(is(KEYWORD_ID)));
		assertThat(style("\"Hello\""), is(STRING_ID));
		assertThat(style("/*\n" +
						 " * A block comment\n" +
						 " */"), 
						 is(COMMENT_ID));
		assertThat(style("@annotation"), is(CODE_ANNOTATION_ID));
		assertThat(style("'c'"), is(STRING_ID));
		assertThat(style("0"), is(NUMBER_ID));
		assertThat(style("// singleline"), is(COMMENT_ID));
	}
	
	@Test
	public void javaScriptSyntaxHighlighting() throws Exception {
		language("js");
		highlight(
				"/*",
				" * A block comment",
				" */",
				"// singleline",
				 "function Hello (){",
				 "  if(true > 0)",
				 "		alert(\"Hello\")",
				 "  else",
				 "		alert('Hello')",
				 "}");
		
		assertThat(styles("function", "if", "else"), each(is(KEYWORD_ID)));
		assertThat(styles("\"Hello\"", "'Hello'"), each(is(STRING_ID)));
		assertThat(style("/*\n" +
						 " * A block comment\n" +
						 " */"), 
						 is(COMMENT_ID));
		assertThat(style("0"), is(NUMBER_ID));
		assertThat(style("// singleline"), is(COMMENT_ID));
	}
	
	private Iterable<String> styles(String... styles) {
		return newArrayList(transform(asList(styles), new Function<String, String>() {
			public String apply(String from) {
				return style(from);
			}
		}));
	}

	private void language(String key) {
		this.key = key;
	}

	private String style(String string) {
		int begin = input.indexOf(string);
		return highlightedRegions.get(new Region(begin, string.length()));
	}

	private void highlight(String... lines) {
		input = Joiner.on("\n").join(lines);
		brushs.get(key).apply(input, acceptor);
	}

}
