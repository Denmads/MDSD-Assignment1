package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.x21.Type
import dk.sdu.mmmi.mdsd.x21.IntType
import dk.sdu.mmmi.mdsd.x21.StringType
import dk.sdu.mmmi.mdsd.x21.CustomType

class Utility {
	static def getJavaType(Type type) {
		type.getType
	}
	
	private static def dispatch getType(IntType t) {
		return "Integer"
	}
	
	private static def dispatch getType(StringType t) {
		return "String"
	}
	
	private static def dispatch getType(CustomType t) {
		'''Data«t.declaration.name.toFirstUpper»'''
	}
	
	static def String memberName(String name) {
		'''_«name»'''
	}
}