package dk.sdu.mmmi.mdsd.generator

import static extension dk.sdu.mmmi.mdsd.generator.Util.*
import dk.sdu.mmmi.mdsd.iF22.IF22
import dk.sdu.mmmi.mdsd.iF22.Function

class ExternalFuncInterfaceGenerator {
	
	IF22 program
	String packageName
	
	int paramCounter = 0
	
	new(IF22 program, String packageName) {
		this.program = program
		this.packageName = packageName
	}
	
	def genFile() {
		'''
		package interactive_story.«packageName»;
		
		public interface External {
			«FOR func : program.eAllContents.filter(Function).toIterable»
				public «func.returnType.toJavaType» «func.name»(«FOR paramType : func.parameterTypes SEPARATOR ", "»«paramType.toJavaType» param«paramCounter++»«ENDFOR»);
			«ENDFOR»
		}
		'''
	}
}