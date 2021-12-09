package com.string;

public class AllPalindrom {
    public static void main(String[] args) {

    }
    public static boolean checkPalindrom(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            char ch = s.charAt(start);
            char ch1 = s.charAt(end);
            if (ch != ch1) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;

    }
    public static void subString(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String s1 = s.substring(i, j);
                if (checkPalindrom(s1) == true) {
                    System.out.println(s1);
                }
            }
        }

    }


}
