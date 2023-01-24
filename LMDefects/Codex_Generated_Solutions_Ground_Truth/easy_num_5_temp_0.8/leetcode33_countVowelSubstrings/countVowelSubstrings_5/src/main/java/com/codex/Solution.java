package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        /** A substring is a contiguous (non-empty) sequence of characters within a string.
         * A vowel substring is a substring that only consists of vowels ('a', 'e', 'i', 'o', and 'u') and has all five vowels present in it.
         * Given a string word, return the number of vowel substrings in word.
         */
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))) {
                count += word.length() - i;
            }
        }

        return count;
    }

    }