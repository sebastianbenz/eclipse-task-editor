package de.sebastianbenz.task.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import static com.google.common.collect.Iterables.*
import de.sebastianbenz.task.TaskModel
import de.sebastianbenz.task.Content
import de.sebastianbenz.task.Task
import de.sebastianbenz.task.Code
import de.sebastianbenz.task.Note
import de.sebastianbenz.task.Project
import de.sebastianbenz.task.EmptyLine
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import de.sebastianbenz.task.Text
import de.sebastianbenz.task.Link
import de.sebastianbenz.task.Image
import de.sebastianbenz.task.Tag

class ConfluenceGenerator implements de.sebastianbenz.task.generator.TaskGenerator {
	   
	override StringConcatenation generate(TaskModel taskModel)
		'''
		«FOR content : taskModel.contents»
			«generate(content)»
		«ENDFOR»
		''' 
	
	def dispatch generate(Note note)
		''' 
		«FOR s : note.segments»«write(s)»«ENDFOR»'''
	
	def dispatch generate(Task task)
		'''
		*  «IF task.done»-«ENDIF»«FOR s : task.segments»«write(s)»«ENDFOR»«IF task.done»-«ENDIF»'''
	
	def dispatch generate(Project project)
		'''
		h«project.level + 1». «escape(project.value)»'''
	
	def dispatch generate(EmptyLine emptyLine)
		'''
		
		'''
		
	def dispatch write(Text text){
		return escape(text.value)
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
		return '[' + link.description + '|' + link.url + ']'
	}	
	
	def dispatch write(Image image){
		return '!' + image.url + '|title="' + image.description + '"!'
	}	
	
	def dispatch write(Tag tag)'''{color:gray}+«tag»{+}{color}'''
	
	def dispatch generate(Code code)''' 
		{code}
		«code.value»
		{code}
	'''
	
	def escape(String string){
		return string.replaceAll("\\{", "\\\\{").replaceAll("\\}", "\\\\}")
	}
}