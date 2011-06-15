package de.sebastianbenz.task.generator;

import de.sebastianbenz.task.Code;
import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.EmptyLine;
import de.sebastianbenz.task.Note;
import de.sebastianbenz.task.Project;
import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.Task;
import de.sebastianbenz.task.TaskModel;
import de.sebastianbenz.task.generator.TaskGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ConfluenceGenerator implements TaskGenerator {
  
  public StringConcatenation generate(final TaskModel taskModel) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Content> _contents = taskModel.getContents();
      for(Content content : _contents) {
        StringConcatenation _generate = this.generate(content);
        _builder.append(_generate, "");
        {
          EList<Tag> _tags = content.getTags();
          for(Tag tag : _tags) {
            _builder.append("{color:gray}");
            _builder.append(tag, "");
            _builder.append("{color} ");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _generate(final Note note) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{color:gray}");
    String _value = note.getValue();
    String _escape = this.escape(_value);
    _builder.append(_escape, "");
    _builder.append("{color}");
    return _builder;
  }
  
  protected StringConcatenation _generate(final Task task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("*  ");
    {
      boolean _isDone = task.isDone();
      if (_isDone) {
        _builder.append("-");
      }
    }
    String _value = task.getValue();
    String _trim = _value.trim();
    String _escape = this.escape(_trim);
    _builder.append(_escape, "");
    _builder.append(" ");
    {
      boolean _isDone_1 = task.isDone();
      if (_isDone_1) {
        _builder.append("-");
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _generate(final Project project) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("h");
    int _level = project.getLevel();
    int _operator_plus = IntegerExtensions.operator_plus(((Integer)_level), ((Integer)1));
    _builder.append(_operator_plus, "");
    _builder.append(". ");
    String _value = project.getValue();
    String _escape = this.escape(_value);
    _builder.append(_escape, "");
    return _builder;
  }
  
  protected StringConcatenation _generate(final EmptyLine emptyLine) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _generate(final Code code) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{code}");
    _builder.newLine();
    String _value = code.getValue();
    _builder.append(_value, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{code}");
    _builder.newLine();
    return _builder;
  }
  
  public String escape(final String string) {
    String _replaceAll = string.replaceAll("\\{", "\\\\{");
    String _replaceAll_1 = _replaceAll.replaceAll("\\}", "\\\\}");
    return _replaceAll_1;
  }
  
  public StringConcatenation generate(final Content code) {
    if ((code instanceof Code)) {
      return _generate((Code)code);
    } else if ((code instanceof EmptyLine)) {
      return _generate((EmptyLine)code);
    } else if ((code instanceof Note)) {
      return _generate((Note)code);
    } else if ((code instanceof Project)) {
      return _generate((Project)code);
    } else if ((code instanceof Task)) {
      return _generate((Task)code);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(code).toString());
    }
  }
}