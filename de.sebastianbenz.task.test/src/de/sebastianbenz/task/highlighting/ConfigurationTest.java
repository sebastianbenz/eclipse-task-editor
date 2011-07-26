package de.sebastianbenz.task.highlighting;

import static com.google.common.collect.Sets.newHashSet;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Sets;

import de.sebastianbenz.task.ui.highlighting.Configuration.Mapping;

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
<<<<<<< HEAD
		keywords("public static if");
=======
		keywords("public static");
>>>>>>> 7cf26d592945134a29fcd9f0848f8b8e485479aa
	}

	@Test
	public void keywordMatching() {
		highlight("01234 public", 1);
		highlight("static public", 2);
		highlight("'asdfdsa'\n 		static void", 1);
<<<<<<< HEAD
		highlight("in de if ad public", 2);
=======
>>>>>>> 7cf26d592945134a29fcd9f0848f8b8e485479aa
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
