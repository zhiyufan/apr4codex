package com.codex;

import java.util.*;

public class Solution {
    public static long countVowels(String word) {
        /** Given a string word, return the sum of the number of vowels ('a', 'e', 'i', 'o', and 'u') in every substring of word.
         * A substring is a contiguous (non-empty) sequence of characters within a string.
         * Note: Due to the large constraints, the answer may not fit in a signed 32-bit integer. Please be careful during the calculations.
         */

        long count = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                for (int k = i; k <= j; k++) {
                    if (isVowel(word.charAt(k))) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }}