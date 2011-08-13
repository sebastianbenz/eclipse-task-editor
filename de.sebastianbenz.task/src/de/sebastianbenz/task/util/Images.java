package de.sebastianbenz.task.util;

import de.sebastianbenz.task.Image;
import de.sebastianbenz.task.TaskFactory;

public class Images {

	public static Image create(String description, String url, int offset,
			int length) {
		Image image = TaskFactory.eINSTANCE.createImage();
		image.setLength(length);
		image.setOffset(offset);
		image.setDescription(description);
		image.setUrl(url);
		return image;
	}

}
