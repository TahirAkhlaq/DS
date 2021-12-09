package com.test;

public class IntegerTOBinary {
    public static void main(String[] args) {
       convertDtoB(25);
    }

    public static void convertDtoB(int c){
       // int c=a;
        String s="";
        while (c>0) {
            int b = c % 2;
            c=c/2;
            s= b+s;
        }
        System.out.println(s);

    }
}
