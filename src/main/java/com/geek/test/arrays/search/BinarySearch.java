package com.geek.test.arrays.search;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 5, 12, 34, 45, 56, 67, 78, 89};
        int index = binarySearch(arr, 0, arr.length - 1, 56);
        if (index == -1) {
            System.out.println("Search value is not present");
        } else {
            System.out.println(arr[index]);
        }

    }

    private static int binarySearch(int[] arr, int start, int end, int searchValue) {
        if (end >= start) {
            int m = start + (end - start) / 2;
            if (searchValue == arr[m]) {
                return m;
            } else if (searchValue > arr[m]) {
                return binarySearch(arr, m + 1, end, searchValue);
            } else {
                return binarySearch(arr, start, m - 1, searchValue);
            }
        }
        return -1;
    }
}
