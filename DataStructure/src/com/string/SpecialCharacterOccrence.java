package com.string;

public class SpecialCharacterOccrence {
    public static void main(String[] args) {
        findOccurance("QA life+_(*& is sucks 132!@#@#");
    }

    public static void findOccurance(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) &&
                    !Character.isWhitespace(s.charAt(i))) {
                count++;
            }
        }
        if (count == 0)
            System.out.println("No Special Characters found.");
        else
            System.out.println("String has Special Characters\n" + count + " "
                            + "Special Characters found.");
    }
}

