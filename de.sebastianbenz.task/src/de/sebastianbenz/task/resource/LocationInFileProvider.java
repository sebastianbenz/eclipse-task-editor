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
package de.sebastianbenz.task.resource;

import static com.google.common.collect.Iterables.addAll;
import static com.google.common.collect.Lists.newArrayList;
import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.getNode;
import static org.eclipse.xtext.util.ITextRegion.EMPTY_REGION;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;
import org.eclipse.xtext.util.ITextRegion;

import de.sebastianbenz.task.Container;
import de.sebastianbenz.task.Content;

public class LocationInFileProvider extends DefaultLocationInFileProvider {

	
	@Override
	protected ITextRegion getTextRegion(EObject obj, boolean isSignificant) {
		if (!(obj instanceof Container)) {
			return super.getTextRegion((Container) obj, isSignificant);
		}
		
		ICompositeNode node = NodeModelUtils.findActualNodeFor(obj);
		if (node == null) {
			if (obj.eContainer() == null)
				return ITextRegion.EMPTY_REGION;
			return getTextRegion(obj.eContainer(), isSignificant);
		}
		List<INode> nodes = newArrayList();
		addAll(nodes, node.getLeafNodes());
		if(!isSignificant){
			addAllChildrensNodes(obj, nodes);
		}
		return createRegion(nodes);
	}

	protected void addAllChildrensNodes(EObject obj, List<INode> nodes) {
		for (Content child : ((Container)obj).getChildren()) {
			INode childNode = NodeModelUtils.findActualNodeFor(child);
			addAll(nodes, childNode .getLeafNodes());
			addAllChildrensNodes(child, nodes);
		}
	}

	protected ITextRegion getTextRegion(Container content, boolean isSignificant) {
		ICompositeNode sourceNode = getNode(content);
		if (sourceNode == null) {
			return EMPTY_REGION;
		}
		List<INode> nodes = findNextProjectOnSameOrHigherLevel(content);
		return createRegion(nodes);
	}

	private List<INode> findNextProjectOnSameOrHigherLevel(Container project) {
		List<INode> result = newArrayList(getNodes(project));
		return result;
	}

	private Iterable<INode> getNodes(Container content) {
		List<INode> result = newArrayList((INode)NodeModelUtils.getNode(content));
		for (Content child : content.getChildren()) {
			result.add(NodeModelUtils.getNode(child));
		}
		return result;
	}

}
