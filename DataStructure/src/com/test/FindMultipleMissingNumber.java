package com.test;

public class FindMultipleMissingNumber {
    public static void main(String[] args) {
        int arr[] = {1,2, 3, 5};
        int newArr[] = new int[6];
        for (int i : arr) {
            newArr[i] = 1;
        }
        System.out.println("Print new array");
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
