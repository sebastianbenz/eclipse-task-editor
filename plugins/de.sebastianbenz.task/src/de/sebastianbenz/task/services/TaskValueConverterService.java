package de.sebastianbenz.task.services;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

import com.google.inject.Inject;

public class TaskValueConverterService extends DefaultTerminalConverters {

	@Inject
	private CodeValueConverter stringValueConverter;
	
	@ValueConverter(rule = "CODE_")
	public IValueConverter<String> CODE_() {
		return stringValueConverter;
	}
}
