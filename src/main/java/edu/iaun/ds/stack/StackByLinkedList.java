package edu.iaun.ds.stack;

public class StackByLinkedList<E> implements Stack<E>{
    private int size = 0;
    private Node<E> top;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E peek() {
        if(size == 0)
            throw new StackEmptyException();
        return top.data;
    }

    @Override
    public void push(E e) {
        Node<E> nn = new Node<>(e);
        size++;
        nn.next = top;
        top =  nn;
    }

    @Override
    public E pop() {
        if(size == 0)
            throw new StackEmptyException();
        size--;
        E e = top.data;;
        top = top.next;
        return e;
    }

    @Override
    public int capacity() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void reverse() {
        Node<E> prev = null;
        Node<E> curr = top;
        while (curr != null) {
            Node<E> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        top = prev;
    }


    @Override
    public void clear() {
        top = null;
        size=0;
    }

    class Node<E>{
        E data;
        Node next;

        public Node(E data) {
            this.data = data;
        }
    }
}
