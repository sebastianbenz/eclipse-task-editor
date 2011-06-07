package de.sebastianbenz.task.generator;

import org.eclipse.xtext.xtend2.lib.StringConcatenation;

import de.sebastianbenz.task.TaskModel;

public interface TaskGenerator {

	StringConcatenation generate(TaskModel taskModel);
	
}
