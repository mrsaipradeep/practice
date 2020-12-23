package com.geek.test.arrays.sort;

import java.util.Arrays;

public class MergeSortRevision {

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 1, 4, 2, 6, 8};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        int mid = arr.length/2;


    }

    private static void merge(int[] left, int[] right, int[] arr) {
        int nL = left.length;
        int nR = right.length;

        int i = 0, j = 0, k = 0;
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
