package com.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {
        findLongestSub("ababcda");
    }

    public static void findLongestSub(String s) {
        String longSubString ;
        int longStringlength = 0;
        String str = null;
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, i);
            } else {
                i = map.get(ch);
                map.clear();
            }
            if (map.size() > longStringlength) {
                longStringlength = map.size();
                longSubString = map.keySet().toString();
                str = longSubString.replaceAll("[^a-zA-Z0-9]", "");

            }
        }
        System.out.println("The longest Substring ::" + str);
        System.out.println("the longest substring Length ::" + longStringlength);
    }
}
