package com.geek.test.tree;

import static com.geek.test.tree.TreeUtil.insertNode;
import static com.geek.test.tree.TreeUtil.print2D;

public class BinarySearchTreeValidator {

    private static boolean isBinarySearchTree(Node root, int min, int max) {

        if (root == null) return true;
        return root.getData() > min && root.getData() <= max
                && isBinarySearchTree(root.getLeft(), min, root.getData())
                && isBinarySearchTree(root.getRight(), root.getData(), max);
    }

    public static void main(String[] args) {
        Node root = insertNode(null, 20);
        Node node = insertNode(root, 30);
        node = insertNode(node, 50);
        node = insertNode(node, 5);
        node = insertNode(node, 15);
        node = insertNode(node, 5);
        node = insertNode(node, 21);
        node = insertNode(node, 42);
        insertNode(node, 4);

        print2D(root);
        System.out.println(isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
