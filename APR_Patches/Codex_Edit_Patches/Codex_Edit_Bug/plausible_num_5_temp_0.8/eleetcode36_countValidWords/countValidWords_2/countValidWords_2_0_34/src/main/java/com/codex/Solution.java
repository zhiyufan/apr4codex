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
        return !(token.matches(".*\\d+.*") || token.matches(".*[!\\.,]+.*") || token.matches(".*[-][-].*")
                || token.matches("^[-].*|.*[-]$") || token.matches(".*[-][aA].*") || token.matches(".*[aA][-].*"));
    }

    private static boolean isPuncuationMark(char ch) {
        ArrayList<Character> listOfPunctuationMarks = new ArrayList<>();
        listOfPunctuationMarks.add('!');
        listOfPunctuationMarks.add(',');
        listOfPunctuationMarks.add('.');
        return listOfPunctuationMarks.contains(ch);
    }
}