package dk.sdu.mmmi.mdsd.generator

import static extension dk.sdu.mmmi.mdsd.generator.Util.*
import dk.sdu.mmmi.mdsd.iF22.IF22

class GameFileGenerator {
	
	IF22 program
	String packageName
	
	new(IF22 program, String packageName) {
		this.program = program
		this.packageName = packageName
	}
	
	def genFile() {
		'''
		package interactive_fiction.«packageName»;
		
		import java.io.IOException;
		import interactive_fiction.common.*;
		
		public class Game {
			public Scenario start;
			
			public Game(«IF program.requireExternalInterface»External external«ENDIF») {
				this.start = new Scenario«program.scenarios.get(0).name»(«IF program.requireExternalInterface»external«ENDIF»);
			}
			
			public void play() throws IOException {
				start.interact();
			}
		}
		'''
	}
}