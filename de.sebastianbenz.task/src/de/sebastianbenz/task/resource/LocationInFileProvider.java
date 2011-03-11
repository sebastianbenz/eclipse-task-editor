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
package de.sebastianbenz.task.resource;

import static com.google.common.collect.Iterables.addAll;
import static com.google.inject.internal.Lists.newArrayList;
import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.getNode;
import static org.eclipse.xtext.util.ITextRegion.EMPTY_REGION;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;
import org.eclipse.xtext.util.ITextRegion;

import com.google.common.collect.Iterables;

import de.sebastianbenz.task.taskPaper.Content;
import de.sebastianbenz.task.taskPaper.Project;
import de.sebastianbenz.task.taskPaper.Todo;

public class LocationInFileProvider extends DefaultLocationInFileProvider {

	
	@Override
	protected ITextRegion getTextRegion(EObject obj, boolean isSignificant) {
		if (obj instanceof Project) {
			return getTextRegion((Project) obj, isSignificant);
		}
		return super.getTextRegion(obj, isSignificant);
	}

	protected ITextRegion getTextRegion(Project project, boolean isSignificant) {
		ICompositeNode sourceNode = getNode(project);
		if (sourceNode == null) {
			return EMPTY_REGION;
		}
		List<INode> nodes = findNextProjectOnSameOrHigherLevel(project);
		return createRegion(nodes);
	}

	private List<INode> findNextProjectOnSameOrHigherLevel(Project project) {
		List<INode> result = newArrayList(getNodes(project));
		
		Todo todo = (Todo) project.eContainer();
		int start = todo.getContents().indexOf(project) + 1;
		while (start < todo.getContents().size()){
			Content content = todo.getContents().get(start);
			if (content instanceof Project) {
				Project candidate = (Project) content;
				if (candidate.getIntend().size() <= project.getIntend().size()) {
					return result;
				}
			}
			addAll(result, getNodes(content));
			start++;
		} 
		return result;
	}

	private Iterable<INode> getNodes(Content content) {
		ICompositeNode node = NodeModelUtils.getNode(content);
		if(node == null){
			return Collections.emptyList();
		}
		return Iterables.filter(node.getLeafNodes(), INode.class);
	}

}
