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
public class HtmlGenerator implements TaskGenerator {
  
  public StringConcatenation generate(final TaskModel taskModel) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> ");
    _builder.newLine();
    _builder.append("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\"> ");
    _builder.newLine();
    _builder.append("<head> ");
    _builder.newLine();
    _builder.append("<style type=\"text/css\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".done {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("text-decoration: line-through;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".tag {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("color: gray;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("body {");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("font-family: \"Helvetica Neue\", helvetica, arial, sans-serif;");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("font-size: 14px;");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("line-height: 1.4em;");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("color: #333333;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ul{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("list-style: none;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("margin-left: 0;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("padding-left: 0em;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("text-indent: 0em;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ul li:before {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("content: \"\\2D\";\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("margin-right: 0.5em;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(".note{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("color: gray;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("</style");
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
    _builder.append("<p class=\"note\">");
    String _value = note.getValue();
    _builder.append(_value, "");
    StringConcatenation _generateTags = this.generateTags(note);
    _builder.append(_generateTags, "");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _generate(final Task task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul><li");
    {
      boolean _isDone = task.isDone();
      if (_isDone) {
        _builder.append(" class=\"done\"");
      }
    }
    _builder.append(">");
    String _value = task.getValue();
    String _trim = _value.trim();
    _builder.append(_trim, "");
    StringConcatenation _generateTags = this.generateTags(task);
    _builder.append(_generateTags, "");
    _builder.append("</li></ul>\t\t");
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
      StringConcatenation _generateTags = this.generateTags(project);
      _builder.append(_generateTags, "");
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
  
  protected StringConcatenation _generate(final Code code) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<pre><code>");
    _builder.newLine();
    String _value = code.getValue();
    _builder.append(_value, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<pre><code>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generateTags(final Content content) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Tag> _tags = content.getTags();
      for(Tag tag : _tags) {
        _builder.append("<span class=\"tag\">");
        _builder.append(tag, "");
        _builder.append("</span> ");
      }
    }
    return _builder;
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
      throw new IllegalArgumentException();
    }
  }
}