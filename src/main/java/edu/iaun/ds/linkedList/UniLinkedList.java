package edu.iaun.ds.linkedList;

import java.util.StringJoiner;

@SuppressWarnings("unchecked")
public class UniLinkedList<E> implements LinkedList<E> {
    private Node<E> head;
    private int size = 0;

    @Override
    public void add(E element) {
        Node<E> nn = new Node<>(element);
        if (size == 0)
            head = nn;
        else {
            Node<E> p = head;
            while (p.next != null)
                p = p.next;
            p.next = nn;
            size++;
        }

    }

    @Override
    public void add(int index, E element) {
        if (index > size || index < 0)
            throw new LinkedListException("INVALID INDEX " + index);
        Node<E> nn = new Node<>(element);
        if (size == 0)
            head = nn;
        else {
            Node<E> p = head;
            for (int i = 0; i < index - 1; i++)
                p = p.next;
            nn.next = p.next;
            p.next = nn;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (index >= size || index < 0)
            throw new LinkedListException("INVALID INDEX " + index);
        size--;
        if (size == 1)
            head = null;
        else {
            Node<E> p = head;
            for (int i = 0; i < index - 1; i++)
                p = p.next;
            p.next = p.next.next;
        }
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public void removeFirst() {
        if (size == 0)
            throw new LinkedListEmptyException();
        head = head.next;
    }

    @Override
    public void removeLast() {
        if (size == 0)
            throw new LinkedListEmptyException();
        Node<E> p = head;
        for (int i = 0; i < size - 2; i++)
            p = p.next;
        p.next = null;
    }

    @Override
    public E getFirst() {
        if (size == 0)
            return null;
        return head.data;
    }

    @Override
    public E getLast() {
        if (size == 0)
            return null;
        Node<E> p = head;
        while (p.next != null)
            p = p.next;
        return p.data;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        if (index >= size || index < 0)
            throw new LinkedListException("INVALID INDEX");
        Node<E> p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p.data;
    }

    @Override
    public void set(int index, E element) {
        if (index >= size || index < 0)
            throw new LinkedListException("INVALID INDEX");
        Node<E> p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        p.data = element;
    }

    @Override
    public boolean contains(E element) {
        Node<E> p = head;
        while (p != null) {
            if (p.data.equals(element))
                return true;
            p = p.next;
        }
        return false;
    }

    @Override
    public int indexOf(E element) {
        return indexOf(element, 0);
    }

    @Override
    public int lastIndexOf(E element) {
        Node<E> p = head;
        int r = 0;
        int lastR = 0;
        boolean found = false;
        while (p != null) {
            if (p.data.equals(element)) {
                lastR = r;
                found = true;
            }
            p = p.next;
            r++;
        }
        return found ? lastR : -1;
    }

    @Override
    public int indexOf(E element, int fromIndex) {
        if (fromIndex < 0 || fromIndex >= size)
            return -1;
        Node<E> p = head;
        for (int i = 0; i < fromIndex; i++) {
            p = p.next;
        }
        int r = fromIndex;
        while (p != null) {
            if (p.data.equals(element))
                return r;
            p = p.next;
            r++;
        }
        return -1;
    }

    @Override
    public E[] toArray() {
        if (size == 0)
            return null;
        Object[] arr = new Object[size];
        Node<E> p = head;
        int i = 0;
        while (p != null){
            arr[i] = p.data;
            i++;
            p = p.next;
        }

        return (E[]) arr;
    }

    @Override
    public void print() {
        Node<E> p = head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

    @Override
    public void printInReverse() {
        printInReverseRecursive(this.head);
    }

    private static void printInReverseRecursive(Node head){
        if(head != null){
            printInReverseRecursive(head.next);
            System.out.println(head.data);
        }

    }

    static class Node<E> {
        E data;
        Node next;

        public Node(E data) {
            this.data = data;
        }
    }
}
