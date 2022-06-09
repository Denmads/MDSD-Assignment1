package dk.sdu.mmmi.mdsd.generator

import static extension dk.sdu.mmmi.mdsd.generator.Util.*
import dk.sdu.mmmi.mdsd.iF22.IF22
import dk.sdu.mmmi.mdsd.iF22.Scenario
import dk.sdu.mmmi.mdsd.iF22.VariableDef
import dk.sdu.mmmi.mdsd.iF22.Question

class ScenarioFileGenerator {
	
	IF22 program
	Scenario scenario
	String packageName
	
	new(IF22 program, String packageName) {
		this.program = program
		this.packageName = packageName
	}
	
	def setScenario(Scenario scenario) {
		this.scenario = scenario
	}
	
	def getClassName() {
		'''Scenario«scenario.name»'''
	}
	
	def genFile() {
		'''
		package interactive_fiction.«packageName»;
		
		import java.io.IOException;
		import interactive_fiction.common.*;
		
		class «className» extends Scenario {
			«genVars»
			
			«IF program.requireExternalInterface»
				External external;
				
				«genConstructor»
			«ENDIF»
			
			«genInteractMethod»
		}
		'''
	}
	
	def genVars() {
		'''
		«FOR varDecl : scenario.body.filter(VariableDef)»
			«varDecl.type.toJavaType» «varDecl.name»;
		«ENDFOR»
		«FOR question : scenario.body.filter(Question)»
			«question.returnTypeOfQuestion» «question.variableName»;
		«ENDFOR»
		'''
	}
	
	def genConstructor() {
		'''
		«className»(External external) {
			this.external = external;
		}
		'''
	}
	
	def genInteractMethod() {
		'''
		public String interact() throws IOException {
			nextInteraction = "«scenario.firstStatement.name»";
		}
		'''
	}
}