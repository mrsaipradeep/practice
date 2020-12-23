package com.geek.test.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PrintTreeVerticalOrder {

    private static void verticalOrder(Node root, Map<Integer, List<Integer>> map, int index) {
        if(root == null)
            return;
        List<Integer> integers = map.get(index);

        if(integers == null){
            integers = new ArrayList<>();
            integers.add(root.getData());
        } else{
            integers.add(root.getData());
        }

        map.put(index, integers);

        verticalOrder(root.getLeft(), map, index-1);
        verticalOrder(root.getRight(), map, index+1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
       /* root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);*/

        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        verticalOrder(root,map,0);
        System.out.println(map);

    }
}
