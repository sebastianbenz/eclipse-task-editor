package de.sebastianbenz.task.ui.editor;

import static org.eclipse.xtext.util.Strings.isEmpty;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.xtext.util.Strings;

import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.impl.TagImplCustom;
import de.sebastianbenz.task.ui.internal.TaskActivator;
import de.sebastianbenz.task.ui.views.TodoView;

public class TagHyperLink implements IHyperlink {

	private static final Logger LOG = Logger.getLogger(TagHyperLink.class);

	private final IRegion region;
	private final Tag tag;

	public TagHyperLink(IRegion region, Tag tag) {
		this.region = region;
		this.tag = tag;
	}

	public IRegion getHyperlinkRegion() {
		return region;
	}

	public String getTypeLabel() {
		return tag.getName();
	}

	public String getHyperlinkText() {
		return tag.getName();
	}

	public void open() {
		try {
			TodoView todoView = (TodoView) TaskActivator.getInstance().getWorkbench()
					.getActiveWorkbenchWindow().getActivePage()
					.showView(TodoView.ID);
			String query = TagImplCustom.PREFIX + tag.getName();
			if(!isEmpty(tag.getValue())){
				query += " = " + tag.getValue();
			}
			todoView.setQuery(query);
		} catch (PartInitException e) {
			LOG.error(e.getMessage(), e);
		}

	}

}
