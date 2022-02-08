package com.madsj.dsl;

import com.madsj.dsl.metamodel.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StateMachineBuilder {

	private List<String> variables = new ArrayList<>();

	private Map<String, State> allStates = new HashMap<>();
	private State currentState = null;
	private String initialState = null;

	//Transition

	private String event;
	private String targetState;

	private Operation operation = Operation.NONE;
	private String operationVariable;
	private int operationValue;

	private Condition condition = Condition.NONE;
	private String conditionVariable;
	private int conditionValue;

	public Machine build() {
		return new Machine(allStates, initialState, variables);
	}

	public StateMachineBuilder state(String name) {
		if (currentState != null) {
			makeTransition();
		}
		currentState = new State(name);
		allStates.put(name, currentState);
		return this;
	}

	public StateMachineBuilder initial() {
		initialState = (String)currentState.getName();
		return this;
	}

	public StateMachineBuilder onEvent(String event) {
		if (targetState != null) makeTransition();
		this.event = event;
		return this;
	}

	public StateMachineBuilder transitionTo(String state) {
		targetState = state;
		return this;
	}

	public StateMachineBuilder integer(String name) {
		variables.add(name);
		return this;
	}

	public StateMachineBuilder set(String var, int i) {
		operation = Operation.SET;
		operationVariable = var;
		operationValue = i;
		return this;
	}

	public StateMachineBuilder increment(String var) {
		operation = Operation.ADD;
		operationVariable = var;
		operationValue = 1;
		return this;
	}

	public StateMachineBuilder decrement(String var) {
		operation = Operation.SUBTRACT;
		operationVariable = var;
		operationValue = 1;
		return this;
	}

	public StateMachineBuilder ifEquals(String var, int i) {
		condition = Condition.EQ;
		conditionVariable = var;
		conditionValue = i;
		makeTransition();
		return this;
	}

	public StateMachineBuilder ifGreaterThan(String var, int i) {
		condition = Condition.GT;
		conditionVariable = var;
		conditionValue = i;
		makeTransition();
		return this;
	}

	public StateMachineBuilder ifLessThan(String var, int i) {
		condition = Condition.LT;
		conditionVariable = var;
		conditionValue = i;
		makeTransition();
		return this;
	}


	private void makeTransition() {
		if (event == null || targetState == null) return;

		if (operation != Operation.NONE && condition != Condition.NONE) {
			currentState.addTransition(new Transition(targetState, event, operation, operationVariable, operationValue, condition, conditionVariable, conditionValue));
		}
		else if (operation == Operation.NONE && condition != Condition.NONE) {
			currentState.addTransition(new Transition(targetState, event, condition, conditionVariable, conditionValue));
		}
		else if (operation != Operation.NONE) {
			currentState.addTransition(new Transition(targetState, event, operation, operationVariable, operationValue));
		}
		else {
			currentState.addTransition(new Transition(targetState, event));
		}

		condition = Condition.NONE;
		operation = Operation.NONE;
		conditionVariable = null;
		operationVariable = null;
		targetState = null;
	}
}
