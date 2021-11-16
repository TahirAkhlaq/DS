package com.string;

import java.util.Locale;

public class StringReverse {
    public static void main(String[] args) {
        String s= "This is iT";
        String []str = s.split(" ");
        String revString="";
        for(String w: str){
            String revWords="";
           for (int i=w.length()-1;i>=0;i--){
           char  ac=w.charAt(i);
           if (65<ac&& ac<=90){
               ac+=32;
           }
           else if (97<=ac && ac<122){
               ac-=32;
           }
               revWords+=ac;
           }
            revString+=revWords+" ";
        }

        System.out.println(revString);
    }
}
