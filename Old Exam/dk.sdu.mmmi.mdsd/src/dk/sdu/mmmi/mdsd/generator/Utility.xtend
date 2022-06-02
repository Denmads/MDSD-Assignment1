package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.x21.Type
import dk.sdu.mmmi.mdsd.x21.IntType
import dk.sdu.mmmi.mdsd.x21.StringType
import dk.sdu.mmmi.mdsd.x21.CustomType

class Utility {
	static def getJavaType(Type type) {
		switch type {
			IntType: "Integer",
			StringType: "String",
			CustomType: '''Data«type.declaration.name.toFirstUpper»'''
		}
	}
}