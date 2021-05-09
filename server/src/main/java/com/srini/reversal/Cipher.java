package com.srini.reversal;

public class Cipher {
    public String encrypt(String word, int offset) {
        word = word.toLowerCase();
        StringBuilder sbulder = new StringBuilder();

        for (char c: word.toCharArray()) {
            char newChar = (char) (((int) c + offset - 97) % 26 + 97);
            sbulder.append(newChar);
        }

        return sbulder.toString();
    }

    public String decrypt(String word, int offset) {
        word = word.toLowerCase();
        String out = this.encrypt(word, 26-(offset%26));
        return out;
    }
}
