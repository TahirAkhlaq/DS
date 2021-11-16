package com.company;

import java.util.Arrays;

public class lexicographicSubConcat {
    public static void main(String[] args) {
        System.out.println(lexicographicSubConcat("abc"));
    }

    static String lexicographicSubConcat(String s)
    {
        int n = s.length();
        int sub_count = n*(n+1)/2;  // Creating an array to store substrings
        String []arr = new String[sub_count];
        // finding all substrings of string
        int index = 0;
        for (int i = 0; i < n; i++)
            for (int j = 1; j <= n - i; j++) {
                arr[index++] = s.substring(i, i+j);
            }
        Arrays.sort(arr);
        String res = "";
        for (int i = 0; i < sub_count; i++)
            res += arr[i];

        return res;
    }
}

