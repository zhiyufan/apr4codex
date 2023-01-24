package com.codex;

import java.util.*;

public class Solution {
    public static int countValidWords(String sentence) {
        
        int count = 0;
        String[] tokens = sentence.split(" ");
        for (String token : tokens) {
            if (isValid(token)) count++;
        }
        return count;
    }

    private static boolean isValid(String token) {
        int hasPunctuation = 0;
            if (hasHyphen == 1 && Character.isAlphabetic(token.charAt(0)) && token.charAt(0) != '-') return false;
            if (hasHyphen == 1 && Character.isAlphabetic(token.charAt(token.length() - 1)) && token.charAt(token.length() - 1) != '-') return false;
        int hasHyphen = 0;
        if (token.length() > 1) {
            for (int i = 0; i < token.length() - 1; i++) {
                if (!Character.isAlphabetic(token.charAt(i))) {
                    if (token.charAt(i) == '-') {
                        if (!Character.isAlphabetic(token.charAt(i - 1)) || !Character.isAlphabetic(token.charAt(i + 1))) {
                            return false;
                        }
                        hasHyphen = 1;
                    } else if (!isPunctuation(token.charAt(i))) {
                        return false;
                    }
                }
            }
            if (Character.isAlphabetic(token.charAt(token.length() - 1)) || isPunctuation(token.charAt(token.length() - 1))) {
                if (hasHyphen == 1 && !Character.isAlphabetic(token.charAt(token.length() - 1))) return false;
                hasPunctuation = 1;
            }
            return hasHyphen + hasPunctuation <= 1;
        } else if (token.length() == 1) {
            return Character.isAlphabetic(token.charAt(0)) || isPunctuation(token.charAt(0));
        }
        return false;
    }

    private static boolean isPunctuation(char c) {
        return c == '.' || c == '!' || c == ',';
    }

    
}