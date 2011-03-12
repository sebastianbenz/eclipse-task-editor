/*******************************************************************************
 * Copyright (c) 2008 - 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.sebastianbenz.task.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.TaskPackage;
import de.sebastianbenz.task.tagging.Tags;

public class TaskImplCustom extends de.sebastianbenz.task.impl.TaskImpl {

	private enum DoneStatus {
		UNKNOWN, OPEN, COMPLETED
	}

	public static final String TAG_PATTERN = "@(\\w+)(\\((.*?)\\))?";
	private Pattern pattern = Pattern.compile(TAG_PATTERN, Pattern.DOTALL);
	private String formattedText;
	private DoneStatus isDone = DoneStatus.UNKNOWN;

	@Override
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this,
					TaskPackage.TASK__TAGS);
			if(text != null){
				parserTags();
			}
		}
		return tags;
	}

	protected void parserTags() {
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			String name = matcher.group(1);
			String value = matcher.group(3);
			int offset = matcher.start(0);
			int length = matcher.end(0) - offset;
			getTags().add(Tags.create(name, value, offset, length));
		}
	}

	@Override
	public void setText(String newText) {
		tags = null;
		formattedText = null;
		isDone = DoneStatus.UNKNOWN;
		super.setText(newText);
	}

	@Override
	public String getValue() {
		if (formattedText == null) {
			formattedText = removeLeadingHypen(text.trim());
			formattedText = removeTags();
		}
		return formattedText;
	}

	protected String removeTags() {
		return formattedText.replaceAll(TAG_PATTERN, "").trim().replaceAll("  ", " ");
	}

	protected String removeLeadingHypen(String string) {
		if (string.startsWith("- ")) {
			string = string.substring(2, string.length());
		} else if (string.startsWith("-")) {
			string = string.substring(1, string.length());
		}
		return string;
	}

	private static final String DONE_TAG = "done";

	@Override
	public boolean isDone() {
		if (isDone == DoneStatus.UNKNOWN) {
			isDone = resolveStatus();
		}
		return isDone == DoneStatus.COMPLETED;
	}

	protected DoneStatus resolveStatus() {
		for (Tag tag : getTags()) {
			if (tag.getName().equals(DONE_TAG)) {
				return DoneStatus.COMPLETED;
			}
		}
		return DoneStatus.OPEN;
	}

}
