package de.sebastianbenz.task.tagging;

import com.google.common.collect.Multimap;

public interface TagsProcessor {

	Multimap<String, Tag> parse(String text);

}
