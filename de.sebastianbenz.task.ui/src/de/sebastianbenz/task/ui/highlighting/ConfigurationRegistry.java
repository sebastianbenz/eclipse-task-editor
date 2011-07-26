package de.sebastianbenz.task.ui.highlighting;

import static com.google.common.collect.Maps.newHashMap;
import static de.sebastianbenz.task.ui.highlighting.Configuration.Mapping.pattern;
import static de.sebastianbenz.task.ui.highlighting.ConfigurationBuilder.lang;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.CODE_ANNOTATION_ID;
import static org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration.COMMENT_ID;
import static org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration.NUMBER_ID;
import static org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration.STRING_ID;

import java.util.Map;
import java.util.regex.Pattern;

public class ConfigurationRegistry {
	
	private static final Pattern MULTILINE_LINE_COMMENT = Pattern.compile("/\\*[\\s\\S]*\\*/", Pattern.MULTILINE);
	private static final Pattern SINGLE_LINE_COMMENT = Pattern.compile("//.*$");
	private static final Pattern DOUBLE_QUOTED_STRING = Pattern.compile("\"(?:\\.|(\\\\\\\")|[^\\\"\"\\n])*\"");
	private static final Pattern SINGLE_QUOTED_STRING = Pattern.compile("'(?:\\.|(\\\\\\')|[^\\''\\n])*'");
	
	
	private Map<String, Configuration> configurations = newHashMap();
	{
		register(
			lang("java")
				.keywords(  "abstract assert boolean break byte case catch char class const " +
			                "continue default do double else enum extends " +
			                "false final finally float for goto if implements import " +
			                "instanceof int interface long native new null " +
			                "package private protected public return " +
			                "short static strictfp super switch synchronized this throw throws true " +
			                "transient try void volatile while")
				.mapping(
					pattern(MULTILINE_LINE_COMMENT).style(COMMENT_ID),
					pattern(SINGLE_LINE_COMMENT).style(COMMENT_ID),
					pattern(DOUBLE_QUOTED_STRING).style(STRING_ID),
					pattern(SINGLE_QUOTED_STRING).style(STRING_ID),
					
					pattern("\\b([\\d]+(\\.[\\d]+)?|0x[a-f0-9]+)\\b").style(NUMBER_ID),
					pattern("(?!\\@interface\\b)\\@[\\$\\w]+\\b").style(CODE_ANNOTATION_ID)),
					
			lang("js")
				.keywords(  "break case catch continue " +
	                        "default delete do else false  " +
	                        "for function if in instanceof " +
	                        "new null return super switch " +
	                        "this throw true try typeof var while with")
				.mapping(
					pattern(MULTILINE_LINE_COMMENT).style(COMMENT_ID),
					pattern(SINGLE_LINE_COMMENT).style(COMMENT_ID),
					pattern(DOUBLE_QUOTED_STRING).style(STRING_ID),
					pattern(SINGLE_QUOTED_STRING).style(STRING_ID),
					
					pattern("\\s*#.*").style(CODE_ANNOTATION_ID))
		);
				
	}

	private void register(ConfigurationBuilder... builders) {
		for (ConfigurationBuilder builder : builders) {
			Configuration c = builder.build();
			configurations.put(c.getName(), c);
		}
	}

	public Configuration get(String key) {
		Configuration configuration = configurations.get(key);
		if(configuration == null){
			configuration = Configuration.EMPTY_CONFIGURATION;
		}
		return configuration;
	}


}
