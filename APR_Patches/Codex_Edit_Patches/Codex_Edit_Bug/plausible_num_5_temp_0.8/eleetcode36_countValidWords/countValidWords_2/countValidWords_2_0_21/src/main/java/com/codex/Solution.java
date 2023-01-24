package com.codex;

import java.util.*;

public class Solution {
public class WordsCounter {

    public static void main(String[] args) {
        String sentence = "Hello, world! I have 2 apples and 1 pine apple";
        System.out.println(countValidWords(sentence));
    }

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
        int hyphenCheck = 0;
        boolean digitCheck = false;
        int numberOfHyphensCheck = 0;

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
            if (hyphenCheck < 2 && numberOfHyphensCheck < 1) {
                if (ch == '-') {
                    if (i == 0 || i == token.length() - 1) {
                        hyphenCheck++;
                        continue;
                    }
                    char prevCharacter = token.charAt(i - 1);
                    char nextCharacter = token.charAt(i + 1);
                    if (!Character.isLowerCase(prevCharacter) || !Character.isLowerCase(nextCharacter)) {
                        hyphenCheck++;
                        continue;
                    }
                    numberOfHyphensCheck++;
                    continue;
                }
            }
        }
        if (punctuationCheck || digitCheck || hyphenCheck > 1) return false;
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
}