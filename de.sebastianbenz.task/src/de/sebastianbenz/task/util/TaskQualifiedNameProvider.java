package de.sebastianbenz.task.util;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.Tag;

public class TaskQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider{

	QualifiedName qualifiedName(Content content){
		return QualifiedName.create(content.getValue());
	}
	
	QualifiedName qualifiedName(Tag tag){
		return QualifiedName.create(tag.getName());
	}

}
