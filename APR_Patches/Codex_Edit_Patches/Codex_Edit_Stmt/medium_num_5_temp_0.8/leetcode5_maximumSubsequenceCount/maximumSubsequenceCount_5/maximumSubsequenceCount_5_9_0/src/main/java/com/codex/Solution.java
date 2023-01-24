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

        int firstIndex = 0, secondIndex = 0;
        int first = -1, second = -1;
        while (firstIndex < firstIndexes.size() && secondIndex < secondIndexes.size() && first != text.length()) {
            if (firstIndexes.get(firstIndex) < secondIndexes.get(secondIndex)) {
                first = firstIndexes.get(firstIndex);
                firstIndex++;
            } else {
                second = secondIndexes.get(secondIndex);
                secondIndex++;
            }
            result += Math.max(second - first - 1, 0);
        }

        return result;
    }

    
}