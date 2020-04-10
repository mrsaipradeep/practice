package com.geek.test.tree;

import java.util.LinkedList;
import java.util.Queue;

// Breadth first search
public class BFLevelOrderTreeTraversal {

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

        PrintTreeUtil.print2D(root);
        levelOrder(root);
    }

    private static Node insertNode(Node root, int data) {
        if (root == null)
            root = new Node(data);
        else if (data <= root.getData())
            root.setLeft(insertNode(root.getLeft(), data));
        else
            root.setRight(insertNode(root.getRight(), data));
        return root;
    }

    private static void levelOrder(Node root) {
        if(root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node current = queue.poll();
            System.out.print(" " + current.getData());
            if(current.getLeft() != null) queue.add(current.getLeft());
            if(current.getRight() != null) queue.add(current.getRight());
        }
    }
}
