package com.string;

import java.lang.String;
import java.util.HashMap;
import java.util.Map;

public class StringOccurance {
    public static void main(String[] args) {
        char a='a';
        //System.out.println(occrance("sdfghaahhyrtraanbnva",a));
        findFrequency("sdfghaahhyrtraanbnva");
    }

    public static int occrance(String s, char a) {
        int r = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a) {
                r++;
            }
        }
        return r;
    }

    public static void findFrequency(String s){
    //      char ch[] = s.toCharArray();
        Map<Character,Integer>map = new HashMap<>();
        for(char s1:s.toCharArray()){
           map.put(s1,map.getOrDefault(s1,0)+1);
        }

        for (Map.Entry e: map.entrySet()){
            System.out.print(e.getKey()+""+e.getValue()+" ");
        }
    }
}
