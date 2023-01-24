package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        /** You are given two strings s and t. In one step, you can append any character to either s or t.
         * Return the minimum number of steps to make s and t anagrams of each other.
         * An anagram of a string is a string that contains the same characters with a different (or the same) ordering.
         */
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int steps = 0;
        for (char c : t.toCharArray()) {
            if (freq[c - 'a'] == 0) {
                steps++;
            } else {
                freq[c - 'a']--;
            }
        }
        return steps;
    }

    }