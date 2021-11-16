package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FirstRepeatinf {
    public static void main(String[] args) {
        Integer b[] = {1, 4, 3, 4, 3, 4, 7, 5, 8};
        repeatElement(b,4);

    }

    public static void repeatElement(Integer[] arr,int index) {
        int q=0;
        int[] anotherArray = new int[arr.length];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (arr[i] == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
            if (anotherArray[i] == q) {
                anotherArray[i] = 1;
            }
        }
        System.out.println(Arrays.toString(anotherArray));


    }
}
