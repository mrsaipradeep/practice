package com.geek.test.arrays.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 1, 6, 8, 7};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        if (n < 2)
            return;
        //if (n > 1) {
        for (int i = 0; i <= mid - 1; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i <= n - 1; i++) {
            right[i - mid] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);

        merge(left, right, arr);
        //}
    }

    private static void merge(int[] left, int[] right, int[] arr) {
        int nL = left.length;
        int nR = right.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nL && j < nR) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < nL) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < nR) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
