package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.madsj.dsl.MachineInterpreter;
import com.madsj.dsl.StateMachineBuilder;
import com.madsj.dsl.metamodel.Machine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CDPlayerTest {
	
	public MachineInterpreter interpreter;
	
	@BeforeEach
	public void init() {
		StateMachineBuilder stateMachine = new StateMachineBuilder();
		final int NUMBER_TRACKS= 10;
		Machine m = stateMachine.
					integer("track").
					state("STOP").initial().
						onEvent("PLAY").transitionTo("PLAYING").set("track", 1).ifEquals("track", 0).
						onEvent("PLAY").transitionTo("PLAYING").
					state("PLAYING").
						onEvent("STOP").transitionTo("STOP").
						onEvent("PAUSE").transitionTo("PAUSED").
						onEvent("TRACK_END").transitionTo("STOP").ifEquals("track", NUMBER_TRACKS).
						onEvent("TRACK_END").transitionTo("PLAYING").increment("track").
					state("PAUSED").
						onEvent("STOP").transitionTo("STOP").
						onEvent("PLAY").transitionTo("PLAYING").
						onEvent("FORWARD").transitionTo("PAUSED").increment("track").ifLessThan("track", NUMBER_TRACKS + 1).
						onEvent("BACK").transitionTo("PAUSED").decrement("track").ifGreaterThan("track", 1).
						
						
					build();
		interpreter = new MachineInterpreter();
		interpreter.run(m);
	}
	
	@Test
	public void playMusic() {
		interpreter.processEvent("PLAY");
		assertEquals(1, interpreter.getVariable("track"));
		assertEquals("PLAYING", interpreter.getCurrentState().getName());
		
		interpreter.processEvent("TRACK_END");
		assertEquals(2, interpreter.getVariable("track"));
		assertEquals("PLAYING", interpreter.getCurrentState().getName());
		
		interpreter.processEvent("STOP");
		assertEquals(2, interpreter.getVariable("track"));
		assertEquals("STOP", interpreter.getCurrentState().getName());
		
		interpreter.processEvent("PLAY");
		assertEquals(2, interpreter.getVariable("track"));
		assertEquals("PLAYING", interpreter.getCurrentState().getName());
		
		interpreter.processEvent("PAUSE");
		assertEquals(2, interpreter.getVariable("track"));
		assertEquals("PAUSED", interpreter.getCurrentState().getName());
		
		interpreter.processEvent("BACK");
		assertEquals(1, interpreter.getVariable("track"));
		assertEquals("PAUSED", interpreter.getCurrentState().getName());
		
		interpreter.processEvent("FORWARD");
		assertEquals(2, interpreter.getVariable("track"));
		assertEquals("PAUSED", interpreter.getCurrentState().getName());
		
		interpreter.processEvent("FORWARD");
		interpreter.processEvent("FORWARD");
		interpreter.processEvent("FORWARD");
		interpreter.processEvent("FORWARD");
		interpreter.processEvent("FORWARD");
		interpreter.processEvent("FORWARD");
		interpreter.processEvent("FORWARD");
		interpreter.processEvent("FORWARD");
		assertEquals(10, interpreter.getVariable("track"));
		assertEquals("PAUSED", interpreter.getCurrentState().getName());
		
		interpreter.processEvent("PLAY");
		assertEquals(10, interpreter.getVariable("track"));
		assertEquals("PLAYING", interpreter.getCurrentState().getName());
		
		interpreter.processEvent("TRACK_END");
		assertEquals(10, interpreter.getVariable("track"));
		assertEquals("STOP", interpreter.getCurrentState().getName());
		
		
	}
}
