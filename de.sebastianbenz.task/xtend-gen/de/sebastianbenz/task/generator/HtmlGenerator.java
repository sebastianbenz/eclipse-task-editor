package de.sebastianbenz.task.generator;

import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.EmptyLine;
import de.sebastianbenz.task.Note;
import de.sebastianbenz.task.Project;
import de.sebastianbenz.task.Task;
import de.sebastianbenz.task.TaskModel;
import de.sebastianbenz.task.generator.TaskGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class HtmlGenerator implements TaskGenerator {
  
  public StringConcatenation generate(final TaskModel taskModel) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> ");
    _builder.newLine();
    _builder.append("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\"> ");
    _builder.newLine();
    _builder.append("<head> ");
    _builder.newLine();
    _builder.append("</head> ");
    _builder.newLine();
    _builder.append("<body> ");
    _builder.newLine();
    {
      EList<Content> _contents = taskModel.getContents();
      for(Content content : _contents) {
        StringConcatenation _generate = this.generate(content);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</body>");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _generate(final Note note) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>");
    String _value = note.getValue();
    _builder.append(_value, "");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _generate(final Task task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul><li>");
    String _value = task.getValue();
    _builder.append(_value, "");
    _builder.append("</li></ul>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _generate(final Project project) {
    StringConcatenation _xblockexpression = null;
    {
      int _level = project.getLevel();
      int _operator_plus = IntegerExtensions.operator_plus(((Integer)_level), ((Integer)1));
      int level = _operator_plus;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<h");
      _builder.append(level, "");
      _builder.append(">");
      String _value = project.getValue();
      _builder.append(_value, "");
      _builder.append("</h");
      _builder.append(level, "");
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected StringConcatenation _generate(final EmptyLine emptyLine) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generate(final Content emptyLine) {
    if ((emptyLine instanceof EmptyLine)) {
      return _generate((EmptyLine)emptyLine);
    } else if ((emptyLine instanceof Note)) {
      return _generate((Note)emptyLine);
    } else if ((emptyLine instanceof Project)) {
      return _generate((Project)emptyLine);
    } else if ((emptyLine instanceof Task)) {
      return _generate((Task)emptyLine);
    } else {
      throw new IllegalArgumentException();
    }
  }
}