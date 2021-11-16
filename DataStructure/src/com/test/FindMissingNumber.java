package com.test;

public class FindMissingNumber {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(fmissing(a, 10));
    }

    public static int fmissing(int[] arr, int totalCount) {
        int sum = totalCount * (totalCount + 1) / 2;
        int actulSum = 0;
        for (int i : arr) {
            actulSum += i;
        }
        return sum - actulSum;
    }


}
