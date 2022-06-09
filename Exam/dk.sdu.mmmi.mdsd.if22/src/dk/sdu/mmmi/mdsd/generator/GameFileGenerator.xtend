package dk.sdu.mmmi.mdsd.generator

import static extension dk.sdu.mmmi.mdsd.generator.Util.*
import dk.sdu.mmmi.mdsd.iF22.IF22

class GameFileGenerator {
	
	IF22 program
	String packageName
	String firstScenarioClass
	
	new(IF22 program, String packageName, String firstScenarioClass) {
		this.program = program
		this.packageName = packageName
		this.firstScenarioClass = firstScenarioClass
	}
	
	def genFile() {
		'''
		package interactive_fiction.«packageName»;
		
		import java.io.IOException;
		import interactive_fiction.common.*;
		
		public class Game {
			public Scenario start;
			
			public Game(«IF program.requireExternalInterface»External external«ENDIF») {
				this.start = new «firstScenarioClass»(external);
			}
			
			public void play() throws IOException {
				start.interact();
			}
		}
		'''
	}
}