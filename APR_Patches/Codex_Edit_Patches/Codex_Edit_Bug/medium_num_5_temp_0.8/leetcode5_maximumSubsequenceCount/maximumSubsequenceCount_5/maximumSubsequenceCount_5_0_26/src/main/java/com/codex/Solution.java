package com.codex;

import java.util.*;

public class Solution {
 public static long maximumSubsequenceCount(String text, String pattern) {
        long result = text.length();
        Map<Character, List<Integer>> charToIndexes = new HashMap<>();
        for (int i = 1; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == pattern.charAt(0)) {
                result++;
            } else if (c == pattern.charAt(1)) {
                List<Integer> indexes = charToIndexes.get(pattern.charAt(0));
                if (indexes == null) {
                    continue;
                }
                int index = Collections.binarySearch(indexes, i);
                if (index < 0) {
                    index = -index - 1;
                }
                if (index != 0) {
                    result += indexes.get(index - 1) - i;
                }
            }
            
            List<Integer> indexes = charToIndexes.get(c);
            if (indexes == null) {
                indexes = new ArrayList<>();
            }
            indexes.add(i);
            charToIndexes.put(c, indexes);
        }
    
        return result;
    }
    

    
}