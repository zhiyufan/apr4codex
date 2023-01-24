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
        int hasHyphen = 0;
        if (token.length() > 1) {
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
        } else if (token.length() == 1) {
            if (Character.isAlphabetic(token.charAt(0))) {
                return true;
            } else if (token.charAt(0) == '.' || token.charAt(0) == ',' || token.charAt(0) == '!') {
                return true;
            }
        }
        return false;
    }


    
    
    
    
    
    
    
    private String removePunctuation(String token) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < token.length(); i++) {
            if (isAlphabetic(token.charAt(i))) {
                sb.append(token.charAt(i));
            } else if (token.charAt(i) == '-') {
                if (i - 1 >= 0 && i + 1 < token.length() && (isAlphabetic(token.charAt(i - 1)) && isAlphabetic(token.charAt(i + 1)))) {
                    sb.append(token.charAt(i));
                }
            }
        }
        return sb.toString();
    }

    private boolean isAlphabetic(char c) {
        return 'a' <= c && c <= 'z' || 'A' <= c && c <= 'Z';
    }

    
    
    
    
    
    
    public static boolean isAValidWord(String word) {
        if (word == null) return false;
        int hasHyphen = 0;
        int hasPunctuation = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '-') {
                if (!isAlphabetic(word.charAt(i - 1)) || !isAlphabetic(word.charAt(i + 1))) {
                    return false;
                }
                hasHyphen = 1;
            } else if (word.charAt(i) == '!') {
                hasPunctuation = 1;
            } else if (word.charAt(i) == ',') {
                hasPunctuation = 1;
            } else if (!isAlphabetic(word.charAt(i))) {
                return false;
            }
        }
        if (hasHyphen + hasPunctuation > 1) return false;
        if (hasPunctuation == 1 && hasHyphen == 0 && !isAlphabetic(word.charAt(word.length() - 1))) {
            return false;
        }
        return true;
    }

    private static boolean isAlphabetic(char c) {
        return 'a' <= c && c <= 'z' || 'A' <= c && c <= 'Z';
    }

    private static boolean isPunctuation(char c) {
        return c == ',' || c == '!' || c == '.';
    }

    
    
    
}