package com.geek.test.arrays;

public class SumArray {
    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number)
     * which has the largest sum and return its sum.
     * @param args
     */
    public static void main(String[] args) {
        //int[] arr = {1,2,3,6,4,0};
        int[] arr1 = {-1,2,-3,4,0};

        int size = arr1.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {

            max_ending_here = max_ending_here + arr1[i];
            System.out.println(max_so_far + " max_so_far");
            System.out.println(max_ending_here + " max_ending_here");
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        //return max_so_far;
        //System.out.println(sum(arr));
        System.out.println(max_so_far);
    }

    private static int subArraySum(int a , int b, int currSum){
        int subArrSum = currSum;
        System.out.println("currSum" +  currSum);
        System.out.println("a " +  a + "b " + b);
        if(currSum < (a + b)){
            subArrSum = currSum + a + b;
        }
        System.out.println("subArrSum" +  subArrSum);
        return subArrSum;
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            /*for (int j=1; j < arr.length; j++){
                System.out.println(arr[i] + arr[j]);
                if(sum < (arr[i] + arr[j]))
                    sum = arr[i] + arr[j];
            }*/
            sum = subArraySum(arr[i], (i+1) < arr.length ? arr[i+1] : 0, sum);
            //sum += arr[i];
        }
        return sum;
    }
}
