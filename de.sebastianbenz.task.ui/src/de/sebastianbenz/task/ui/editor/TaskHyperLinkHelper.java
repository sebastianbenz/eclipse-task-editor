package de.sebastianbenz.task.ui.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.jface.text.hyperlink.URLHyperlink;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;

import com.google.inject.Inject;

import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.Link;
import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.TextSegment;
import de.sebastianbenz.task.util.Contents;

public class TaskHyperLinkHelper extends HyperlinkHelper {

	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;
	
	@Override
	public void createHyperlinksByOffset(XtextResource resource, int offset,
			IHyperlinkAcceptor acceptor) {
		super.createHyperlinksByOffset(resource, offset, acceptor);
		EObject current = eObjectAtOffsetHelper.resolveElementAt(resource, offset);
		if(current == null){
			return;
		}
		if (current instanceof Content){
			findLinksIn((Content) current, offset, acceptor);
		}
	}

	private void findLinksIn(Content content, int offset,
			IHyperlinkAcceptor acceptor) {
		int contentOffset = Contents.offset(content);
		for (Link link : content.getLinks()) {
			int linkOffset = contentOffset + link.getOffset();
			if(isInRegion(offset, contentOffset, link)){
				acceptor.accept(create(linkOffset, link));
				return;
			}
		}
		for (Tag tag : content.getTags()) {
			int tagOffset = contentOffset + tag.getOffset();
			if(isInRegion(offset, contentOffset, tag)){
				acceptor.accept(create(tagOffset, tag));
			}
		}
	}

	private boolean isInRegion(int offset, int contentOffset, TextSegment segment) {
		int tagOffset = contentOffset + segment.getOffset();
		return offset >= tagOffset && offset < tagOffset + segment.getLength();
	}

	private IHyperlink create(int offset, Tag tag) {
		IRegion region = new Region(offset, tag.getLength());
		return new TagHyperLink(region, tag);
		
	}

	private IHyperlink create(int offset, Link link) {
		IRegion region = new Region(offset, link.getLength());
		String url = link.getUrl();
		if(!url.startsWith("http")){
			url = "http://" + url;
		}
		return new URLHyperlink(region , url);
	}
	
}
