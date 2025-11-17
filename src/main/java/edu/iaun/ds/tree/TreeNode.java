package edu.iaun.ds.tree;

public interface TreeNode<E> {
    boolean isLeaf();
    E[]  getChildren(E e);
    int getDegree(E e);
    E getLeftChild();
    E getRightChild();
    E getSmallestChild();
    E getLargestChild();
}
