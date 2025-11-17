package edu.iaun.ds.stack;

public interface Stack<E> {
    int size();
    boolean isEmpty();
    E peek();
    void push(E e);
    E pop();
    int capacity();
    void reverse();
    void clear();
}
