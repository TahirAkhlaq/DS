package com.string;

public class PermutationString {
    public static void main(String[] args) {
       permutationStr("abc", "");
    }

    public static void permutationStr(String s, String asf) {
        if (s.length() == 0) {
            System.out.println(asf);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String sLPart = s.substring(0, i);
            String sRpart = s.substring(i + 1);
            String roq = sLPart + sRpart;
            permutationStr(roq, asf + ch);
        }

    }
}
