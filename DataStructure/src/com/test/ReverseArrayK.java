package com.test;

public class ReverseArrayK {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 5;
        int n = arr.length;
        revK(arr, n, k);

    }

    public static void revK(int arr[], int n, int k) {
        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            System.out.println("size of ::" + right);
            int temp;
            // reverse the sub-array [left, right]
            while (left < right) {
                arr[left] = arr[left] + arr[right];
                arr[right] = arr[left] - arr[right];
                arr[left] = arr[left] - arr[right];
                left += 1;
                right -= 1;
            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

}
