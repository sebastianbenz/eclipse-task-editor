package de.sebastianbenz.task.generator;

import com.google.common.base.Objects;
import de.sebastianbenz.task.Code;
import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.EmptyLine;
import de.sebastianbenz.task.Image;
import de.sebastianbenz.task.Link;
import de.sebastianbenz.task.Note;
import de.sebastianbenz.task.Project;
import de.sebastianbenz.task.Tag;
import de.sebastianbenz.task.Task;
import de.sebastianbenz.task.TaskModel;
import de.sebastianbenz.task.Text;
import de.sebastianbenz.task.TextSegment;
import de.sebastianbenz.task.generator.TaskGenerator;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ConfluenceGenerator implements TaskGenerator {
  public CharSequence generate(final TaskModel taskModel) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Content> _contents = taskModel.getContents();
      for(final Content content : _contents) {
        CharSequence _generate = this.generate(content);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final Note note) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TextSegment> _segments = note.getSegments();
      for(final TextSegment s : _segments) {
        CharSequence _write = this.write(s);
        _builder.append(_write, "");
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final Task task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("*  ");
    {
      boolean _isDone = task.isDone();
      if (_isDone) {
        _builder.append("-");
      }
    }
    {
      EList<TextSegment> _segments = task.getSegments();
      for(final TextSegment s : _segments) {
        CharSequence _write = this.write(s);
        _builder.append(_write, "");
      }
    }
    {
      boolean _isDone_1 = task.isDone();
      if (_isDone_1) {
        _builder.append("-");
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final Project project) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("h");
    int _level = project.getLevel();
    int _plus = (_level + 1);
    _builder.append(_plus, "");
    _builder.append(". ");
    String _value = project.getValue();
    String _escape = this.escape(_value);
    _builder.append(_escape, "");
    return _builder;
  }
  
  protected CharSequence _generate(final EmptyLine emptyLine) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _write(final Text text) {
    String _value = text.getValue();
    return this.escape(_value);
  }
  
  protected CharSequence _write(final Link link) {
    String url = link.getUrl();
    boolean _startsWith = url.startsWith("http://");
    boolean _not = (!_startsWith);
    if (_not) {
      String _plus = ("http://" + url);
      url = _plus;
    }
    String description = "";
    String _description = link.getDescription();
    boolean _equals = Objects.equal(_description, "");
    if (_equals) {
      String _url = link.getUrl();
      description = _url;
    } else {
      String _description_1 = link.getDescription();
      description = _description_1;
    }
    String _description_2 = link.getDescription();
    String _plus_1 = ("[" + _description_2);
    String _plus_2 = (_plus_1 + "|");
    String _url_1 = link.getUrl();
    String _plus_3 = (_plus_2 + _url_1);
    return (_plus_3 + "]");
  }
  
  protected CharSequence _write(final Image image) {
    String _url = image.getUrl();
    String _plus = ("!" + _url);
    String _plus_1 = (_plus + "|title=\"");
    String _description = image.getDescription();
    String _plus_2 = (_plus_1 + _description);
    return (_plus_2 + "\"!");
  }
  
  protected CharSequence _write(final Tag tag) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{color:gray}+");
    _builder.append(tag, "");
    _builder.append("{+}{color}");
    return _builder;
  }
  
  protected CharSequence _generate(final Code code) {
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
    return _replaceAll.replaceAll("\\}", "\\\\}");
  }
  
  public CharSequence generate(final Content code) {
    if (code instanceof Code) {
      return _generate((Code)code);
    } else if (code instanceof EmptyLine) {
      return _generate((EmptyLine)code);
    } else if (code instanceof Note) {
      return _generate((Note)code);
    } else if (code instanceof Project) {
      return _generate((Project)code);
    } else if (code instanceof Task) {
      return _generate((Task)code);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(code).toString());
    }
  }
  
  public CharSequence write(final TextSegment image) {
    if (image instanceof Image) {
      return _write((Image)image);
    } else if (image instanceof Link) {
      return _write((Link)image);
    } else if (image instanceof Tag) {
      return _write((Tag)image);
    } else if (image instanceof Text) {
      return _write((Text)image);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(image).toString());
    }
  }
}
