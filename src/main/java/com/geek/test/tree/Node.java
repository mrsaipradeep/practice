package com.geek.test.tree;

public class Node {

    private int data;
    private Node left;
    private Node right;

    Node(int data) {
        this.data = data;
    }

    int getData() {
        return data;
    }

    void setData(int data) {
        this.data = data;
    }

    Node getLeft() {
        return left;
    }

    void setLeft(Node left) {
        this.left = left;
    }

    Node getRight() {
        return right;
    }

    void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
