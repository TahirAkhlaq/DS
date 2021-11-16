package com.string;

import java.util.ArrayList;

public class FirstNonRepeatCharacter {
    public static void main(String[] args) {
        String s = "ttttpop";
        int a=123134;
        String s1 =Integer.toString(a);
        for(Character ch:s1.toCharArray()) {
            if(s.indexOf(ch) == s.lastIndexOf(ch)) {
                System.out.println("First non repeat character = " + ch);
                break;
            }
        }
    }
}