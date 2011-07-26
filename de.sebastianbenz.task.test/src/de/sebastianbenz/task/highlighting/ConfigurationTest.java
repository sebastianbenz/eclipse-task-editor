package de.sebastianbenz.task.highlighting;

import static com.google.common.collect.Sets.newHashSet;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;

import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.sebastianbenz.task.ui.highlighting.Brush.Mapping;

public class ConfigurationTest {

	private int highlightCount = 0;

	private IHighlightedPositionAcceptor acceptor = new IHighlightedPositionAcceptor() {
		

		public void addPosition(int offset, int length, String... id) {
			String actual = input.substring(offset, offset + length);
			assertTrue("Did highlight: " + actual, expected.contains(actual ));
			highlightCount++;
		}
	};

	private Mapping mapping;

	private HashSet<String> expected;

	private String input;
	
	@Before
	public void setup(){
		keywords("public static if");
	}

	@Test
	public void keywordMatching() {
		highlight("01234 public", 1);
		highlight("static public", 2);
		highlight("'asdfdsa'\n 		static void", 1);
		highlight("in de if ad public", 2);
	}
	
	@After
	public void check(){
		
	}

	private void keywords(String keywords) {
		mapping = Mapping.keywords(keywords).style("mystyle");
		expected = newHashSet(keywords.split(" "));
	}

	private void highlight(String input, int expectedCount) {
		this.input = input;
		mapping.apply(input , acceptor);
		assertThat(highlightCount, is(expectedCount));
		highlightCount = 0;
		
	}

}
