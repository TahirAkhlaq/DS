package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupOfAnagram {

    public static void main(String[] args) {
        String arr[] = { "cat", "dog", "tac", "god", "act","odg" };
String a[]={"he is hitler", "is eh litrep"};
        System.out.println(gAnagrm(arr));
    }

    public static List gAnagrm(String [] s){
        List<List<String>> groupAnagram=new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for (String s1:s){
            char[] ch =s1.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if (!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s1);
        }
        groupAnagram.addAll(map.values());
        return groupAnagram;
    }
}
