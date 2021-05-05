package com.srini.reversal;

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


}
