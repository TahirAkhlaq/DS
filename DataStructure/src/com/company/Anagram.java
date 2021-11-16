package com.company;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {


    public static boolean checkAnagram(String a, String b) {

        String s1 = a.replaceAll("\\s", "");
        String s2 = b.replaceAll("\\s", "");
        if (s1.length() != s2.length()) {
            return false;
        } else {
            char[] c = s1.toLowerCase().toCharArray();
            char[] d = s2.toLowerCase().toCharArray();
            Arrays.sort(c);
            Arrays.sort(d);

            return Arrays.equals(c, d);
        }


    }

    public static void main(String[] args) {
       // System.out.println(checkAnagram("he is hitler", "is eh litrep"));
    }
}
