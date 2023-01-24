package com.codex;

import java.util.*;

public class Solution {
    public static int countValidWords(String sentence) {
        /** A sentence consists of lowercase letters ('a' to 'z'), digits ('0' to '9'), hyphens ('-'), punctuation marks ('!', '.', and ','), and spaces (' ') only. Each sentence can be broken down into one or more tokens separated by one or more spaces ' '.
         * A token is a valid word if all three of the following are true:
         * It only contains lowercase letters, hyphens, and/or punctuation (no digits).
         * There is at most one hyphen '-'. If present, it must be surrounded by lowercase characters ("a-b" is valid, but "-ab" and "ab-" are not valid).
         * There is at most one punctuation mark. If present, it must be at the end of the token ("ab,", "cd!", and "." are valid, but "a!b" and "c.," are not valid).
         * Examples of valid words include "a-b.", "afad", "ba-c", "a!", and "!".
         * Given a string sentence, return the number of valid words in sentence.
         */
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
        int numberOfHyphensCheck = 0;

        for (int i=0; i<token.length(); i++) {
            char ch = token.charAt(i);
            if (!punctuationCheck) {
                if (isPuncuationMark(ch) && i != token.length() - 1) {
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
            if (!hyphenCheck && numberOfHyphensCheck <=1) {
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
                    numberOfHyphensCheck++;
                    continue;
                }
            }
        }
        if (punctuationCheck || digitCheck || hyphenCheck || numberOfHyphensCheck > 1) return false;
        return token.length() != 0;
    }

    private static boolean isPuncuationMark(char ch) {
        ArrayList<Character> listOfPunctuationMarks = new ArrayList<>();
        listOfPunctuationMarks.add('!');
        listOfPunctuationMarks.add(',');
        listOfPunctuationMarks.add('.');
        return listOfPunctuationMarks.contains(ch);
    }}