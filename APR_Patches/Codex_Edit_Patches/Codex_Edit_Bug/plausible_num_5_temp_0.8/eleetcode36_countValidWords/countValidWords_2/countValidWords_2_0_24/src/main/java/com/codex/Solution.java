package com.codex;

import java.util.*;

public class Solution {
public class Main {
    public static void main(String[] args) {
        String text = "Hello, this is a text. How are you?\n";
        System.out.println(countValidWords(text));
    }

    public static int countValidWords(String text) {
        int counter = 0;
        String[] tokens = text.split(" ");
        for (String token : tokens) {
            if (isValid(token))
                counter++;
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