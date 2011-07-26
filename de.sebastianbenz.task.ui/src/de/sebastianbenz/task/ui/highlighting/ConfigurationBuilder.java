package de.sebastianbenz.task.ui.highlighting;

import static com.google.common.collect.Lists.newArrayListWithExpectedSize;
import static java.util.Arrays.asList;
import static org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration.KEYWORD_ID;

import java.util.List;

import de.sebastianbenz.task.ui.highlighting.Configuration.Mapping;

public class ConfigurationBuilder {

	private final String name;
	private String keywords;
	private Mapping[] mappings;

	public ConfigurationBuilder(String name) {
		this.name = name;
	}

	public static ConfigurationBuilder lang(String name) {
		return new ConfigurationBuilder(name);
	}

	public ConfigurationBuilder keywords(String keywords) {
		this.keywords = keywords;
		return this;
	}

	public ConfigurationBuilder mapping(Mapping...mappings) {
		this.mappings = mappings;
		return this;
	}

	public Configuration build() {
		List<Mapping> mappingsList = newArrayListWithExpectedSize(mappings.length + 1);
		mappingsList.addAll(asList(mappings));
		mappingsList.add(Mapping.keywords(keywords).style(KEYWORD_ID));
		return new Configuration(name, mappingsList);
	}
	

}
