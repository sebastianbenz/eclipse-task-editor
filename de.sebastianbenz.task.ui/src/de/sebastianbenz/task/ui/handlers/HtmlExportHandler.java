package de.sebastianbenz.task.ui.handlers;

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
}
