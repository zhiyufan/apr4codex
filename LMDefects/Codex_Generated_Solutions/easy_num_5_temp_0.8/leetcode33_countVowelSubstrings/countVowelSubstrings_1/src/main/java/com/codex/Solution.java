package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        /** A substring is a contiguous (non-empty) sequence of characters within a string.
         * A vowel substring is a substring that only consists of vowels ('a', 'e', 'i', 'o', and 'u') and has all five vowels present in it.
         * Given a string word, return the number of vowel substrings in word.
         */
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                String sub = word.substring(i, j);
                if (sub.contains("a") && sub.contains("e") && sub.contains("i") && sub.contains("o") && sub.contains("u")) {
                    count++;
                }
            }
        }
        return count;
    }

    }