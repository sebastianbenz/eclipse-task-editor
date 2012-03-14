package de.sebastianbenz.task.services;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.STRINGValueConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

public class CodeValueConverter extends STRINGValueConverter {

	@Override
	protected String toEscapedString(String value) {
		return "'''" + value + "'''" + Strings.newLine();
	}
	
	public String toValue(String string, INode node) {
		if (string == null)
			return null;
		try {
			string = string.trim();
			return string.substring(3, string.length() - 3);
		} catch (IllegalArgumentException e) {
			throw new ValueConverterException(e.getMessage(), node, e);
		}
	}
}
