package com.LinkedList;

public class MaximumProductOf3 {
    public static void main(String[] args) {
    int a[]= { 1, 4, 3, -6, -7, 0 };
        System.out.println( maxProduct(a));
    }

    public static int maxProduct(int[] arr) {
        int min1 = Integer.MAX_VALUE;
        int min2 = min1;
        int max1 = Integer.MIN_VALUE;
        int max2 = min1;
        int max3 = max2;
        for (int i = 0; i < arr.length; i++) {
            //max check
            int val = arr[i];
            if (val >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = val;
            } else if (val >= max2) {
                max3 = max2;
                max2 = val;
            } else if (val >= max3) {
                max3 = val;
            }
            //min check
            if (val <= min1) {
                min2 = min1;
                min1 = val;
            } else if (val <= min2) {
                min2 = val;
            }
        }
        return
                Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}
