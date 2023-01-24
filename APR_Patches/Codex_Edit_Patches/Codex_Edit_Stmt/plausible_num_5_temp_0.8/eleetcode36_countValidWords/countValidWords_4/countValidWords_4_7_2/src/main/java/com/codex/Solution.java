package com.codex;

import java.util.*;

public class Solution {
    public final static char[] PUNCTUATION = { '.', ',', '!', '-', '\'', '\"' };

    public static int countValidWords(String sentence) {

        int count = 0;
        String[] tokens = sentence.split(" ");
        for (String token : tokens) {
            if (isValid(token)) count++;
        }
        return count;
    }
        if (token.isEmpty()) {
            return false;
        }


    private static boolean isValid(String token) {
        int hasPunctuation = 0;
        int hasHyphen = 0;

        for (int i = 0; i < token.length() - 1; i++) {
            if (!Character.isAlphabetic(token.charAt(i))) {
                if (token.charAt(i) == '-') {
                    if (!Character.isAlphabetic(token.charAt(i - 1)) || !Character.isAlphabetic(token.charAt(i + 1))) {
                        return false;
                    }
                    hasHyphen = 1;
                } else if (token.charAt(i) != ',' && token.charAt(i) != '!') {
                    return false;
                }
            }
        }
        if (Character.isAlphabetic(token.charAt(token.length() - 1))) {
            return true;
        } else if (token.charAt(token.length() - 1) == ',' || token.charAt(token.length() - 1) == '!') {
            hasPunctuation = 1;
        }
        if (hasHyphen + hasPunctuation <= 1) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isTokenValid(String token) {

        boolean hasAlphaPrefix = false;
        boolean hasAlphaSuffix = false;
        boolean hasDash = false;
        boolean hasPunctuation = false;

        if (isCharInArray(token.charAt(0), PUNCTUATION)) {
            hasPunctuation = true;
        } else {
            hasAlphaPrefix = true;
            if (token.length() > 1 && isCharInArray(token.charAt(1), PUNCTUATION)) {
                hasPunctuation = true;
            }
        }
        if (isCharInArray(token.charAt(token.length() - 1), PUNCTUATION)) {
            hasPunctuation = true;
        } else {
            hasAlphaSuffix = true;
            if (token.length() > 1 && isCharInArray(token.charAt(token.length() - 2), PUNCTUATION)) {
                hasPunctuation = true;
            }
        }
        for (int i = 0; i < token.length() - 1; i++) {
            if (!hasDash && !hasPunctuation && isCharInArray(token.charAt(i), PUNCTUATION)) {
                hasPunctuation = true;
            }
        }
        return hasAlphaPrefix && hasAlphaSuffix && !hasDash && !hasPunctuation;

    }

    private static boolean isCharInArray(char c, char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            if (c == charArray[i]) {
                return true;
            }
        }
        return false;
    }
}