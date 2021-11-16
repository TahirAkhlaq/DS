package com.company;

import java.util.Arrays;

public class SortArrays {
    public static void main(String[] args) {
        int nums[]= {3,4,8,9,2,1,5};
        for(int i=0;i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]>nums[j]){
                   /* int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;*/
                    nums[i]= nums[i]+nums[j];
                    nums[j]=nums[i]-nums[j];
                    nums[i]=nums[i]-nums[j];
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
