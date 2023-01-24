package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long result = 0;
        Map<Character, List<Integer>> charToIndexes = new HashMap<>();

        char first = pattern.charAt(0);
        char second = pattern.charAt(1);
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != first) {
                List<Integer> indexes = charToIndexes.get(first);
                if (indexes == null) {
                    indexes = new ArrayList<>();
                }
                indexes.add(i);
                charToIndexes.put(first, indexes);
            }
            if (text.charAt(i) != second) {
                List<Integer> indexes = charToIndexes.get(second);
                if (indexes == null) {
                    indexes = new ArrayList<>();
                }
                indexes.add(i);
                charToIndexes.put(second, indexes);
            }
        }

        List<Integer> firstIndexes = charToIndexes.get(first);
        List<Integer> secondIndexes = charToIndexes.get(second);
        firstIndexes.add(text.length());
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
                result += second - first;
            }
        }

        return result;
    }

    
}