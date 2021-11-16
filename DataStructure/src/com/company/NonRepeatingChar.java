package com.company;

import java.util.*;

public class NonRepeatingChar {
    public static void main(String[] args) {

      String  str = "ab ccdef highest";
        int arr[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                arr[str.charAt(i)]++;
        }
        char ch ;
        System.out.print("All Non-repeating character in a given string is:");
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)] == 1) {
                ch = str.charAt(i);
                System.out.print(ch + "");
            }
        }

    }
}

