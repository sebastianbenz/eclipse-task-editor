package de.sebastianbenz.task.util;

import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.tagging.Region;

public class Contents {

	public static int offset(Content content) {
		ICompositeNode node = NodeModelUtils.getNode(content);
		return node.getOffset() + content.getIntend().length();
	}
	
	public static Region region(Content content) {
		ICompositeNode node = NodeModelUtils.getNode(content);
		String text = node.getText();
		int begin = 0;
		for (; begin < text.length(); begin++) {
			if (text.charAt(begin) != '-' 
					&& text.charAt(begin) != ' '
					&& text.charAt(begin) != '\t') {
				break;
			}
		}
		int end = text.length()-1;
		for(; end >= 0; end--){
			if(text.charAt(end) != ' '
					&& text.charAt(end) != '\t'){
				break;
			}
		}
		return Region.create(node.getOffset() + begin, end - begin);
	}

}
