package de.sebastianbenz.task.util;

import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import de.sebastianbenz.task.Content;

public class Contents {
	
	public static int offset(Content content) {
		ICompositeNode node = NodeModelUtils.getNode(content);
		return node.getOffset() + content.getIntend().size();
	}

}
