package com.test;

import java.util.Arrays;
import java.util.Collections;

public class SeprateNumbers {
    public static void main(String[] args) {
        int num=1234; // int number
        int num1 = 0;

        while (num > 0) {
           // System.out.print(","+ num % 10);
            num1= num % 10;
              num = num / 10;
            System.out.print(num1);
        }



    }

}
