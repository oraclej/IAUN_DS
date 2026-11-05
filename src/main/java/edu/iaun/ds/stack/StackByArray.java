package edu.iaun.ds.stack;

public class StackByArray<E> implements Stack<E> {
    private int top;
    private final int MAX_SIZE;
    private Object[] arr;

    public StackByArray(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        top = -1;
        arr = new Object[MAX_SIZE];
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public E peek() {
        if (top == -1)
            throw new StackEmptyException();
        return (E) arr[top];
    }

    @Override
    public void push(E e) {
        if (top == arr.length - 1)
            throw new StackFullException();
        top++;
        arr[top] = e;
    }

    @Override
    public E pop() {
        if (top == -1)
            throw new StackEmptyException();
        top--;
        return (E) arr[top + 1];
    }

    @Override
    public int capacity() {
        return MAX_SIZE;
    }

    @Override
    public void reverse() {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            Object temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    @Override
    public void clear() {
        top = -1;
    }
}
