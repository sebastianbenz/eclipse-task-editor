package de.sebastianbenz.task.ui.hover;

import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.getNode;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.internal.text.html.HTMLPrinter;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.IGlobalServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hover.AbstractEObjectHover;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider.IInformationControlCreatorProvider;
import org.eclipse.xtext.ui.editor.hover.html.XtextBrowserInformationControlInput;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentUtil;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;

import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.Image;

public class TaskCompositeHover extends AbstractEObjectHover {

	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;
	
	@Inject 
	private IGlobalServiceProvider serviceProvider;

	private IInformationControlCreatorProvider lastCreatorProvider;
	
	@Override
	protected Pair<EObject, IRegion> getXtextElementAt(XtextResource resource,
			int offset) {
		EObject element = eObjectAtOffsetHelper.resolveElementAt(resource, offset);
		if (!(element instanceof Content)) {
			return super.getXtextElementAt(resource, offset);
		}
		Content content = (Content) element;
		for (Image image : content.getImages()) {
			int hoverOffset = offset;
			int imageOffset = image.getOffset() + getNode(content).getOffset();
			if(hoverOffset >= imageOffset && hoverOffset < imageOffset + image.getLength()){
				return Tuples.<EObject, IRegion>create(image, new Region(imageOffset, image.getLength()));
			}
		}
		return null;
	}

	@Override
	public Object getHoverInfo(EObject first, ITextViewer textViewer,
			IRegion hoverRegion) {
		IEObjectHoverProvider hoverProvider = serviceProvider.findService(first, IEObjectHoverProvider.class);
		if (hoverProvider==null)
			return null;
		IInformationControlCreatorProvider creatorProvider = hoverProvider.getHoverInfo(first, textViewer, hoverRegion);
		if (creatorProvider==null)
			return null;
		this.lastCreatorProvider = creatorProvider;
		return lastCreatorProvider.getInfo();
	}

}
