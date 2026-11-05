package edu.iaun.ds.stack;

public class StackEmptyException extends StackException {
    public StackEmptyException(String message) {
        super(message);
    }

    public StackEmptyException() {
        super("STACK IS EMPTY");
    }
}
