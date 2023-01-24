package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long result = 0;
        Map<Character, List<Integer>> charToIndexes = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            List<Integer> indexes = charToIndexes.get(c);
            if (indexes == null) {
                indexes = new ArrayList<>();
            }
            indexes.add(i);
            charToIndexes.put(c, indexes);
        }

        List<Integer> firstIndexes = charToIndexes.get(pattern.charAt(0));
        List<Integer> secondIndexes = charToIndexes.get(pattern.charAt(pattern.length() - 1));
        firstIndexes.add(text.length());
        secondIndexes.add(text.length());

        int firstIndex = 0;
        int secondIndex = 0;
        int first = -1;
        int second = -1;
        for (int i = 1; i < pattern.length() - 1; i++) {
            List<Integer> indexes = charToIndexes.get(pattern.charAt(i));
            for (int index : indexes) {
                while (firstIndex < firstIndexes.size() && firstIndexes.get(firstIndex) <= index) {
                    first = firstIndexes.get(firstIndex);
                    firstIndex++;
                }
                while (secondIndex < secondIndexes.size() && secondIndexes.get(secondIndex) <= index) {
                    second = secondIndexes.get(secondIndex);
                    secondIndex++;
                }
                if (second != -1) {
                    result += second - first - 1;
                }
            }
        }

        return result;
    }

    
}