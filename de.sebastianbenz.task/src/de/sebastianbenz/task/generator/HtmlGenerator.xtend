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

class HtmlGenerator implements de.sebastianbenz.task.generator.TaskGenerator {
	   
	override StringConcatenation generate(TaskModel taskModel)'''
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
		  'applescript            @shBrushAppleScript.js',
		  'actionscript3 as3      @shBrushAS3.js',
		  'bash shell             @shBrushBash.js',
		  'coldfusion cf          @shBrushColdFusion.js',
		  'cpp c                  @shBrushCpp.js',
		  'c# c-sharp csharp      @shBrushCSharp.js',
		  'css                    @shBrushCss.js',
		  'delphi pascal          @shBrushDelphi.js',
		  'diff patch pas         @shBrushDiff.js',
		  'erl erlang             @shBrushErlang.js',
		  'groovy                 @shBrushGroovy.js',
		  'java                   @shBrushJava.js',
		  'jfx javafx             @shBrushJavaFX.js',
		  'js jscript javascript  @shBrushJScript.js',
		  'perl pl                @shBrushPerl.js',
		  'php                    @shBrushPhp.js',
		  'text plain             @shBrushPlain.js',
		  'py python              @shBrushPython.js',
		  'ruby rails ror rb      @shBrushRuby.js',
		  'sass scss              @shBrushSass.js',
		  'scala                  @shBrushScala.js',
		  'sql                    @shBrushSql.js',
		  'vb vbnet               @shBrushVb.js',
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
		<p class="note">«note.value»«generateTags(note)»
		«generateChildren(note)»
		</p>
	'''
	
	def dispatch generate(Task task)'''
		«IF isFirst(task)»
		<ul>
		«ENDIF»
			<li«IF task.done» class="done"«ENDIF»>«task.value.trim()»«generateTags(task)»
			«generateChildren(task)»
			</li>
		«IF isLast(task)»
		</ul>		
		«ENDIF»
	'''
	
	def isFirst(Task task){
		return task.parent.children.get(0) == task
	}
	def isLast(Task task){
		var siblings = task.parent.children
		return siblings.get(siblings.size - 1) == task
	}
	
	def dispatch generate(Project project){
		var level = project.level + 1
		'''
		<h«level»>«project.value»«generateTags(project)»</h«level»>
		«generateChildren(project)»
		'''
	}
	
	def dispatch generate(EmptyLine emptyLine)
		'''
		«generateChildren(emptyLine)»
		'''
	
	def dispatch generate(Code code)
		''' 
		<pre class="brush: «code.lang»">
		«StringEscapeUtils::escapeHtml(code.value)»
		</pre>
		«generateChildren(code)»
		'''
	
	
	def generateTags(Content content){
		'''«FOR tag : content.tags»<span class="tag">«tag»</span> «ENDFOR»'''
	}
}
 