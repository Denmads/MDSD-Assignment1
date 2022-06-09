package dk.sdu.mmmi.mdsd.generator

import static extension dk.sdu.mmmi.mdsd.generator.Util.*
import static extension dk.sdu.mmmi.mdsd.generator.ExpParser.*
import dk.sdu.mmmi.mdsd.iF22.IF22
import dk.sdu.mmmi.mdsd.iF22.Scenario
import dk.sdu.mmmi.mdsd.iF22.VariableDef
import dk.sdu.mmmi.mdsd.iF22.Question
import dk.sdu.mmmi.mdsd.iF22.Statement
import dk.sdu.mmmi.mdsd.iF22.Announce
import dk.sdu.mmmi.mdsd.iF22.End
import dk.sdu.mmmi.mdsd.iF22.IntType
import dk.sdu.mmmi.mdsd.iF22.StringType
import dk.sdu.mmmi.mdsd.iF22.BooleanType
import dk.sdu.mmmi.mdsd.iF22.Type
import dk.sdu.mmmi.mdsd.iF22.Target
import dk.sdu.mmmi.mdsd.iF22.Exp

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
			«ENDIF»
			
			«IF program.requireExternalInterface || scenario.parameters.size > 0»
				«genConstructor»
			«ENDIF»
			
			«genInteractMethod»
		}
		'''
	}
	
	def genVars() {
		'''
		«FOR param : scenario.parameters»
			«param.type.toJavaType» «param.name»;
		«ENDFOR»
		«FOR varDecl : scenario.body.filter(VariableDef)»
			«varDecl.type.toJavaType» «varDecl.name»;
		«ENDFOR»
		«FOR question : scenario.body.filter(Question)»
			«question.returnTypeOfQuestion.toJavaType» «question.variableName»;
		«ENDFOR»
		'''
	}
	
	def genConstructor() {
		'''
		«className»(«FOR param : scenario.parameters SEPARATOR ", " AFTER ", "»«param.type.toJavaType» «param.name»«ENDFOR»External external) {
			«FOR param : scenario.parameters»
				this.«param.name» = «param.name»;
			«ENDFOR»
			this.external = external;
		}
		'''
	}
	
	def genInteractMethod() {
		'''
		public String interact() throws IOException {
			nextInteraction = "«scenario.firstStatement.name»";
			
			while(true) {
				switch(nextInteraction) {
					«FOR stmt : scenario.body.filter(Statement)»
						case "«stmt.name»":
							«stmt.genLogic»
					«ENDFOR»
				}
			}
		}
		'''
	}
	
	def dispatch genLogic(Announce stmt) {
		'''
		System.out.println("«stmt.body.parse»");
		«stmt.genNextInteraction»
		'''
	}
	
	def dispatch genLogic(Question stmt) {
		'''
		System.out.println("«stmt.body.parse»");
		«IF stmt.returnTypeOfQuestion instanceof IntType»
			try {
				«stmt.variableName» = Integer.parseInt(br.readLine());
				«stmt.genValidation»
				«stmt.genSetVar»
				«stmt.genNextInteraction»
			}
			catch (Exception ex) {
				break;
			}
		«ELSEIF stmt.returnTypeOfQuestion instanceof StringType»
			«stmt.variableName» = br.readLine();
			«stmt.genValidation»
			«stmt.genSetVar»
			«stmt.genNextInteraction»
		«ELSEIF stmt.returnTypeOfQuestion instanceof BooleanType»
			try {
				«stmt.variableName» = Boolean.parseBoolean(br.readLine());
				«stmt.genValidation»
				«stmt.genSetVar»
				«stmt.genNextInteraction»
			}
			catch (Exception ex) {
				break;
			}
		«ENDIF»
		'''
	}
	
	def dispatch genLogic(End stmt) {
		'''
		«IF stmt.body !== null »System.out.println(«stmt.body.parse»);«ENDIF»
		return "«stmt.name»";
		'''
	}
	
	def genValidation(Question stmt) {
		if (stmt.typeAndValidation instanceof Type) {
			return ''
		}
		
		var exp = stmt.typeAndValidation.parse.toString
		exp = exp.replace("this", stmt.variableName).replace("int", stmt.variableName).replace("String", stmt.variableName).replace("boolean", stmt.variableName)
		
		'''
		if (!(«exp»)) {
			break;
		}
		'''
	}
	
	def genSetVar(Question stmt) {
		'''«IF stmt.variable !== null»«stmt.variable.name» = «stmt.variableName»;«ENDIF»'''
	}
	
	def genNextInteraction(Statement stmt) {
		var targets = newArrayList;
		if (stmt instanceof Announce) {
			targets.addAll(stmt.targets)
		}
		else if (stmt instanceof Question) {
			targets.addAll(stmt.targets)
		}
		
		
		'''
		«FOR target : targets»
			«target.genTarget(stmt)»
		«ENDFOR»
		'''
	}
	
	def genTarget(Target target, Statement stmt) {
		'''
		«IF target.condition !== null»if («IF stmt instanceof Question»«target.condition.parseExpWithReplace(stmt)»«ELSE»«target.condition.parse»«ENDIF») {«ENDIF»
			«IF target.destination instanceof Statement»
				nextInteraction = "«target.destination.name»";
				break;
			«ELSEIF target.destination instanceof Scenario»
				calledScenarioEnd = new Scenario«target.destination.name»(«FOR arg : target.arguments SEPARATOR ", " AFTER ", "»«IF stmt instanceof Question»«target.condition.parseExpWithReplace(stmt)»«ELSE»«target.condition.parse»«ENDIF»«ENDFOR»«IF program.requireExternalInterface»external«ENDIF»).interact();
				«FOR endTarget : target.endTargets»
					if (calledScenarioEnd.equals("«endTarget.endStatement.name»")) {
						«endTarget.target.genTarget(stmt)»
					}
				«ENDFOR»
				break;
			«ENDIF»
		«IF target.condition !== null»}«ENDIF»
		'''
	}
	
	def parseExpWithReplace(Exp exp, Question question) {
		exp.parse.toString.replace("this", question.variableName).replace("int", question.variableName).replace("String", question.variableName).replace("boolean", question.variableName)
	}
}