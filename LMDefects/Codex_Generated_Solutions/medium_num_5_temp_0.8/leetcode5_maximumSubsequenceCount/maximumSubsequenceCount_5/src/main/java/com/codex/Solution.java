package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        /** You are given a 0-indexed string text and another 0-indexed string pattern of length 2, both of which consist of only lowercase English letters.
         * You can add either pattern[0] or pattern[1] anywhere in text exactly once. Note that the character can be added even at the beginning or at the end of text.
         * Return the maximum number of times pattern can occur as a subsequence of the modified text.
         * A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.
         */
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