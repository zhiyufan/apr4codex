package com.codex;

import java.util.*;

public class Solution {
    public static int countValidWords(String sentence) {
        
        String[] tokens = sentence.split(" ");
        int counter = 0;
        for (String token:tokens) {
            if (isValid(token)) {
                counter++;
            }
        }

        return counter;
    }

    private static boolean isValid(String token) {
        boolean punctuationCheck = false;
        boolean hyphenCheck = false;
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
                    if (i == 0 || i == token.length() - 1) {
                        hyphenCheck = true;
                        continue;
                    }
                    char prevCharacter = token.charAt(i - 1);
                    char nextCharacter = token.charAt(i + 1);
                    if (!Character.isLowerCase(prevCharacter) || !Character.isLowerCase(nextCharacter)) {
                        hyphenCheck = true;
                        continue;
                    }
                    numberOfHyphensCheck = true;
                    continue;
                }
            }
        }
        if (punctuationCheck || digitCheck || hyphenCheck) return false;
        return true;
    }

    private static boolean isPuncuationMark(char ch) {
        ArrayList<Character> listOfPunctuationMarks = new ArrayList<>();
        listOfPunctuationMarks.add('!');
        listOfPunctuationMarks.add('.');
        return listOfPunctuationMarks.contains(ch);
    }
}