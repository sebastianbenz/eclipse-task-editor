package de.sebastianbenz.task.util;

import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.Task;
import de.sebastianbenz.task.TaskFactory;

public class Tasks {

	public static Task newTask(String text) {
		Task task = newTask();
		task.setText(text);
		return task;
	}

	public static Task newTask() {
		return TaskFactory.eINSTANCE.createTask();
	}

	public static Content newTaskWithIntend(String intend) {
		Task task = newTask();
		task.setIntend(intend);
		return task;
	}
}
