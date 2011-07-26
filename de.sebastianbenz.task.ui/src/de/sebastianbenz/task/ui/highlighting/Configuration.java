package de.sebastianbenz.task.ui.highlighting;

import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;

public class Configuration {
	
	public static class MappingBuilder {

		private final Pattern pattern;

		public MappingBuilder(Pattern pattern) {
			this.pattern = pattern;
		}

		public Mapping style(String id) {
			return new Mapping(id, pattern);
		}

	}

	public static class Mapping{
		
		private final String style;
		private final Pattern pattern;
		
		public Mapping(String style, Pattern pattern) {
			this.style = style;
			this.pattern = pattern;
		}

		public static MappingBuilder keywords(String keywords) {
			keywords = "(\\b(" + keywords.replaceAll(" ", ")\\\\b|\\\\b(") + ")\\b)";
			return new MappingBuilder(Pattern.compile(keywords));
		}
		
		public static MappingBuilder pattern(String pattern) {
			return new MappingBuilder(Pattern.compile(pattern));
		}
		
		public static MappingBuilder pattern(Pattern pattern) {
			return new MappingBuilder(pattern);
		}

		public void apply(String string, IHighlightedPositionAcceptor acceptor) {
			Matcher matcher = pattern.matcher(string);
			while(matcher.find()){
				int offset = matcher.start();
				int length = matcher.end() - offset;
				acceptor.addPosition(offset, length, style);
			}
		}
		
	}

	public static Configuration EMPTY_CONFIGURATION = new Configuration("", Collections.<Mapping>emptyList()); 
	
	private final String name;
	private final List<Mapping> mappings;
	
	public Configuration(String name, List<Mapping> mappings) {
		this.name = name;
		this.mappings = mappings;
	}

	public String getName() {
		return name;
	}

	public void apply(String string, IHighlightedPositionAcceptor acceptor) {
		for (Mapping mapping : mappings) {
			mapping.apply(string, acceptor);
		}
		
	}
	
	
	
}
