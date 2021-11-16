package com.test;

import java.util.Locale;

public class ToggleChar {

    public static void main(String[] args) {
        String s = "cool is new";
        revWord(s);
       // revViceVersaUpper(s);
    //    upperCaseEvery1LetterOfWord(s);

    }

    public static void revViceVersaUpper(String s) {
        String[] words = s.split(" ");
        String revString = "";
        for (String w : words) {
            String revWords = "";
            for (int i = w.length() - 1; i >= 0; i--) {
                char aChar = w.charAt(i);
                if (65 <= aChar && aChar <= 90) {
                    aChar = (char) ((aChar + 32));
                } else if (97 <= aChar && aChar <= 122) {
                    aChar = (char) ((aChar - 32));
                }
                revWords += aChar;
            }
            revString += revWords + " ";
        }
        System.out.println(revString);
    }

    public static void upperCaseEvery1LetterOfWord(String s) {
        String[] words = s.split(" ");
        String revString = "";
        for (String w : words) {
            String revWords = "";
            for (int i = w.length() - 1; i >= 0; i--) {
                revWords += w.charAt(i);
            }
            String first = revWords.substring(0, 1).toUpperCase() + revWords.substring(1);
            revString += first + " ";
        }
        System.out.println(revString);
    }

    public static void revWord(String s) {
        String[] words = s.split(" ");
        String revString = "";
        for (String w : words) {
            String revWord = "";
            for (int i = w.length() - 1; i >= 0; i--) {
                revWord += w.charAt(i);
            }
            revString += revWord + " ";
        }
        System.out.println(revString);

    }
}

