package com.codex;

import java.util.*;

public class Solution {
    public static int countValidWords(String sentence) {
        
        String[] tokens = sentence.split(" ");
        int counter = 0;
        boolean hyphenCheck = false;
        for (String token:tokens) {
            if (isValid(token, hyphenCheck)) {
                counter++;
            }
        }

        return counter;
    }

    private static boolean isValid(String token, boolean hyphenCheck) {
        boolean punctuationCheck = false;
        boolean digitCheck = false;
        boolean numberOfHyphensCheck = false;

        for (int i=0; i<token.length(); i++) {
            char ch = token.charAt(i);
            if (!punctuationCheck) {
                if (isPuncuationMark(ch)) {
                    punctuationCheck = true;
                    continue;
                }
            }
            if (!digitCheck) {
                if (Character.isDigit(ch)) {
                    digitCheck = true;
                    continue;
                }
            }
            if (!hyphenCheck && !numberOfHyphensCheck) {
                if (ch == '-') {
                    if (hyphenCheck || i == 0 || i == token.length() - 1) {
                        hyphenCheck = true;
                        continue;
                    }
                    hyphenCheck = true;
                    numberOfHyphensCheck = true;
                    continue;
                }
            }
        }
        if (punctuationCheck || digitCheck) return false;
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