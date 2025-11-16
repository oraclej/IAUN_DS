package edu.iaun.ds.simple.queue;

public interface Queue <E>{
    int size();
    boolean isEmpty();
    E peek();
    E dequeue();
    void enqueue(E e);
    int capacity();
    void reverse();
    void clear();

}
