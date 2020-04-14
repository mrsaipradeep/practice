package com.geek.test.tree;

import static com.geek.test.tree.TreeUtil.insertNode;
import static com.geek.test.tree.TreeUtil.print2D;

public class DeleteNodeFromTree {

    private static Node findMin(Node root) {
        if (root.getLeft() == null)
            return root;
        else
            return findMin(root.getLeft());
    }


    private static Node deleteNode(Node root, int value) {
        if (root == null)
            return null;
        if (root.getData() > value) {
            root.setLeft(deleteNode(root.getLeft(), value));
        } else if (root.getData() < value) {
            root.setRight(deleteNode(root.getRight(), value));

        } else {
            // if nodeToBeDeleted have both children
            if (root.getLeft() != null && root.getRight() != null) {
                // Finding minimum element from right
                Node minNodeForRight = findMin(root.getRight());
                // Replacing current node with minimum node from right subtree
                root.setData(minNodeForRight.getData());
                // Deleting minimum node from right now
                root.setRight(deleteNode(root.getRight(), minNodeForRight.getData()));

            }
            // if nodeToBeDeleted has only left child
            else if (root.getLeft() != null) {
                root = root.getLeft();
            }
            // if nodeToBeDeleted has only right child
            else if (root.getRight() != null) {
                root = root.getRight();
            }
            // if nodeToBeDeleted do not have child (Leaf node)
            else
                root = null;
        }
        return root;
    }
    /*private static Node deleteNode(Node root, int data) {
        if (root == null) {
            return null;
        } else if (root.getData() > data) {
            root.setLeft(deleteNode(root.getLeft(), data));
        } else if (root.getData() < data) {
            root.setRight(deleteNode(root.getRight(), data));
        } else {
            // case 1
            if (root.getLeft() == null && root.getRight() == null) {
                root = null;
            } else if (root.getLeft() != null) {
                root = root.getLeft();
            } else if (root.getRight() != null) {
                root = root.getRight();
            } else {

                Node minNodeForRight = findMin(root.getRight());
                root.setData(minNodeForRight.getData());
                root.setRight(deleteNode(root.getRight(), minNodeForRight.getData()));

            }
        }
        return root;
    }*/

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
        Node node1 = deleteNode(root, 30);
        System.out.println("---------------------------");
        print2D(node1);
    }
}
