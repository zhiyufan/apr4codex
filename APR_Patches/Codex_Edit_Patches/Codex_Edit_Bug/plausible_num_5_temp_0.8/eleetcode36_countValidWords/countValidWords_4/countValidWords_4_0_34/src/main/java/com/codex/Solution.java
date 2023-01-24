package com.codex;

import java.util.*;

public class Solution {
    public static int countValidWords(String sentence) {
        if (sentence.length() == 0) return 0;
        int count = 0;
        boolean isLastOneValid = false;
        String[] tokens = sentence.split(" ");
        for (String token : tokens) {
            if (isValid(token)) count++;
        }
        if (isValid(tokens[tokens.length - 1])) isLastOneValid = true;
        else if (tokens.length > 1 && isValid(tokens[tokens.length - 2])) isLastOneValid = true;
        else isLastOneValid = false;
        if (isLastOneValid) count++;
        return count;
    }

    private static boolean isValid(String token) {
        int hasPunctuation = 0;
        int hasHyphen = 0;
        if (token.length() > 1) {
            for (int i = 0; i < token.length() - 1; i++) {
                if (!Character.isAlphabetic(token.charAt(i))) {
                    if (token.charAt(i) == '-') {
                        if (!Character.isAlphabetic(token.charAt(i - 1)) || !Character.isAlphabetic(token.charAt(i + 1))) {
                            return false;
                        }
                        hasHyphen = 1;
                    } else if (token.charAt(i) != ',' && token.charAt(i) != '!' && token.charAt(i) != '.') {
                        return false;
                    }
                }
            }
            if (Character.isAlphabetic(token.charAt(token.length() - 1))) {
                return true;
            } else if (token.charAt(token.length() - 1) == ',' || token.charAt(token.length() - 1) == '!' || token.charAt(token.length() - 1) == '.') {
                hasPunctuation = 1;
            }
            if (hasHyphen + hasPunctuation <= 1) {
                return true;
            } else {
                return false;
            }
        } else if (token.length() == 1) {
            if (Character.isAlphabetic(token.charAt(0))) {
                return true;
            } else if (token.charAt(0) == '.' || token.charAt(0) == ',' || token.charAt(0) == '!') {
                return true;
            }
        }
        return false;
    }
}