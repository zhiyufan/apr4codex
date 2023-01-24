package com.codex;

import java.util.*;

public class Solution {
    // Regex to solve the given task: 
    // sentence.split(" +").filter(token -> !(token.matches(".*[,!.]+.*") || token.matches(".*\\d+.*") || (token.matches(".*[a-zA-Z]+.*") && token.matches(".*[-]{2,}.*")))).count()

    // Old Solution:
    public static int countValidWords(String sentence) {
        
        String[] tokens = sentence.split(" ");
        int counter = 0;
        for (String token:tokens) {
            if (isValid(token)) {
                counter++;
            }
        }

        return counter;
        // punctuationCheck = true if token has a punctuation mark
    }
        // hyphenCheck = true if token has hyphens without a letter or has two or more hyphens

        // digitCheck = true if token has a digit
    private static boolean isValid(String token) {
        boolean punctuationCheck = false;
        boolean hyphenCheck = false;
        boolean digitCheck = false;

        for (int i=0; i<token.length(); i++) {
            char ch = token.charAt(i);
            if (!punctuationCheck) {
                if (isPuncuationMark(ch)) {
                    punctuationCheck = true;
                }
            }
            if (!digitCheck) {
                if (Character.isDigit(ch)) {
                    digitCheck = true;
                }
            }
            if (!hyphenCheck) {
                if (ch == '-') {
                    // Check if a token doesn't have a hyphen at the beginning or at the end
                    if (i == 0 || i == token.length() - 1) {
                        hyphenCheck = true;
                        continue;
                    }
                    // Check if a token has a hyphen without a letter before and after the hyphen
                    char prevCharacter = token.charAt(i - 1);
                    char nextCharacter = token.charAt(i + 1);
                    if (!Character.isLowerCase(prevCharacter) || !Character.isLowerCase(nextCharacter)) {
                        hyphenCheck = true;
                        continue;
                    }
                    // Check if a token has two or more hyphens
                    if (i < token.length() - 2) {
                        char nextCharacter = token.charAt(i + 1);
                        char nextnextCharacter = token.charAt(i + 2);
                        if (nextCharacter == '-' && nextnextCharacter == '-') {
                            hyphenCheck = true;
                        }
                    }
                }
            }
        }
        if (punctuationCheck || digitCheck || hyphenCheck) return false;
        return true;
    }

    private static boolean isPuncuationMark(char ch) {
        ArrayList<Character> listOfPunctuationMarks = new ArrayList<>();
        listOfPunctuationMarks.add('!');
        listOfPunctuationMarks.add(',');
        listOfPunctuationMarks.add('.');
        return listOfPunctuationMarks.contains(ch);
    }
}