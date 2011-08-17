package de.sebastianbenz.task.generator;

import com.google.common.collect.Iterables;
import de.sebastianbenz.task.Code;
import de.sebastianbenz.task.Container;
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
import java.util.Iterator;
import org.apache.commons.lang.StringEscapeUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
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
    _builder.append(".tag{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("color: gray;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("text-decoration:underline;");
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
    _builder.append("text-indent: -2em;");
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
    _builder.newLine();
    _builder.append("</head> ");
    _builder.newLine();
    _builder.append("<body> ");
    _builder.newLine();
    StringConcatenation _generateChildren = this.generateChildren(taskModel);
    _builder.append(_generateChildren, "");
    _builder.newLineIfNotEmpty();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("<link href=\"http://alexgorbatchev.com/pub/sh/current/styles/shCore.css\" rel=\"stylesheet\" type=\"text/css\" />");
    _builder.newLine();
    _builder.append("<link href=\"http://alexgorbatchev.com/pub/sh/current/styles/shThemeDefault.css\" rel=\"stylesheet\" type=\"text/css\" />");
    _builder.newLine();
    _builder.append("<script src=\"http://alexgorbatchev.com/pub/sh/current/scripts/shCore.js\" type=\"text/javascript\"></script>");
    _builder.newLine();
    _builder.append("<script src=\"http://alexgorbatchev.com/pub/sh/current/scripts/shAutoloader.js\" type=\"text/javascript\"></script>");
    _builder.newLine();
    _builder.append("<script type=\"text/javascript\">");
    _builder.newLine();
    _builder.append("function path()");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("var args = arguments,");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("result = []");
    _builder.newLine();
    _builder.append("      ");
    _builder.append(";");
    _builder.newLine();
    _builder.append("       ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("for(var i = 0; i < args.length; i++)");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("result.push(args[i].replace(\'@\', \'http://alexgorbatchev.com/pub/sh/current/scripts/\'));");
    _builder.newLine();
    _builder.append("       ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return result");
    _builder.newLine();
    _builder.append("};");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("SyntaxHighlighter.autoloader.apply(null, path(");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\'cpp c                  @shBrushCpp.js\',");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\'css                    @shBrushCss.js\',");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\'java                   @shBrushJava.js\',");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\'js jscript javascript  @shBrushJScript.js\',");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\'py python              @shBrushPython.js\',");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\'ruby rails ror rb      @shBrushRuby.js\',");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\'scala                  @shBrushScala.js\',");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\'xml xhtml xslt html    @shBrushXml.js\'");
    _builder.newLine();
    _builder.append("));");
    _builder.newLine();
    _builder.append("SyntaxHighlighter.all();");
    _builder.newLine();
    _builder.append("</script>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generateChildren(final Container container) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Content> _children = container.getChildren();
      for(final Content child : _children) {
        StringConcatenation _generate = this.generate(child);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _generate(final Note note) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p class=\"note\">");
    StringConcatenation _write = this.write(note);
    _builder.append(_write, "");
    _builder.newLineIfNotEmpty();
    StringConcatenation _generateChildren = this.generateChildren(note);
    _builder.append(_generateChildren, "");
    _builder.newLineIfNotEmpty();
    _builder.append("</p>");
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _generate(final Task task) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isFirst = this.isFirst(task);
      if (_isFirst) {
        _builder.append("<ul>");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("<li");
    {
      boolean _isDone = task.isDone();
      if (_isDone) {
        _builder.append(" class=\"done\"");
      }
    }
    _builder.append(">");
    StringConcatenation _write = this.write(task);
    _builder.append(_write, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    StringConcatenation _generateChildren = this.generateChildren(task);
    _builder.append(_generateChildren, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</li>");
    _builder.newLine();
    {
      boolean _isLast = this.isLast(task);
      if (_isLast) {
        _builder.append("</ul>\t\t");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public boolean isFirst(final Task task) {
    {
      Container _parent = task.getParent();
      EList<Content> _children = _parent.getChildren();
      Iterable<Task> _filter = Iterables.<Task>filter(_children, de.sebastianbenz.task.Task.class);
      Iterable<Task> tasks = _filter;
      Iterator<Task> _iterator = tasks.iterator();
      Task _next = _iterator.next();
      boolean _operator_equals = ObjectExtensions.operator_equals(_next, task);
      return _operator_equals;
    }
  }
  
  public boolean isLast(final Task task) {
    {
      Container _parent = task.getParent();
      EList<Content> _children = _parent.getChildren();
      EList<Content> siblings = _children;
      int _size = siblings.size();
      int _operator_minus = IntegerExtensions.operator_minus(((Integer)_size), ((Integer)1));
      Content _get = siblings.get(_operator_minus);
      boolean _operator_equals = ObjectExtensions.operator_equals(_get, task);
      return _operator_equals;
    }
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
      StringConcatenation _write = this.write(project);
      _builder.append(_write, "");
      _builder.append("</h");
      _builder.append(level, "");
      _builder.append(">");
      _builder.newLineIfNotEmpty();
      StringConcatenation _generateChildren = this.generateChildren(project);
      _builder.append(_generateChildren, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected StringConcatenation _generate(final EmptyLine emptyLine) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<br>");
    _builder.newLine();
    StringConcatenation _generateChildren = this.generateChildren(emptyLine);
    _builder.append(_generateChildren, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _generate(final Code code) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<pre class=\"brush: ");
    String _lang = code.getLang();
    _builder.append(_lang, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    String _value = code.getValue();
    String _escapeHtml = StringEscapeUtils.escapeHtml(_value);
    _builder.append(_escapeHtml, "");
    _builder.newLineIfNotEmpty();
    _builder.append("</pre>");
    _builder.newLine();
    StringConcatenation _generateChildren = this.generateChildren(code);
    _builder.append(_generateChildren, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation write(final Content content) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TextSegment> _segments = content.getSegments();
      for(final TextSegment s : _segments) {
        CharSequence _write = this.write(s);
        _builder.append(_write, "");
      }
    }
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _write(final Text text) {
    String _value = text.getValue();
    return _value;
  }
  
  protected CharSequence _write(final Link link) {
    {
      String _url = link.getUrl();
      String url = _url;
      boolean _startsWith = url.startsWith("http://");
      boolean _operator_not = BooleanExtensions.operator_not(_startsWith);
      if (_operator_not) {
        String _operator_plus = StringExtensions.operator_plus("http://", url);
        url = _operator_plus;
      }
      String description = "";
      String _description = link.getDescription();
      boolean _operator_equals = ObjectExtensions.operator_equals(_description, "");
      if (_operator_equals) {
        String _url_1 = link.getUrl();
        description = _url_1;
      } else {
        String _description_1 = link.getDescription();
        description = _description_1;
      }
      String _operator_plus_1 = StringExtensions.operator_plus("<a href=\"", url);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "\">");
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, description);
      String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, "</a>");
      return _operator_plus_4;
    }
  }
  
  protected CharSequence _write(final Image image) {
    String _url = image.getUrl();
    String _operator_plus = StringExtensions.operator_plus("<p><img src=\"", _url);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "\" title=\"");
    String _description = image.getDescription();
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _description);
    String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, "\" alt=\"");
    String _description_1 = image.getDescription();
    String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, _description_1);
    String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, "\"/></p>");
    return _operator_plus_5;
  }
  
  protected CharSequence _write(final Tag tag) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<span class=\"tag\">");
    _builder.append(tag, "");
    _builder.append("</span>");
    _builder.newLineIfNotEmpty();
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
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(code).toString());
    }
  }
  
  public CharSequence write(final TextSegment image) {
    if ((image instanceof Image)) {
      return _write((Image)image);
    } else if ((image instanceof Link)) {
      return _write((Link)image);
    } else if ((image instanceof Tag)) {
      return _write((Tag)image);
    } else if ((image instanceof Text)) {
      return _write((Text)image);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        java.util.Arrays.<Object>asList(image).toString());
    }
  }
}