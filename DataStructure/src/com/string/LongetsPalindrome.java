package com.string;

public class LongetsPalindrome {
    public static void main(String[] args) {
        String sa="badab";
       // System.out.println(longestPalindrome(sa));
        longestPalindrome(sa);
    }
    public static String longestPalindrome(String s) {
            int start =0, end =0;
            for(int i=0;i<s.length();i++){
                int odd = expandRange(s,i,i);
                int even = expandRange(s,i,i+1);
                int len= Math.max(odd,even);
                if (len>end-start){
                    start = i - (len-1)/2;
                    end = i + len/2;
                }
            }
        System.out.println(s.substring(start,end+1));
        return s.substring(start,end+1);
    }

    public static int expandRange(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
}
