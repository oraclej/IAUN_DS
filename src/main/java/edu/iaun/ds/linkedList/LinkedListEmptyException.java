package edu.iaun.ds.linkedList;

public class LinkedListEmptyException extends LinkedListException {
    public LinkedListEmptyException(String message) {
        super(message);
    }

    public LinkedListEmptyException() {
        super("LINKED LIST IS EMPTY");
    }
}
