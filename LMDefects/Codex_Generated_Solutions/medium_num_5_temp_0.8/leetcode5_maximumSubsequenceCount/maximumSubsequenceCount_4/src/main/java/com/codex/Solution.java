package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        /** You are given a 0-indexed string text and another 0-indexed string pattern of length 2, both of which consist of only lowercase English letters.
         * You can add either pattern[0] or pattern[1] anywhere in text exactly once. Note that the character can be added even at the beginning or at the end of text.
         * Return the maximum number of times pattern can occur as a subsequence of the modified text.
         * A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.
         */
        long res = 0;
        long[] a = new long[26];
        long[] b = new long[26];
        for (int i = 0; i < 26; i++) {
            a[i] = 0;
            b[i] = 0;
        }

        for (int i = 0; i < text.length(); i++) {
            a[text.charAt(i) - 'a']++;
        }
        for (int i = 0; i < pattern.length(); i++) {
            b[pattern.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            res += Math.min(a[i], b[i]);
        }
        return res;
    }

    }