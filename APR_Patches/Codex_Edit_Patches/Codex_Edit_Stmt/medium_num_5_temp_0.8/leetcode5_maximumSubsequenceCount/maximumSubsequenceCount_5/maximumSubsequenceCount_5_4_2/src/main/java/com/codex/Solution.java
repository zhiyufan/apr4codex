package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {

        int textLength = text.length();
        int patternLength = pattern.length();
        int result = 0;
        int first = 0;
        int second = 0;
        
        if (patternLength == 2) {
            char firstChar = pattern.charAt(0);
            char secondChar = pattern.charAt(1);
            for (int i = 0; i < textLength; i++) {
                if (text.charAt(i) == firstChar) {
                    first = i + 1;
                }
                if (text.charAt(i) == secondChar) {
                    second = i + 1;
                }
                if (second > first) {
                    result += (second - first - 1);
                }
            }
            indexes.add(i);
            charToIndexes.put(c, indexes);
        }

        List<Integer> firstIndexes = charToIndexes.get(pattern.charAt(0));
        List<Integer> secondIndexes = charToIndexes.get(pattern.charAt(1));
        firstIndexes.add(text.length());
        secondIndexes.add(text.length());

        int firstIndex = 0;
        int secondIndex = 0;
        int first = -1;
        int second = -1;
        while (firstIndex < firstIndexes.size() && secondIndex < secondIndexes.size()) {
            if (firstIndexes.get(firstIndex) < secondIndexes.get(secondIndex)) {
                first = firstIndexes.get(firstIndex);
                firstIndex++;
            } else {
                second = secondIndexes.get(secondIndex);
                secondIndex++;
            }
            if (second != -1) {
                result += second - first - 1;
            }
        }

        return result;
    }

    
}