package com.madsj.dsl.metamodel;

import com.madsj.dsl.RuntimeContext;

public class Transition {

	private String target;
	private String event;

	private Operation operation = Operation.NONE;
	private String operationVariable;
	private int operationValue;

	private Condition condition = Condition.NONE;
	private String conditionVariable;
	private int conditionValue;

	public Transition(String target, String event, Operation operation, String operationVariable, int operationValue, Condition condition, String conditionVariable, int conditionValue) {
		this.target = target;
		this.event = event;
		this.operation = operation;
		this.operationVariable = operationVariable;
		this.operationValue = operationValue;
		this.condition = condition;
		this.conditionVariable = conditionVariable;
		this.conditionValue = conditionValue;
	}

	public Transition(String target, String event, Operation operation, String operationVariable, int operationValue) {
		this.target = target;
		this.event = event;
		this.operation = operation;
		this.operationVariable = operationVariable;
		this.operationValue = operationValue;
	}

	public Transition(String target, String event, Condition condition, String conditionVariable, int conditionValue) {
		this.target = target;
		this.event = event;
		this.condition = condition;
		this.conditionVariable = conditionVariable;
		this.conditionValue = conditionValue;
	}

	public Transition(String target, String event) {
		this.target = target;
		this.event = event;
	}

	public Object getEvent() {
		return event;
	}

	public String getTarget() {
		return target;
	}

	public boolean hasOperation() {
		return operation != Operation.NONE;
	}

	public Operation getOperation() {
		return operation;
	}

	public String getOperationVariableName() {
		return operationVariable;
	}

	public void doOperation(RuntimeContext runtimeState) {
		switch (operation) {
			case SET -> runtimeState.setVar(operationVariable, operationValue);
			case ADD -> runtimeState.modifyVar(operationVariable, operationValue);
			case SUBTRACT -> runtimeState.modifyVar(operationVariable, -operationValue);
		}
	}

	public boolean isConditional() {
		return condition != Condition.NONE;
	}

	public Condition getCondition() {
		return condition;
	}

	public String getConditionVariableName() {
		return conditionVariable;
	}

	public boolean isConditionFulfilled(RuntimeContext runtimeState) {
		return switch (condition) {
			case EQ -> runtimeState.getVar(conditionVariable) == conditionValue;
			case GT -> runtimeState.getVar(conditionVariable) > conditionValue;
			case LT -> runtimeState.getVar(conditionVariable) < conditionValue;
			default -> true;
		};
	}

}
