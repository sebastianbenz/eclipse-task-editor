#An easy to use textual todo editor for Eclipse

You can find a general introduction [here](http://sebastianbenz.de/a-simple-text-based-todo-editor-for-eclipse).

![Screenshot](http://sebastianbenz.github.com/eclipse-task-editor/images/ScreenshotNew.png)

#Installation

The editor can be installed via the following update site:

http://sebastianbenz.github.com/eclipse-task-editor/updates

The editor is also available as a standalone Eclipse RCP application. The application runs on windows, linux and mac. You can build the application via:

	git clone git://github.com/sebastianbenz/eclipse-task-editor.git
	cd eclipse-task-editor
	mvn clean install

The zipped applications can be found in de.sebastianbenz.task.rcp/target/products/task-editor-*.zip and a zipped update site is located in de.sebastianbenz.task.update-site/target/site.zip.

#Usage

The eclipse task editor can be used to create and manage textual todo files. The syntax is based on [TaskPaper](http://www.hogbaysoftware.com/products/taskpaper), an excellent to-do list manager for Mac OS X./
The main elements of todo file are: Tasks, Notes, Projects, and Tags. 

* *Tasks:* Something that needs to be done. A task is preceeded by '-'.
* *Notes:* Arbitrary text.
* *Projects:* Projects can be used to structure tasks. Projects are followed by ':' and a linebreak.
* *Tags:* can be used to categorize tasks, notes or projects. Tags start with '@', for example @today. Additionally, values can be assigned to tags, for example @prio(1) or @due(Monday). 
* *Code:* Source code snippets can be written within ''' to make them more readable.



#License

© 2010 Sebastian Benz. Distributed under the Eclipse Public License.
