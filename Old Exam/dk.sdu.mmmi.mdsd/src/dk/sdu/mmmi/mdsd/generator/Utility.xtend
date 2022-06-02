package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.x21.Type
import dk.sdu.mmmi.mdsd.x21.IntType
import dk.sdu.mmmi.mdsd.x21.StringType
import dk.sdu.mmmi.mdsd.x21.CustomType
import dk.sdu.mmmi.mdsd.x21.DataVariable

class Utility {
	static def getJavaType(Type type) {
		switch type {
			IntType: "Integer",
			StringType: "String",
			CustomType: '''Data«type.declaration.name.toFirstUpper»'''
		}
	}
	
	static def String memberName(String name) {
		'''_«name»'''
	}
}