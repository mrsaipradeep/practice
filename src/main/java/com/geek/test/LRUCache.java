
package com.geek.test;


import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class LRUCache {

    private Deque<Integer> dequeCache;
    private HashSet<Integer> hashSet;
    private final int capacity;

    public LRUCache(int capacity) {
        this.dequeCache = new LinkedList<>();
        this.hashSet = new HashSet<>();
        this.capacity = capacity;
    }

    public void refer(int page) {
        if (!this.hashSet.contains(page)) {
            if (this.dequeCache.size() == capacity) {
                this.hashSet.remove(dequeCache.removeLast());
            }
        } else {
            this.dequeCache.remove(page);
        }
        dequeCache.push(page);
        hashSet.add(page);
    }

    private void display() {
        System.out.println(dequeCache.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(4);
        lruCache.refer(1);
        lruCache.refer(2);
        lruCache.refer(3);
        lruCache.refer(1);
        lruCache.refer(5);
        lruCache.refer(2);
        lruCache.refer(4);
        lruCache.refer(2);
        lruCache.display();
    }

}

