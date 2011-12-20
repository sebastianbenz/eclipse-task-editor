package de.sebastianbenz.task.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import static com.google.common.collect.Iterables.*
import de.sebastianbenz.task.TaskModel
import de.sebastianbenz.task.Content
import de.sebastianbenz.task.Task
import de.sebastianbenz.task.Note
import de.sebastianbenz.task.Code
import de.sebastianbenz.task.Project
import de.sebastianbenz.task.EmptyLine
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import de.sebastianbenz.task.Container
import org.apache.commons.lang.StringEscapeUtils
import de.sebastianbenz.task.TextSegment
import de.sebastianbenz.task.Link
import de.sebastianbenz.task.Tag
import de.sebastianbenz.task.Text
import de.sebastianbenz.task.Image

class HtmlGenerator implements de.sebastianbenz.task.generator.TaskGenerator {
	    
	override generate(TaskModel taskModel)'''
		<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> 
		<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en"> 
		<head> 
		<style type="text/css">
			.done {
				text-decoration: line-through;
			}
			.tag{
				color: gray;
				text-decoration:underline;
			}
			body {
			  font-family: "Helvetica Neue", helvetica, arial, sans-serif;
			  font-size: 14px;
			  line-height: 1.4em;
			  color: #333333;
			}
			ul{
				list-style: none;
				margin-left: 0;
				text-indent: -2em;
			}
			ul li:before {
				content: "\2D";	
				margin-right: 0.5em;
			}
			.note{
				color: gray;
			}
			.syntaxhighlighter { 
				padding-bottom: 1px;
			}
		</style
		
		</head> 
		<body> 
		«generateChildren(taskModel)»
		</body>
		<link href="http://alexgorbatchev.com/pub/sh/current/styles/shCore.css" rel="stylesheet" type="text/css" />
		<link href="http://alexgorbatchev.com/pub/sh/current/styles/shThemeDefault.css" rel="stylesheet" type="text/css" />
		<script src="http://alexgorbatchev.com/pub/sh/current/scripts/shCore.js" type="text/javascript"></script>
		<script src="http://alexgorbatchev.com/pub/sh/current/scripts/shAutoloader.js" type="text/javascript"></script>
		<script type="text/javascript">
		function path()
		{
		  var args = arguments,
		      result = []
		      ;
		       
		  for(var i = 0; i < args.length; i++)
		      result.push(args[i].replace('@', 'http://alexgorbatchev.com/pub/sh/current/scripts/'));
		       
		  return result
		};
		 
		SyntaxHighlighter.autoloader.apply(null, path(
		  'cpp c                  @shBrushCpp.js',
		  'css                    @shBrushCss.js',
		  'java                   @shBrushJava.js',
		  'js jscript javascript  @shBrushJScript.js',
		  'py python              @shBrushPython.js',
		  'ruby rails ror rb      @shBrushRuby.js',
		  'scala                  @shBrushScala.js',
		  'xml xhtml xslt html    @shBrushXml.js'
		));
		SyntaxHighlighter.all();
		</script>
		</html>
		''' 
	
	def generateChildren(Container container)'''
		«FOR child : container.children»
			«generate(child)»
		«ENDFOR»
	'''
	
	def dispatch generate(Note note)'''
		<p class="note">«write(note)»
		«generateChildren(note)»
		</p>
	'''
	
	def dispatch generate(Task task)'''
		«IF isFirst(task)»
		<ul>
		«ENDIF»
			<li«IF task.done» class="done"«ENDIF»>«write(task)»
			«generateChildren(task)»
			</li>
		«IF isLast(task)»
		</ul>		
		«ENDIF»
	'''
	
	def isFirst(Task task){
		var tasks = filter(task.parent.children, typeof(Task))
		return tasks.iterator.next == task
	}
	def isLast(Task task){
		var siblings = task.parent.children
		return siblings.get(siblings.size - 1) == task
	}
	
	def dispatch generate(Project project){
		var level = project.level + 1
		'''
		<h«level»>«write(project)»</h«level»>
		«generateChildren(project)»
		'''
	}
	
	def dispatch generate(EmptyLine emptyLine)'''
		<br>
		«generateChildren(emptyLine)»
	'''
	
	def dispatch generate(Code code)''' 
		<pre class="brush: «code.lang»; toolbar: false">
		«StringEscapeUtils::escapeHtml(code.value)»
		</pre>
		«generateChildren(code)»
	'''
	
	def write(Content content)'''
		«FOR s : content.segments»«write(s)»«ENDFOR»	
	'''
	
	def dispatch write(Text text){
		return text.value
	}
	
	def dispatch write(Link link){
		var url = link.url
		if(!url.startsWith("http://")){
			url = "http://" + url;
		}
		var description = ""
		if(link.description == ""){
			description = link.url 
		}else{
			description = link.description
		}
		return '<a href="' + url + '">' + description + '</a>' 
	}	
	
	def dispatch write(Image image){
		return '<p><img src="' + image.url + '" title="' + image.description + '" alt="' + image.description + '"/></p>' 
	}	
	
	def dispatch write(Tag tag)'''
		<span class="tag">«tag»</span>
	'''
	
} 

 