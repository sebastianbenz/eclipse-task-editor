package de.sebastianbenz.task.ui.hover;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.internal.text.html.HTMLPrinter;
import org.eclipse.jface.text.IRegion;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.hover.html.XtextBrowserInformationControlInput;

import de.sebastianbenz.task.Image;

public class TaskHoverProvider extends DefaultEObjectHoverProvider {

	@SuppressWarnings("restriction")
	@Override
	protected XtextBrowserInformationControlInput getHoverInfo(EObject element,
			IRegion hoverRegion, XtextBrowserInformationControlInput previous) {
		if (!(element instanceof Image)) {
			return super.getHoverInfo(element, hoverRegion, previous);
		}
		Image image = (Image) element;
		StringBuffer buffer = new StringBuffer();
		addImageAndLabel(buffer, image);
		HTMLPrinter.insertPageProlog(buffer, 0, getStyleSheet());
		HTMLPrinter.addPageEpilog(buffer);

		return new XtextBrowserInformationControlInput(previous, element,
				buffer.toString(), getLabelProvider());

	}

	public static void addImageAndLabel(StringBuffer buf, Image element) {
		buf.append("<div style='word-wrap: break-word; position: relative; "); //$NON-NLS-1$

		String imageSrcPath = element.getUrl();
		int labelLeft = 5;
		int labelTop = 5;
		int imageWidth = 50;
		int imageHeight = 50;

		if (imageSrcPath != null) {
			buf.append("margin-left: ").append(labelLeft).append("px; "); //$NON-NLS-1$ //$NON-NLS-2$
			buf.append("padding-top: ").append(labelTop).append("px; "); //$NON-NLS-1$ //$NON-NLS-2$
		}

		buf.append("'>"); //$NON-NLS-1$
		if (imageSrcPath != null) {
			if (element != null) {
				try {
					String uri = new URL(element.getUrl()).toURI().toString();
					buf.append("<a href='").append(uri).append("'>"); //$NON-NLS-1$//$NON-NLS-2$
				} catch (MalformedURLException e) {
					element = null; // no link
				} catch (URISyntaxException e) {
					element = null; // no link
				}
			}
			StringBuffer imageStyle = new StringBuffer(
					"border:none; position: absolute; "); //$NON-NLS-1$
			imageStyle.append("width: ").append(imageWidth).append("px; "); //$NON-NLS-1$ //$NON-NLS-2$
			imageStyle.append("height: ").append(imageHeight).append("px; "); //$NON-NLS-1$ //$NON-NLS-2$
			imageStyle.append("left: ").append(-labelLeft - 1).append("px; "); //$NON-NLS-1$ //$NON-NLS-2$

			// hack for broken transparent PNG support in IE 6, see
			// https://bugs.eclipse.org/bugs/show_bug.cgi?id=223900 :
			buf.append("<!--[if lte IE 6]><![if gte IE 5.5]>\n"); //$NON-NLS-1$
			String tooltip = element == null ? "" : "alt='" + element.getDescription() + "' "; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			buf.append("<span ").append(tooltip).append("style=\"").append(imageStyle). //$NON-NLS-1$ //$NON-NLS-2$
					append("filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(src='").append(imageSrcPath).append("')\"></span>\n"); //$NON-NLS-1$ //$NON-NLS-2$
			buf.append("<![endif]><![endif]-->\n"); //$NON-NLS-1$

			buf.append("<!--[if !IE]>-->\n"); //$NON-NLS-1$
			buf.append("<img ").append(tooltip).append("style='").append(imageStyle).append("' src='").append(imageSrcPath).append("'/>\n"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			buf.append("<!--<![endif]-->\n"); //$NON-NLS-1$
			buf.append("<!--[if gte IE 7]>\n"); //$NON-NLS-1$
			buf.append("<img ").append(tooltip).append("style='").append(imageStyle).append("' src='").append(imageSrcPath).append("'/>\n"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			buf.append("<![endif]-->\n"); //$NON-NLS-1$
			if (element != null) {
				buf.append("</a>"); //$NON-NLS-1$
			}
		}

		buf.append(element.getDescription());

		buf.append("</div>"); //$NON-NLS-1$
	}

}
