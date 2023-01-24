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
        if (s == null || s.length() < 3) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            for (int j = i + 2; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    res++;
                }
            }
        }
        return res;
    }

    }