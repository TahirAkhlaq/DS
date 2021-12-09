package com.array;

import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        int aa[]={10,4,5,23,11,40,6};
        System.out.println(spanA(aa));
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i =0; i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
    }
    public static int spanA(int[] a){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<a.length;i++){
            if (a[i]>max){
                max=a[i];
                System.out.println("max count is " +max);
            }
            else if(a[i]<min){
                min=a[i];
                System.out.println("min count is "+min);
            }
        }
        return max-min;
    }
}
