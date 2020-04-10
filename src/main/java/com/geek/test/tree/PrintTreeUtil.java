package com.geek.test.tree;

class PrintTreeUtil {
    private static final int COUNT = 5;

    // Function to print binary tree in 2D
    // It does reverse inorder traversal
    private static void print2DUtil(Node root, int space) {
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += COUNT;

        // Process right child first
        print2DUtil(root.getRight(), space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.getData() + "\n");

        // Process left child
        print2DUtil(root.getLeft(), space);
    }

    // Wrapper over print2DUtil()
    public static void print2D(Node root) {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }
}
