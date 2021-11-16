package com.array;

import java.util.Arrays;

public class SwapTwo {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int index = 1;
        for (int i = 0; i < a.length-1 ; i=i+4 ) {
          /*  int temp = a[i];
            a[i] = a[i + 3];
            a[i + 3] = temp;*/
            a[i]=a[i]+a[i+3];
            a[i+3]=a[i]-a[i+3];
            a[i]=a[i]-a[i+3];


        }
        System.out.println(Arrays.toString(a));
    }

}
