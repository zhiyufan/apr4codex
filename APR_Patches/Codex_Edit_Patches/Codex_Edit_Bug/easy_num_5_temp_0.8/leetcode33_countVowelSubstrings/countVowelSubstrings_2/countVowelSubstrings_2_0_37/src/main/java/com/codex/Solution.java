package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            result += isVowelSubstring(word.substring(i));
        }

        return result;
    }

    private static boolean isVowelSubstring(String str) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        int[] freq = new int[vowels.length];
        int maxSubstring = str.length();
        for (int i = 0; i < vowels.length; i++) {
            freq[i] = countVowels(str, vowels[i]);
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) {
                return false;
            }
        }
        return true;
    }
}