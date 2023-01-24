package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        /** Given a string s, return the number of unique palindromes of length three that are a subsequence of s.
         * Note that even if there are multiple ways to obtain the same subsequence, it is still only counted once.
         * A palindrome is a string that reads the same forwards and backwards.
         * A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
         * For example, "ace" is a subsequence of "abcde".
         */
        Set<String> set = new HashSet<>();
        int len = s.length();
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 2; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    set.add(s.substring(i, j + 1));
                }
            }
        }
        return set.size();
    }

    }