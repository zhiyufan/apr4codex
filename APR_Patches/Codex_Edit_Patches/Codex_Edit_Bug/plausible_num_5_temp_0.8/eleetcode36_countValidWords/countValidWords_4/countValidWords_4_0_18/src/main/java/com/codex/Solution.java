package com.codex;

import java.util.*;

public class Solution {
public static int countValidWords(String sentence) {

        sentence = sentence.trim();
        if (sentence.length() == 0) {
            return 0;
        }

        int count = 0;
        int hasPunctuation = 0;
        int hasHyphen = 0;
        int hasOneLetter = 0;
        String[] tokens = sentence.split(" ");
        for (String token : tokens) {
            int hasPunctuationTemp = 0;
            int hasHyphenTemp = 0;
            int hasOneLetterTemp = 0;
            if (isValid(token, hasPunctuation, hasHyphen, hasOneLetter, hasPunctuationTemp, hasHyphenTemp, hasOneLetterTemp)) {
                count++;
                hasPunctuation = hasPunctuationTemp;
                hasHyphen = hasHyphenTemp;
                hasOneLetter = hasOneLetterTemp;
            }
        }
        return count;
    }

    private static boolean isValid(String token, int hasPunc, int hasHyphen, int hasOneLetter, int hasPuncRef, int hasHyphenRef, int hasOneLetterRef) {
        int hasPunctuation = hasPunc;
        int hasHyphenTemp = hasHyphen;
        int hasOneLetterTemp = hasOneLetter;
        for (int i = 0; i < token.length(); i++) {
            if (!Character.isAlphabetic(token.charAt(i))) {
                if (token.charAt(i) == '-') {
                    if (!Character.isAlphabetic(token.charAt(i - 1)) || !Character.isAlphabetic(token.charAt(i + 1))) {
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

    
    
}