package edu.iaun.ds.stack;

public class StackByArray<E> implements Stack<E> {
    public Object[] arr;
    public int top;
    public StackByArray(int size) {
        arr = (E[]) new Object[size];
        top = -1;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public void push(E e) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public int capacity() {
        return 0;
    }

    @Override
    public void reverse() {
//        #1
//        E[] temp = (E[]) new Object[arr.length];
//        for (int i = 0; i < this.size(); i++) {
//            temp[i] = this.peek();
//            this.pop();
//        }
//        System.arraycopy(temp, 0, arr, 0, this.size());

//        #2
        int i = 0;
        int j = top;
        while (i < j) {
            Object temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    @Override
    public void clear() {

    }
}
