package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;

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
        int counterHyphens = 0;
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
                    char prevCharacter = token.charAt(i - 1);
                    char nextCharacter = token.charAt(i + 1);
                    if (i == 0) {
                        if (!Character.isLowerCase(nextCharacter)) {
                            hyphenCheck = true;
                            continue;
                        }
                    } else if (i == token.length() - 1) {
                        if (!Character.isLowerCase(prevCharacter)) {
                            hyphenCheck = true;
                            continue;
                        }
                    } else {
                        if (i != 0 && !Character.isLowerCase(prevCharacter) || !Character.isLowerCase(nextCharacter)) {
                            hyphenCheck = true;
                            continue;
                        }
                    } 
                    counterHyphens++;
                    if (counterHyphens > 1) numberOfHyphensCheck = true;
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