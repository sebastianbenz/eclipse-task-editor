package de.sebastianbenz.task.ui.highlighting;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Maps.newHashMap;
import static de.sebastianbenz.task.ui.highlighting.Configuration.Mapping.*;
import static de.sebastianbenz.task.ui.highlighting.HighlightingConfiguration.*;
import de.sebastianbenz.task.ui.highlighting.Configuration.Mapping;
import de.sebastianbenz.task.ui.highlighting.Configuration.MappingBuilder;

public class ConfigurationRegistry {
	
	private static final Pattern MULTILINE_LINE_COMMENT = Pattern.compile("/\\*[\\s\\S]*\\*/", Pattern.MULTILINE);
	private static final Pattern SINGLE_LINE_COMMENT = Pattern.compile("//.*$");
	private static final Pattern DOUBLE_QUOTED_STRING = Pattern.compile("\"(?:\\.|(\\\\\\\")|[^\\\"\"\\n])*\"");
	private static final Pattern SINGLE_QUOTED_STRING = Pattern.compile("'(?:\\.|(\\\\\\')|[^\\''\\n])*'");
	
	
	private Map<String, Configuration> configurations = newHashMap();
	{
		String keywords = "abstract assert boolean break byte case catch char class const " +
			                "continue default do double else enum extends " +
			                "false final finally float for goto if implements import " +
			                "instanceof int interface long native new null " +
			                "package private protected public return " +
			                "short static strictfp super switch synchronized this throw throws true " +
			                "transient try void volatile while";
		
		List<Mapping> mappings = newArrayList(
			pattern(MULTILINE_LINE_COMMENT).style(COMMENT_ID),
			pattern(SINGLE_LINE_COMMENT).style(COMMENT_ID),
			pattern(DOUBLE_QUOTED_STRING).style(STRING_ID),
			pattern(SINGLE_QUOTED_STRING).style(STRING_ID),
			
			pattern("\\b([\\d]+(\\.[\\d]+)?|0x[a-f0-9]+)\\b").style(NUMBER_ID),
			pattern("(?!\\@interface\\b)\\@[\\$\\w]+\\b").style(CODE_ANNOTATION_ID),
			pattern("\\@interface\\b").style(KEYWORD_ID),               
			keywords(keywords).style(KEYWORD_ID)
		);
				
		Configuration java = new Configuration("java", keywords, mappings);
		configurations.put(java.getName(), java);
	}

	public Configuration get(String key) {
		Configuration configuration = configurations.get(key);
		if(configuration == null){
			configuration = Configuration.EMPTY_CONFIGURATION;
		}
		return configuration;
	}


}
