package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        /** A substring is a contiguous (non-empty) sequence of characters within a string.
         * A vowel substring is a substring that only consists of vowels ('a', 'e', 'i', 'o', and 'u') and has all five vowels present in it.
         * Given a string word, return the number of vowel substrings in word.
         */
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                boolean hasAllVowels = true;
                for (Character vowel : vowels) {
                    if (!word.substring(i, j + 1).contains(vowel.toString())) {
                        hasAllVowels = false;
                    }
                }
                if (hasAllVowels) {
                    result++;
                }
            }
        }
        return result;
    }

    }