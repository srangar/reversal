package com.srini.reversal;

import java.util.Arrays;


public class StringOperator {
    private String word;

    public StringOperator(String s) {
        word = s;
    }

    public boolean isAllUpperCase() {
        for (int i=0; i<this.word.length(); i++)
        {
            if (!Character.isUpperCase(this.word.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }

    public boolean isAllLowerCase(){
        for (int i=0; i<this.word.length(); i++)
        {
            if (!Character.isLowerCase(this.word.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome() {
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append(this.word);
        sbuilder.reverse();

        return this.word.equals(sbuilder.toString());
    }

    public boolean isAnagram(String string2) {
        if (this.word.length() != string2.length()) {
            return false;
        }

        char[] a1 = this.word.toCharArray();
        char[] a2 = string2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }
}
