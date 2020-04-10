package com.geek.test.arrays;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SubArraySum {
    private static final Scanner sc = new Scanner(System.in);

    public static void main (String[] args) throws IOException {

        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            findStartAndEndIndexOfSum(n, s, m);
        }


    }

    private static String findStartAndEndIndexOfSum(int s,int total, int[] arr) {
        int z = 0;
        String output = "";
        int k = arr.length/2;
        int windowSum = 0;
        for(int i =0; i < k; i++){
            windowSum+= arr[i];
        }

        int startIndex = 0;
        for(int end = k;end < arr.length; end++ ){
            windowSum += arr[end] - arr[end - k];
            z = Math.max(windowSum,z);
            if(z == total){
                output = startIndex + " " + end;
            }
            startIndex++;
        }

        return output;
    }
}
