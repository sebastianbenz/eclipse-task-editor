package de.sebastianbenz.task.ui.highlighting;

import static com.google.common.collect.Lists.newArrayListWithExpectedSize;
import static java.util.Arrays.asList;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.*;
import java.util.List;

import de.sebastianbenz.task.ui.highlighting.Brush.Mapping;

public class BrushBuilder {

	private final String name;
	private String keywords = "";
	private Mapping[] mappings = new Mapping[0];

	public BrushBuilder(String name) {
		this.name = name;
	}

	public static BrushBuilder lang(String name) {
		return new BrushBuilder(name);
	}

	public BrushBuilder keywords(String keywords) {
		this.keywords = keywords;
		return this;
	}

	public BrushBuilder mapping(Mapping...mappings) {
		this.mappings = mappings;
		return this;
	}

	public Brush build() {
		List<Mapping> mappingsList = newArrayListWithExpectedSize(mappings.length + 1);
		mappingsList.addAll(asList(mappings));
		mappingsList.add(Mapping.keywords(keywords).style(KEYWORD_ID));
		mappingsList.add(Mapping.pattern("'''").style(CODE_ID));
		return new Brush(name, mappingsList);
	}
	

}
