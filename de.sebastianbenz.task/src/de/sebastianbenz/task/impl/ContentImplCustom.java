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

import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Maps.newTreeMap;

import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import com.google.common.collect.Maps;

import de.sebastianbenz.task.Container;
import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.EmptyLine;
import de.sebastianbenz.task.Image;
import de.sebastianbenz.task.Link;
import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.TaskFactory;
import de.sebastianbenz.task.TaskPackage;
import de.sebastianbenz.task.Text;
import de.sebastianbenz.task.TextSegment;
import de.sebastianbenz.task.tagging.Tags;
import de.sebastianbenz.task.util.Images;
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
	
	public static final String TAG = "(^|\\W)@(\\w+)(\\((.*?)\\))?";
	// !\\[(.+)\\]\\((.+) (\"(.*)\")? \\)
	private static final Pattern TAG_PATTERN = Pattern.compile(TAG, Pattern.DOTALL);
	private static final Pattern URL_DESCRIPTION_PATTERN = Pattern.compile("(!)?\\[(.+)\\]\\((.+)\\)|\\(?\\b(http://|www[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;]*[-A-Za-z0-9+&@#/%=~_()|]");

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
			String name = matcher.group(2);
			String value = matcher.group(4);
			int offset = matcher.start() + SPACE;
			int length = matcher.end() - offset;
			getTags().add(Tags.create(name, value, offset, length));
		}
	}
	
	@Override
	public EList<Image> getImages() {
		if(images == null){
			parseLinks();
			
		}
		return images;
	}

	private void parseLinks() {
		links = new EObjectContainmentEList<Link>(Link.class, this,
				TaskPackage.CONTENT__LINKS);
		images = new EObjectContainmentEList<Image>(Image.class, this,
				TaskPackage.CONTENT__IMAGES);
		
		if (text == null) {
			return;
		}
		Matcher matcher = URL_DESCRIPTION_PATTERN.matcher(text);
		while (matcher.find()) {
			int offset = matcher.start();
			int length = matcher.end() - offset;

			String description = "";
			String url;
			if(isImage(matcher)){
				description = matcher.group(2);
				url = matcher.group(3);
				images.add(Images.create(description, url, offset, length));
			}else if(isLinkWithDescription(matcher)){
				description = matcher.group(2);
				url = matcher.group(3);
				links.add(Links.create(description, url, offset, length));
			}else{
				url = matcher.group();
				links.add(Links.create(description, url, offset, length));
			}
		}
	}

	private boolean isImage(Matcher matcher) {
		return matcher.group(1) != null;
	}

	private boolean isLinkWithDescription(Matcher matcher) {
		return matcher.group(2) != null && matcher.group(3) != null;
	}
	
	@Override
	public EList<TextSegment> getSegments() {
		if(segments == null){
			segments = new EObjectResolvingEList<TextSegment>(TextSegment.class, this,
					TaskPackage.CONTENT__SEGMENTS);
			calculateSegments(segments);
		}
		return super.getSegments();
	}

	private void calculateSegments(EList<TextSegment> segments) {
		TreeMap<Integer, TextSegment> offsets = newTreeMap();
		add(offsets, concat(getLinks(), getTags(), getImages()));

		if(offsets.isEmpty()){
			addTextSegment(segments, 0, getText().length());
			return;
		}
		
		int begin = 0;
		for (TextSegment segment : offsets.values()) {
			int newOffset = segment.getOffset();
			if(newOffset > begin){
				addTextSegment(segments, begin, newOffset);
			}
			segments.add(segment);
			begin = newOffset + segment.getLength();
		}
		addTextSegment(segments, begin, getText().length());
	}

	protected void addTextSegment(EList<TextSegment> segments, int begin,
			int end) {
		if(begin >= end){
			return;
		}
		if(begin == end){
			return;
		}
		Text text = TaskFactory.eINSTANCE.createText();
		int textLength = end - begin;
		text.setOffset(begin);
		text.setLength(textLength);
		text.setValue(getText().substring(begin, begin + textLength));
		segments.add(text);
	}

	private void add(TreeMap<Integer, TextSegment> offsets, Iterable<? extends TextSegment> segments) {
		for (TextSegment s : segments) {
			offsets.put(s.getOffset(), s);
		}
	}

}
