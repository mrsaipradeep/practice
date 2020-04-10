package com.geek.test.arrays.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 1, 6, 8, 7};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pIndex = partition(arr, start, end);
            quickSort(arr, start, pIndex - 1);
            quickSort(arr, pIndex + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int pIndex = start;
        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                swap(arr, pIndex, i);
                pIndex++;
            }

        }
        swap(arr, pIndex, end);
        return pIndex;
    }

    private static void swap(int[] arr, int pIndex, int i) {
        int temp = arr[pIndex];
        arr[pIndex] = arr[i];
        arr[i] = temp;
    }
}
