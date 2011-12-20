package de.sebastianbenz.task.generator;

import de.sebastianbenz.task.Code;
import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.EmptyLine;
import de.sebastianbenz.task.Note;
import de.sebastianbenz.task.Project;
import de.sebastianbenz.task.Task;
import de.sebastianbenz.task.TaskModel;
import de.sebastianbenz.task.generator.TaskGenerator;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class MarkdownGenerator implements TaskGenerator {
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
    String _value = note.getValue();
    _builder.append(_value, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generate(final Task task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("* ");
    String _text = task.getText();
    String _substring = _text.substring(1);
    _builder.append(_substring, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generate(final Code code) {
    CharSequence _xblockexpression = null;
    {
      String _value = code.getValue();
      String[] _split = _value.split("\n");
      String[] lines = _split;
      StringConcatenation _builder = new StringConcatenation();
      {
        for(final String line : lines) {
          String _operator_plus = StringExtensions.operator_plus("    ", line);
          _builder.append(_operator_plus, "");
        }
      }
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generate(final Project project) {
      int i = 0;
      StringConcatenation _stringConcatenation = new StringConcatenation();
      StringConcatenation result = _stringConcatenation;
      int _level = project.getLevel();
      boolean _operator_lessEqualsThan = IntegerExtensions.operator_lessEqualsThan(i, _level);
      boolean _while = _operator_lessEqualsThan;
      while (_while) {
        {
          result.append("#");
          int _operator_plus = IntegerExtensions.operator_plus(i, 1);
          i = _operator_plus;
        }
        int _level_1 = project.getLevel();
        boolean _operator_lessEqualsThan_1 = IntegerExtensions.operator_lessEqualsThan(i, _level_1);
        _while = _operator_lessEqualsThan_1;
      }
      String _value = project.getValue();
      String _operator_plus = StringExtensions.operator_plus(" ", _value);
      result.append(_operator_plus);
      return result;
  }
  
  protected CharSequence _generate(final EmptyLine emptyLine) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
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
}
