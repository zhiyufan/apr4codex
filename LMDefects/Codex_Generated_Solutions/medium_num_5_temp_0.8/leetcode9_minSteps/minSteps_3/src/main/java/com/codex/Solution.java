package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        /** You are given two strings s and t. In one step, you can append any character to either s or t.
         * Return the minimum number of steps to make s and t anagrams of each other.
         * An anagram of a string is a string that contains the same characters with a different (or the same) ordering.
         */
        int[] letters = new int[26];
        int res = 0;
        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            letters[c - 'a']--;
        }
        for (int i : letters) {
            res += Math.abs(i);
        }
        return res / 2;
    }

    }