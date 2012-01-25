package de.sebastianbenz.task.ui.handlers;

import org.eclipse.xtext.parser.IEncodingProvider;

import com.google.inject.Inject;

import de.sebastianbenz.task.generator.ConfluenceGenerator;

public class ConfluenceExportHandler extends AbstractExportHandler {

	private static final String EXT = "confluence";

	@Inject
	public ConfluenceExportHandler(ConfluenceGenerator generator, IEncodingProvider encodingProvider){
		super(generator, encodingProvider);
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
