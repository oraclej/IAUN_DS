package edu.iaun.ds.tree;

public interface Tree<E> {
    int countNodes();
    int countLeaves();
    int height();
    E root();
    E getParent(E e);
    boolean contains(E e);
    boolean isEmpty();
    boolean isStrict();
    boolean isFull();
    boolean isComplete();
    E reshapeToCompleteTree();
    E reshapeToLeftSkewed();
    E reshapeToRightSkewed();
    E reshapeToBST();
    boolean isBST();
    boolean isMaxHeap();
    boolean isMinHeap();
    boolean isBalanced();
    E getLeftChild(E e);
    E getRightChild(E e);
    E[] preOrder();
    E[] inOrder();
    E[] postOrder();
    E[] levelOrder();
    int getDegree();
    E getSibling(E e);
    E[] getAncestors(E e);
    int getLevel(E e);
    boolean isLeftSkewed();
    boolean isRightSkewed();
    boolean isSkewed();

}
