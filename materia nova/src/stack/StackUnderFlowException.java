package stack;

public class StackUnderFlowException extends Exception {
	public StackUnderFlowException() {
		super("Stack is empty");
	}
}
