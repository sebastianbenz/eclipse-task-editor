/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 *******************************************************************************/
package de.sebastianbenz.task.tagging;

import static com.google.common.collect.Multimaps.unmodifiableMultimap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.inject.Singleton;

@Singleton
public class DefaultTagsProcessor implements TagsProcessor {

	public static final String TAG_PATTERN = "@(\\w+)(\\((.*?)\\))?";
	private Pattern pattern = Pattern.compile(TAG_PATTERN, Pattern.DOTALL);

	public Multimap<String, Tag> parse(String text) {
		HashMultimap<String, Tag> result = HashMultimap.create();
		if(text == null || text.length() <= 1){
			return unmodifiableMultimap(result);
		}
		parseTags(result, text);
		return unmodifiableMultimap(result);
	}

	private void parseTags(HashMultimap<String, Tag> result, String text) {
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			String name = matcher.group(1);
			String value = matcher.group(3);
			int offset = matcher.start(0);
			int length = matcher.end(0) - offset;
			result.put(name, Tag.create(name, value, offset, length));
		}
	}

}
