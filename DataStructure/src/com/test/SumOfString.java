package com.test;

public class SumOfString {

    public static void main(String[] args) {
        sumStringWithFor("1a2 5h bn");
    }
    public static int sumString(String s){
        int sum = 0;
        for(int i = 0; i < s.length() ; i++){
            if( Character.isDigit(s.charAt(i)) ){
                sum = sum + Character.getNumericValue(s.charAt(i));
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void sumStringWithFor(String s){
        int sum =0;
        for(char c: s.replaceAll("\\D","").toCharArray()){
            int digit=c-'0';
            sum+=digit;
        }
        System.out.println(sum);
    }


}
