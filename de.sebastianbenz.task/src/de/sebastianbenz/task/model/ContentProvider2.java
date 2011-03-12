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
package de.sebastianbenz.task.model;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.newArrayListWithExpectedSize;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

import java.util.List;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;

import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.Project;
import de.sebastianbenz.task.TaskModel;

public class ContentProvider2 {
	
	public static class ContentsCache<T> extends AdapterImpl {
		private final List<T> toCache;
		private final Class<T> type;

		public ContentsCache(List<T> toCache, Class<T> type) {
			this.toCache = toCache;
			this.type = type;
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return this.type == type;
		}

		public List<T> getContents() {
			return toCache;
		}

	}
	

	public List<Content> getContents(TaskModel root) {
		if (root == null) {
			return emptyList();
		}

		ContentsCache<Content> contentsAdapter = getAdapter(root, Content.class);
		if (contentsAdapter == null) {
			List<Content> result = resolveContents(root);
			contentsAdapter = adapt(root, result, Content.class);
		}
		return contentsAdapter.toCache;
	}

	protected List<Content> resolveContents(TaskModel root) {
		EList<Content> contents = root.getContents();
		List<Content> result = newArrayListWithExpectedSize(contents.size());
	
		for (Content current : contents) {
			if (!hasContainer(current)) {
				result.add(current);
			}
		}
		return result;
	}

	protected <T> ContentsCache<T> adapt(EObject root, List<T> toCache, Class<T> type) {
		ContentsCache<T> contentsAdapter = new ContentsCache<T>(toCache, type);
		root.eAdapters().add(contentsAdapter);
		return contentsAdapter;
	}

	@SuppressWarnings("unchecked")
	protected <T>ContentsCache<T> getAdapter(EObject root, Class<T> type) {
		return (ContentsCache<T>) EcoreUtil.getAdapter(root.eAdapters(),
				type);
	}

	private boolean hasContainer(Content content) {
		return getContainer(content) != null;
	}

	public Project getContainer(Content content) {
		ContentsCache<Project> contentsAdapter = getAdapter(content, Project.class);
		if (contentsAdapter == null) {
			Project result = resolveContainer(content);
			contentsAdapter = adapt(content, singletonList(result), Project.class);
		}
		List<Project> result = contentsAdapter.getContents();
		return result.isEmpty() ? null : result.get(0);
	}

	protected Project resolveContainer(Content content) {
		int currentLevel = content.getLevel();
		Project result = null;
		for (int i = indexOf(content) - 1; i >= 0; i--) {
			Content candidate = allContents(content).get(i);
			if ((candidate instanceof Project)
					&& candidate.getLevel() < currentLevel) {
				result = (Project) candidate;
				break;
			}
		}
		return result;
	}

	public List<Content> getContents(Content content) {
		if(!(content instanceof Project)){
			return emptyList();
		}
		
		ContentsCache<Content> contentsAdapter = getAdapter(content, Content.class);
		if (contentsAdapter == null) {
			List<Content> result = newArrayList();
			EList<Content> allContents = allContents(content);
			for(int i = indexOf(content)+1; i < allContents.size(); i++){
				Content current = allContents.get(i);
				if(current instanceof Project){
					if(current.getLevel() <= content.getLevel()){
						break;
					}
				}
				if(content == getContainer(current)){
					result.add(current);
				}
				
			}
			contentsAdapter = adapt(content, result, Content.class);
		}
		return contentsAdapter.toCache;
	}

	private EList<Content> allContents(Content content) {
		TaskModel todo = EcoreUtil2.getContainerOfType(content, TaskModel.class);
		return todo.getContents();
	}

	private int indexOf(Content content) {
		TaskModel root = EcoreUtil2.getContainerOfType(content, TaskModel.class);
		return root.getContents().indexOf(content);
	}

}
