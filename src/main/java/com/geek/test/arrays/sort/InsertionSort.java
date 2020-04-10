package com.geek.test.arrays.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 1, 6, 8, 7};

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int value = arr[i];
            int hole = i;
            while (hole > 0 && arr[hole - 1] > value){
                arr[hole] = arr[hole - 1];
                hole--;
            }
            arr[hole] = value;
        }
    }
}
