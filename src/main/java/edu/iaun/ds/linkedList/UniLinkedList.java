package edu.iaun.ds.linkedList;

public class UniLinkedList<E> implements LinkedList<E>{
    private Node<E> head;
    private int size = 0;

    @Override
    public void add(E element) {
        Node<E> nn = new Node<>(element);
        if(size == 0)
            head = nn;
        else{
            Node<E> p = head;
            while (p.next != null)
                p = p.next;
            p.next = nn;
            size++;
        }

    }

    @Override
    public void add(int index, E element) {
        if(index > size || index < 0)
            throw new LinkedListException("INVALID INDEX " + index);
        Node<E> nn = new Node<>(element);
        size++;
        if(size == 0)
            head = nn;
        else{
            Node<E> p = head;
            for (int i = 0; i < index-1; i++)
                p = p.next;
            nn.next = p.next;
            p.next = nn;
        }

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void clear() {

    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void set(int index, E element) {

    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public int indexOf(E element) {
        return 0;
    }

    @Override
    public int lastIndexOf(E element) {
        return 0;
    }

    @Override
    public int indexOf(E element, int fromIndex) {
        return 0;
    }

    @Override
    public E[] toArray() {
        return null;
    }

    @Override
    public void print() {

    }

    @Override
    public void printInReverse() {

    }

    class Node<E>{
        E data;
        Node next;

        public Node(E data) {
            this.data = data;
        }
    }
}
