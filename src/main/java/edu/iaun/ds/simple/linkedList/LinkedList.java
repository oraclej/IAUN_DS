package edu.iaun.ds.simple.linkedList;

public interface LinkedList<E> {
    void add(E element);
    void add(int index, E element);
    void remove(int index);
    void clear();
    void removeFirst();
    void removeLast();
    E getFirst();
    E getLast();
    boolean isEmpty();
    int size();
    E get(int index);
    void set(int index, E element);
    boolean contains(E element);
    int indexOf(E element);
    int lastIndexOf(E element);
    int indexOf(E element, int fromIndex);
    E[] toArray();
    void print();
    void printInReverse();

}
