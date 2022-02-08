package test;

import java.util.List;

import com.madsj.dsl.StateMachineBuilder;
import com.madsj.dsl.metamodel.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MachineStructureTest {
	private StateMachineBuilder stateMachine;
	
	@BeforeEach
	public void init() {
		stateMachine = new StateMachineBuilder();
	}
	
	@Test
	public void emptyMachine() {
		Machine m = stateMachine.build();
		
		assertTrue(m.getStates().isEmpty());
	}
	
	@Test
	public void states() {
		Machine m = stateMachine.
						state("state 1").
						state("state 2").
						state("state 3").
						build();
		List<State> states = m.getStates();
		assertEquals(3, m.getStates().size());
		assertTrue(states.stream().anyMatch(state -> state.getName().equals("state 1")));
		assertTrue(states.stream().anyMatch(state -> state.getName().equals("state 2")));
		assertTrue(states.stream().anyMatch(state -> state.getName().equals("state 3")));
	}
	
	@Test
	public void initialFirstState() {
		Machine m = stateMachine.
				state("state 1").initial().
				state("state 2").
				state("state 3").
				build();

		assertEquals("state 1", m.getInitialState().getName());
	}
	
	@Test
	public void initialState() {
		Machine m = stateMachine.
				state("state 1").
				state("state 2").initial().
				state("state 3").
				build();

		assertEquals("state 2", m.getInitialState().getName());		
	}
	
	@Test
	public void getState() {
		Machine m = stateMachine.
				state("state 1").
				state("state 2").initial().
				state("state 3").
				build();
		assertEquals("state 2", m.getState("state 2").getName());
	}
	
	@Test
	public void noTransitions() {
		Machine m = stateMachine.
				state("state 1").
				build();
		
		State state = m.getState("state 1");
		List<Transition> transitions = state.getTransitions();
		assertTrue(transitions.isEmpty());
	}
	
	@Test
	public void transitions() {
		Machine m = stateMachine.
					state("state 1").
				onEvent("change transitionTo 2").transitionTo("state 2").
				onEvent("change transitionTo 3").transitionTo("state 3").
					state("state 2").
				onEvent("change transitionTo 3").transitionTo("state 3").
					state("state 3").
					build();
		State state = m.getState("state 1");
		List<Transition> transitions = state.getTransitions();
		assertEquals(2, transitions.size());
		assertTrue(transitions.stream().anyMatch(transition -> transition.getEvent().equals("change transitionTo 2")));
		assertEquals("state 2", state.getTransitionsByEvent("change transitionTo 2").get(0).getTarget());
		assertTrue(transitions.stream().anyMatch(transition -> transition.getEvent().equals("change transitionTo 3")));
		assertEquals("state 3", state.getTransitionsByEvent("change transitionTo 3").get(0).getTarget());
		
		state = m.getState("state 2");
		transitions = state.getTransitions();
		assertEquals(1, transitions.size());
		assertTrue(transitions.stream().anyMatch(transition -> transition.getEvent().equals("change transitionTo 3")));
		assertEquals("state 3", state.getTransitionsByEvent("change transitionTo 3").get(0).getTarget());
	}
	
	@Test
	public void noVariables() {
		Machine m = stateMachine.build();
		assertEquals(0, m.numberOfIntegers());
	}
	
	@Test
	public void addVariable() {
		Machine m = stateMachine.
					integer("var").
					build();
		assertEquals(1, m.numberOfIntegers());
		assertTrue(m.hasInteger("var"));
		assertFalse(m.hasInteger("var 2"));
	}
	
	@Test
	public void transitionSetVariable() {
		Machine m = stateMachine.
					integer("var").
					state("state 1").
				onEvent("SET").transitionTo("state 2").set("var", 42).
					state("state 2").
					build();
		Transition transition = m.getState("state 1").getTransitions().get(0);
		assertSame(transition.getOperation(), Operation.SET);
		assertEquals("var", transition.getOperationVariableName());
	}
	
	@Test
	public void transitionIncrementVariable() {
		Machine m = stateMachine.
					integer("var").
					state("state 1").
				onEvent("SET").transitionTo("state 2").increment("var").
					state("state 2").
					build();
		Transition transition = m.getState("state 1").getTransitions().get(0);
		assertSame(transition.getOperation(), Operation.ADD);
		assertEquals("var", transition.getOperationVariableName());
	}
	
	@Test
	public void transitionDecrementVariable() {
		Machine m = stateMachine.
					integer("var").
					state("state 1").
				onEvent("SET").transitionTo("state 2").decrement("var").
					state("state 2").
					build();
		Transition transition = m.getState("state 1").getTransitions().get(0);
		assertSame(transition.getOperation(), Operation.SUBTRACT);
		assertEquals("var", transition.getOperationVariableName());
	}

	@Test
	public void transitionIfVariableEqual() {
		Machine m = stateMachine.
					integer("var").
					state("state 1").
				onEvent("GO").transitionTo("state 2").ifEquals("var", 42).
					state("state 2").
					build();
		State state = m.getState("state 1");
		
		Transition transition = state.getTransitions().get(0);
		assertTrue(transition.isConditional());
		assertEquals("var", transition.getConditionVariableName());
		assertSame(transition.getCondition(), Condition.EQ);
	}
	
	@Test
	public void transitionIfVariableGreaterThan() {
		Machine m = stateMachine.
					integer("var").
					state("state 1").
				onEvent("GO").transitionTo("state 2").ifGreaterThan("var", 42).
					state("state 2").
					build();
		State state = m.getState("state 1");
		
		Transition transition = state.getTransitions().get(0);
		assertTrue(transition.isConditional());
		assertEquals("var", transition.getConditionVariableName());
		assertSame(transition.getCondition(), Condition.GT);
	}
	
	@Test
	public void transitionIfVariableLessThan() {
		Machine m = stateMachine.
					integer("var").
					state("state 1").
				onEvent("GO").transitionTo("state 2").ifLessThan("var", 42).
					state("state 2").
					build();
		State state = m.getState("state 1");
		
		Transition transition = state.getTransitions().get(0);
		assertTrue(transition.isConditional());
		assertEquals("var", transition.getConditionVariableName());
		assertSame(transition.getCondition(), Condition.LT);
	}

	@Test
	public void transitionIfVariableEqualsAndSet() {
		Machine m = stateMachine.
					integer("var").
					state("state 1").
				onEvent("GO").transitionTo("state 2").set("var", 10).ifEquals("var", 42).
					state("state 2").
					build();
		State state = m.getState("state 1");
		
		Transition transition = state.getTransitions().get(0);
		assertTrue(transition.isConditional());
		assertSame(transition.getOperation(), Operation.SET);
	}
	
	@Test
	public void transitionIfVariableGreaterAndIncrement() {
		Machine m = stateMachine.
					integer("var").
					state("state 1").
				onEvent("GO").transitionTo("state 2").increment("var").ifGreaterThan("var", 42).
					state("state 2").
					build();
		State state = m.getState("state 1");
		
		Transition transition = state.getTransitions().get(0);
		assertTrue(transition.isConditional());
		assertTrue(transition.hasOperation());
	}

	@Test
	public void transitionIfVariableLessAndDecrement() {
		Machine m = stateMachine.
					integer("var").
					state("state 1").
				onEvent("GO").transitionTo("state 2").decrement("var").ifLessThan("var", 42).
					state("state 2").
					build();
		State state = m.getState("state 1");
		
		Transition transition = state.getTransitions().get(0);
		assertTrue(transition.isConditional());
		assertTrue(transition.hasOperation());
	}
}
