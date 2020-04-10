package com.geek.test.tree;

import static com.geek.test.tree.TreeUtil.insertNode;
import static com.geek.test.tree.TreeUtil.print2D;

// Depth first search
public class DFS {

    //pre-order strategy
    private static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.getData() + " ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    //in-order strategy
    private static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.getLeft());
        System.out.print(root.getData() + " ");
        inOrder(root.getRight());
    }

    //post-order strategy
    private static void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getData() + " ");
    }

    public static void main(String[] args) {
        Node root = insertNode(null, 20);
        Node node = insertNode(root, 30);
        node = insertNode(node, 50);
        node = insertNode(node, 5);
        node = insertNode(node, 15);
        node = insertNode(node, 22);
        node = insertNode(node, 21);
        node = insertNode(node, 42);
        insertNode(node, 4);

        print2D(root);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }
}
