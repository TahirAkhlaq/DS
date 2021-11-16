package com.company;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int i[] = {1, 3, 0, 0, 0, -5, 1, 0, 0, 11};

        System.out.println(Arrays.toString(pushZero(i)));
    }

    public static int[] pushZero(int[] a) {
        int newArray[] = new int[a.length];
        int count = 0;
     /*   for (int num : a) {
            if(num == 0) {
                newArray[count]=num;
                count++;
            }
        }*/
        for (int num : a) {
            if (num != 0) {
                newArray[count] = num;
                count++;
            }
        }
        return newArray;

    }
//Without creating New Array
    public static int[] pushZeroRight(int[] a) {
        //  int newArray[] = new int[a.length];
        int count = a.length - 1;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != 0) {
                a[count] = a[i];
                count--;
            }
        }
        while (count >= 0) {
            a[count] = 0;
            count--;
        }
        return a;
    }

    public static int[] pushZeroLeft(int[] a) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[counter] = a[i];
                counter++;
            }
        }
        while (counter < a.length) {
            a[counter] = 0;
            counter++;
        }
        return a;
    }

}
