package com.company;

import java.util.HashMap;

public class TwoSumArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 7,2,4,5};
        twoSumWhile(arr,8);
       // findDuplicate();
    }

    public static void twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] +nums[ j] == target) {
                    System.out.println(nums[i] + " " + nums[j]);

                }
            }
        }
    }
    public static void twoSumWhile(int[] nums, int target) {
       int left =0;
       int right = nums.length-1;
       while (left<right){
           int sum = nums[left]+nums[right];
           if (sum==target){
               System.out.println(nums[left] + " " + nums[right]);
               left++;
               right--;
           }
           else if (sum>target){
          nums [right]--;
           }
           else {
               left++;
           }
       }
    }


    public static void findDuplicate(){
        String s= "tttotpop";
        char[] a = s.toCharArray();
        int left =0;
        int right = a.length-1;
        for (int i=0;i<=a.length;i++){
            if (a[i]==a[right]){
                System.out.println(a[right]);
                right--;
                break;
            }
            else {
                right--;
            }
        }
    }
}
