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
		if (!(current instanceof Content)) {
			return;
		}
		Content content = (Content) current;
		int contentOffset = Contents.offset(content);
		for (Link link : content.getLinks()) {
			int linkOffset = contentOffset + link.getOffset();
			if(offset >= linkOffset && offset < linkOffset + link.getLength()){
				acceptor.accept(create(linkOffset, link));
			}
		}
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
