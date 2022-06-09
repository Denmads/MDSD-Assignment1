package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.iF22.IF22
import dk.sdu.mmmi.mdsd.iF22.Type
import dk.sdu.mmmi.mdsd.iF22.IntType
import dk.sdu.mmmi.mdsd.iF22.StringType
import dk.sdu.mmmi.mdsd.iF22.BooleanType
import dk.sdu.mmmi.mdsd.iF22.Question
import dk.sdu.mmmi.mdsd.iF22.Scenario
import dk.sdu.mmmi.mdsd.iF22.Statement

class Util {
	static def requireExternalInterface(IF22 program) {
		return program.functions.size > 0
	}
	
	static def toJavaType(Type type) {
		if (type instanceof IntType) {
			'int'
		}
		else if (type instanceof StringType) {
			'String'
		}
		else if (type instanceof BooleanType) {
			'boolean'
		}
	}
	
	static def returnTypeOfQuestion(Question question) {
		question.typeAndValidation.eAllContents.filter(Type).toList.get(0)
	}
	
	static def variableName(Question question) {
		'''__«question.name»'''
	}
	
	static def firstStatement(Scenario scenario) {
		scenario.body.filter(Statement).toList.get(0)
	}
}