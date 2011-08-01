package de.sebastianbenz.task.ui.handlers;

import com.google.inject.Inject;

import de.sebastianbenz.task.generator.ConfluenceGenerator;

public class ConfluenceExportHandler extends AbstractExportHandler {

	private static final String EXT = "confluence";

	@Inject
	public ConfluenceExportHandler(ConfluenceGenerator generator){
		super(generator);
	}

	@Override
	protected String[] fileExtensions() {
		return new String[] { EXT};
	}

	@Override
	protected String getFileExtension() {
		return EXT;
	}
}
