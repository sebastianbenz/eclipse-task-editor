/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 ******************************************************************************/
package de.sebastianbenz.task.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import de.sebastianbenz.task.Container;
import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.EmptyLine;
import de.sebastianbenz.task.Link;
import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.TaskPackage;
import de.sebastianbenz.task.tagging.Tags;
import de.sebastianbenz.task.util.Links;

public class ContentImplCustom extends de.sebastianbenz.task.impl.ContentImpl {

	private static final String DONE_TAG = "done";

	@Override
	public int getLevel() {
		return getIntend().size();
	}

	private static final int SPACE = 1;

	private enum DoneStatus {
		UNKNOWN, OPEN, COMPLETED
	}

	public static final String TAG = " @(\\w+)(\\((.*?)\\))?";
	
	private static final Pattern TAG_PATTERN = Pattern.compile(TAG, Pattern.DOTALL);
	private static final Pattern URL_DESCRIPTION_PATTERN = Pattern.compile("\\[(.+)\\]\\((.+)\\)|\\(?\\b(http://|www[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;]*[-A-Za-z0-9+&@#/%=~_()|]");

	private DoneStatus isDone = DoneStatus.UNKNOWN;
	private String value;

	@Override
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this,
					TaskPackage.TASK__TAGS);
			parseTags();
		}
		return tags;
	}

	@Override
	public Container getParent() {
		if (parent == null) {
			setParent(resolveContainer());
		}
		return parent;
	}

	protected Container resolveContainer() {
		EList<Content> allContents = getTaskModel().getContents();
		int index = allContents.indexOf(this);
		if(index == 0){
			return getTaskModel();
		}
		for (int i = index - 1; i >= 0; i--) {
			Content candidate = allContents.get(i);
			if (!(candidate instanceof EmptyLine) && candidate.getLevel() < getLevel()) {
				return (Container) candidate;
			}
		}
		return getTaskModel();
	}

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
		// if (getParent() instanceof Content) {
		// Content parent = (Content) getParent();
		// if(parent.isDone()){
		// return DoneStatus.COMPLETED;
		// }
		// }
		return DoneStatus.OPEN;
	}

	@Override
	public String getValue() {
		if(value == null){
			value = removeTags(getText());
			value = cleanText(value);
		}
		return value;
	}

	@Override
	public void setText(String newText) {
		tags = null;
		isDone = DoneStatus.UNKNOWN;
		value = null;
		super.setText(newText);
	}

	protected String removeTags(String string) {
		return string.replaceAll(TAG, "").trim().replaceAll("  ", " ");
	}

	protected String cleanText(String text){
		return text;
	}
	
	@Override
	public EList<Link> getLinks() {
		if(links == null){
			links = new EObjectContainmentEList<Link>(Link.class, this,
					TaskPackage.CONTENT__LINKS);
			parseLinks();
			
		}
		return links;
	}

	protected void parseTags() {
		if(text == null){
			return;
		}
		Matcher matcher = TAG_PATTERN.matcher(text);
		while (matcher.find()) {
			String name = matcher.group(1);
			String value = matcher.group(3);
			int offset = matcher.start() + SPACE;
			int length = matcher.end() - offset;
			getTags().add(Tags.create(name, value, offset, length));
		}
	}

	private void parseLinks() {
		if (text == null) {
			return;
		}
		Matcher matcher = URL_DESCRIPTION_PATTERN.matcher(text);
		while (matcher.find()) {
			String description = "";
			String url;
			if(isLinkWithDescription(matcher)){
				description = matcher.group(1);
				url = matcher.group(2);
			}else{
				url = matcher.group();
			}
			int offset = matcher.start();
			int length = matcher.end() - offset;
			links.add(Links.create(description, url, offset, length));
		}
	}

	private boolean isLinkWithDescription(Matcher matcher) {
		return matcher.group(1) != null && matcher.group(2) != null;
	}
}
