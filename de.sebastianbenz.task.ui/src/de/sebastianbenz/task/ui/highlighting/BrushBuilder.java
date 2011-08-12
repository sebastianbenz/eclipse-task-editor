package de.sebastianbenz.task.ui.highlighting;

import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.newArrayListWithExpectedSize;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.CODE_ID;
import static java.util.Arrays.asList;
import static org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration.KEYWORD_ID;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.google.common.base.Function;

import de.sebastianbenz.task.ui.highlighting.Brush.Mapping;

public class BrushBuilder {

	private String keywords = "";
	private Mapping[] mappings = new Mapping[0];
	private String[] names;

	public BrushBuilder(String... names) {
		this.names = names;
	}

	public static BrushBuilder lang(String... names) {
		return new BrushBuilder(names);
	}

	public BrushBuilder keywords(String keywords) {
		this.keywords = keywords;
		return this;
	}

	public BrushBuilder mapping(Mapping...mappings) {
		this.mappings = mappings;
		return this;
	}

	public Collection<Brush> build() {
		final List<Mapping> mappingsList = newArrayListWithExpectedSize(mappings.length + 1);
		mappingsList.addAll(asList(mappings));
		mappingsList.add(Mapping.keywords(keywords).style(KEYWORD_ID));
		mappingsList.add(Mapping.pattern("'''").style(CODE_ID));
		return newArrayList(transform(Arrays.asList(names), new Function<String, Brush>(){

			public Brush apply(String name) {
				return new Brush(name, mappingsList);
			}
			
		}));
	}
	

}
