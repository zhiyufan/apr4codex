package com.codex;

import java.util.*;

public class Solution {
    public static long countVowels(String word) {
        /** Given a string word, return the sum of the number of vowels ('a', 'e', 'i', 'o', and 'u') in every substring of word.
         * A substring is a contiguous (non-empty) sequence of characters within a string.
         * Note: Due to the large constraints, the answer may not fit in a signed 32-bit integer. Please be careful during the calculations.
         */
        long count = 0;
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for (int i = 0; i < word.length(); i++) {
            for (int j = i+1; j <= word.length(); j++) {
                String sub = word.substring(i, j);
                for (int k = 0; k < sub.length(); k++) {
                    if (vowels.contains(sub.charAt(k))) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    }