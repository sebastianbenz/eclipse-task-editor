package de.sebastianbenz.task.ui.handlers;

import org.eclipse.swt.program.Program;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Inject;

import de.sebastianbenz.task.generator.HtmlGenerator;

public class HtmlExportHandler extends AbstractExportHandler {

	private static final String EXT = "html";

	@Inject
	public HtmlExportHandler(HtmlGenerator generator){
		super(generator);
	}

	@Override
	protected String[] fileExtensions() {
		return new String[] { EXT, "htm" };
	}

	@Override
	protected String getFileExtension() {
		return EXT;
	}
	
	@Override
	protected void doExport(XtextResource resource, String path) {
		super.doExport(resource, path);
		Program.launch(path);
	}
}
