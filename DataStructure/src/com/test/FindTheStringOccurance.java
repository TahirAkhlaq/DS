package com.test;

import java.util.HashMap;
import java.util.Map;

public class FindTheStringOccurance {

    public static void main(String[] args) {
        String s = "abdd ccdef highest";
        findOccurance(s);
    }

    public static void findOccurance(String s) {
        char[] words = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : words) {
            Integer n = map.get(ch);
            n = (n == null) ? 1 : ++n;
            map.put(ch, n);
        }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    System.out.print(entry.getKey());
                }
            }
            /// System.out.println(map);
        }
    }
