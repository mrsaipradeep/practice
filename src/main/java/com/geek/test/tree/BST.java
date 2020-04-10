package com.geek.test.tree;

import static com.geek.test.tree.TreeUtil.insertNode;
import static com.geek.test.tree.TreeUtil.print2D;

public class BST {

    private static boolean search(Node root, int data) {
        if (root == null)
            return false;
        else if (root.getData() == data) {
            return true;
        } else if (data <= root.getData()) {
            return search(root.getLeft(), data);
        } else {
            return search(root.getRight(), data);
        }
    }

    private static int findMin(Node root) {
        if (root == null) {
            return -1;
        } else if (root.getLeft() == null) {
            return root.getData();
        }
        return findMin(root.getLeft());
    }

    private static int findMax(Node root) {
        if (root == null) {
            return -1;
        } else if (root.getRight() == null) {
            return root.getData();
        }
        return findMax(root.getRight());
    }

    private static int findHeight(Node root) {
        if (root == null)
            return -1;

        return Math.max(findHeight(root.getLeft()), findHeight(root.getRight())) + 1;
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

        System.out.println(search(root, 50));
        System.out.println(search(root, 44));
        System.out.println(findMin(root));
        System.out.println(findMax(root));
        System.out.println(findHeight(root));
    }
}
