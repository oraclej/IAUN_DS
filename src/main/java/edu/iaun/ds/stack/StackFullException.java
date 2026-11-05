package edu.iaun.ds.stack;

public class StackFullException extends StackException {
    public StackFullException(String message) {
        super(message);
    }

    public StackFullException() {
        super("STACK IS FULL");
    }
}
