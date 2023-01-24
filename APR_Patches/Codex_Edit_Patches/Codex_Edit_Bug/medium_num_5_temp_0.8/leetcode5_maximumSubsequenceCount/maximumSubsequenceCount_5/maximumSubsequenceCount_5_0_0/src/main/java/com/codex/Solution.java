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
        List<Integer> secondIndexes = charToIndexes.get(pattern.charAt(1));
        firstIndexes.add(text.length());
        secondIndexes.add(text.length());

        int firstIndex = 0;
        int secondIndex = 0;
        while (firstIndex < firstIndexes.size() && secondIndex < secondIndexes.size()) {
            int first = firstIndexes.get(firstIndex);
            int second = secondIndexes.get(secondIndex);
            if (first < second) {
                firstIndex++;
            } else {
                secondIndex++;
            }
            result += second - first - 1;
        }

        return result;
    }

    
}