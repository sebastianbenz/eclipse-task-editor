package de.sebastianbenz.task.ui.highlighting;

import static com.google.common.collect.Lists.newArrayList;

import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import de.sebastianbenz.task.tagging.Region;

public class UrlDectector {

	private final Pattern pattern = Pattern
			.compile(
					"\\(?\bhttp://[-A-Za-z0-9+&@#/%?=~_()|!:,.;]*[-A-Za-z0-9+&@#/%=~_()|]",
					Pattern.CASE_INSENSITIVE);

	public List<Region> detect(String line) {
		Matcher m = pattern.matcher(line);
		List<Region> result = newArrayList();
		while (m.find()) {
			int offset = m.start(1);
			int length = m.end(1) - offset;
			result.add(Region.create(offset, length));
		}
		return Collections.emptyList();
	}
}
