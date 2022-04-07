package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.math.Div
import dk.sdu.mmmi.mdsd.math.Expression
import dk.sdu.mmmi.mdsd.math.ExternalCall
import dk.sdu.mmmi.mdsd.math.LetBinding
import dk.sdu.mmmi.mdsd.math.MathNumber
import dk.sdu.mmmi.mdsd.math.Minus
import dk.sdu.mmmi.mdsd.math.Mult
import dk.sdu.mmmi.mdsd.math.Parenthesis
import dk.sdu.mmmi.mdsd.math.Plus
import dk.sdu.mmmi.mdsd.math.VariableUse
import java.util.HashMap
import java.util.Map
import java.util.Stack
import java.util.List
import java.util.Set
import java.util.HashSet
import org.eclipse.emf.ecore.EObject

/*
 * Generates all statements for one var function
 */
class ExpressionGenerator {
	
	static Map<String, Stack<Expression>> localVars = new HashMap();
	static Stack<LetBinding> letStatements = new Stack();
	static Map<LetBinding, String> letNames = new HashMap();
	static int letNum = 1;
	
	static Set<String> localDeclared = new HashSet();
	
	static def void reset() {
		localVars.clear();
		letStatements.clear();
		letNames.clear();
		letNum = 1;
		localDeclared.clear();
	}
	
	static def String generateStatements(Expression exp) {
		reset();
		//Scans the expression for let statements, this allwos us to give the a name, which they can be referenced by in other expressions
		exp.scanForLetBindings
		
		//Generates the variable declarations and the body for each let statement in the correct order
		var lets = ""
		while (letStatements.size > 0) {
			lets += letStatements.pop().generateLetCode
		}
		
		return '''
		«lets»
		return «exp.generateJavaCode(null)»;
		'''
	}
	
	private static def void scanForLetBindings(Expression exp) {
		switch (exp) {
			Plus: {
				exp.left.scanForLetBindings
				exp.right.scanForLetBindings
			}
			Minus: {
				exp.left.scanForLetBindings
				exp.right.scanForLetBindings
			}
			Mult: {
				exp.left.scanForLetBindings
				exp.right.scanForLetBindings
			}
			Div: {
				exp.left.scanForLetBindings
				exp.right.scanForLetBindings
			}
			Parenthesis: exp.exp.scanForLetBindings
			ExternalCall: {
				exp.arguments.forEach[it.scanForLetBindings]
			}
			LetBinding: {
				System.out.println("adding " + exp.name)
				exp.addToLocalVars
				letStatements.push(exp)
				System.out.println(letStatements.size);
				letNames.put(exp, "let" + letNum);
				letNum++;
				exp.binding.scanForLetBindings
				exp.body.scanForLetBindings
			}
		}
	}
	
	private static def void addToLocalVars(LetBinding bind) {
		if (!localVars.containsKey(bind.name)) {
			localVars.put(bind.name, new Stack());
		}
		
		localVars.get(bind.name).push(bind.binding);
	}
	
	private static def Set<String> listLocalVars(EObject eobj) {
		val available = newHashSet()
		
		var obj = eobj.eContainer 
		while (obj !== null) {
			switch (obj) {
				LetBinding: {
					available.add(obj.name)
					obj = obj.eContainer
				}
				default: obj = obj.eContainer
			}
		}
		
		return available
	}
	
	private static def String generateLetCode(LetBinding bind) {
		val availableVars = bind.body.listLocalVars
		val required = bind.eAllContents.filter(VariableUse).map[it.ref.name].toSet
		var code = "";
		
		for (String reqVar : required) {
			if (availableVars.contains(reqVar) && localVars.containsKey(reqVar)){
				val exp = localVars.get(reqVar).pop()
				code += '''«IF !localDeclared.contains(reqVar)»int «ENDIF»«reqVar» = «exp.generateJavaCode(bind.listLocalVars)»;''' + "\n"
				localDeclared.add(reqVar);
				if (localVars.get(reqVar).size == 0) {
					localVars.remove(reqVar)
				}
			}
		}
		
		code += '''int «letNames.get(bind)» = «generateJavaCode(bind.body, bind.body.listLocalVars)»''' + ";\n"
		
		return code
	}
	
	private static def String generateJavaCode(Expression exp, Set<String> localVars) {
		return switch (exp) {
			Plus: '''«exp.left.generateJavaCode(localVars)» + «exp.right.generateJavaCode(localVars)»'''
			Minus: '''«exp.left.generateJavaCode(localVars)» - «exp.right.generateJavaCode(localVars)»'''
			Mult: '''«exp.left.generateJavaCode(localVars)» * «exp.right.generateJavaCode(localVars)»'''
			Div: '''«exp.left.generateJavaCode(localVars)» / «exp.right.generateJavaCode(localVars)»'''
			MathNumber: '''«exp.value»'''
			Parenthesis: '''(«exp.exp.generateJavaCode(localVars)»)'''
			VariableUse: '''«IF localVars === null || !localVars.contains(exp.ref.name)»this.«ENDIF»«exp.ref.name»'''
			ExternalCall: '''external.«exp.method.name»(«FOR arg : exp.arguments SEPARATOR ", "»«arg.generateJavaCode(localVars)»«ENDFOR»)'''
			LetBinding: '''«letNames.get(exp)»'''
		}
	}
}