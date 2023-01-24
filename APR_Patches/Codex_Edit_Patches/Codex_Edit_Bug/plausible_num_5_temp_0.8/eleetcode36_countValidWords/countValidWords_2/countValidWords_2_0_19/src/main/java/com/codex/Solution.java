package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(countValidWords("Hey, hi, hello, what's up?")); // 2
        System.out.println(countValidWords("1 a 2, b 3? x -y, z")); // 3
        System.out.println(countValidWords("If you've two books and I have two books, then together we have, dum-de-dum-dum, four books.")); // 10
    }

    public static int countValidWords(String input) {

        String[] tokens = input.split(" ");
        int counter = 0;

        for (String token : tokens) {
            if (isValid(token)) {
                counter++;
            }
        }

        return counter;
    }

    private static boolean isValid(String token) {
        boolean containsPunctuation = false;
        boolean containsDigit = false;
        boolean containsHyphen = false;
        boolean isFirstCharacterOfTheWord = true;
        boolean isLastCharacterOfTheWord = false;
        boolean isFirstHyphenOfTheWord = true;
        boolean isLastHyphenOfTheWord = false;
        int counter = 0;
        for (int i = 0; i < token.length(); i++) {
            char ch = token.charAt(i);
            if (isPunctuationMark(ch)) {
                containsPunctuation = true;
                break;
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
        listOfPunctuationMarks.add(',');
        listOfPunctuationMarks.add('.');
        return listOfPunctuationMarks.contains(ch);
    }
}