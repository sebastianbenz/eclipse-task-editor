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
package de.sebastianbenz.task.util;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.collect.Multimap;

import de.sebastianbenz.task.tagging.DefaultTagsProcessor;
import de.sebastianbenz.task.tagging.Tag;
import de.sebastianbenz.task.tagging.TagsProcessor;
import de.sebastianbenz.task.taskPaper.Task;

public class Tasks {

	public static class TagAdapter extends AdapterImpl {

		private Multimap<String, Tag> tags;

		public TagAdapter(Multimap<String, Tag> tags) {
			this.tags = tags;
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return getClass() == type;
		}
		
		public Multimap<String, Tag> getTags() {
			return tags;
		}

	}

	private static final String DONE_TAG = "done";

	public static boolean isDone(Task task) {
		return hasTag(task, DONE_TAG);
	}

	private static boolean hasTag(Task task, String name) {
		return tagsIn(task).containsKey(name);
	}

	public static Multimap<String, Tag> tagsIn(Task task) {
		TagAdapter adapter = getTagsAdapter(task);
		if(adapter == null){
			adapter = adapterFor(task);
		}
		return adapter.getTags();
	}

	private static TagAdapter adapterFor(Task task) {
		TagsProcessor tagsProcessor = new DefaultTagsProcessor();
		return new TagAdapter(tagsProcessor.parse(task.getText()));
	}

	private static TagAdapter getTagsAdapter(Task task) {
		return (TagAdapter) EcoreUtil.getAdapter(task.eAdapters(), TagAdapter.class);
	}

	public static Iterable<Tag> allTags(Task object) {
		return tagsIn(object).values();
	}

	public static String stripTags(Task task) {
		String text = task.getText();
		text = text.replaceAll(DefaultTagsProcessor.TAG_PATTERN, "");
		return text;
	}

}
