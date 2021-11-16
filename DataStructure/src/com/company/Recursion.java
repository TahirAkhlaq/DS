package com.company;

public class Recursion {

    public static void main(String[] args) {
       // rec(3);
        int []a={1,3,5,6};
        Recursion.searchInsert(a,5);
    }

    public static int searchInsert(int[] nums, int target) {
        int n= nums.length;
        for (int i = 0; i < n; i++) {
        if (target<=nums[i]){
           // System.out.println(i);
            return i;

        }
        }
            return target;

    }



    public static void rec(int n) {
        if (n > 0) {

            System.out.println("hello");
            rec(n - 1);
        }

    }
}
