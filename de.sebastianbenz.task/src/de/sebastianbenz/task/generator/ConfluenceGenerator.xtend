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

class ConfluenceGenerator implements de.sebastianbenz.task.generator.TaskGenerator {
	   
	override StringConcatenation generate(TaskModel taskModel)
		'''
		«FOR content : taskModel.contents»
			«generate(content)»«FOR tag : content.tags»{color:gray}«tag»{color} «ENDFOR»
		«ENDFOR»
		''' 
	
	def dispatch generate(Note note)
		'''
		{color:gray}«escape(note.value)»{color}'''
	
	def dispatch generate(Task task)
		'''
		*  «IF task.done»-«ENDIF»«escape(task.value.trim())» «IF task.done»-«ENDIF»'''
	
	def dispatch generate(Project project)
		'''
		h«project.level + 1». «escape(project.value)»'''
	
	def dispatch generate(EmptyLine emptyLine)
		'''
		
		'''
	
	def dispatch generate(Code code)
		''' 
		{code}
		«code.value»
		{code}
		'''
	
	def escape(String string){
		return string.replaceAll("\\{", "\\\\{").replaceAll("\\}", "\\\\}")
	}
}
 