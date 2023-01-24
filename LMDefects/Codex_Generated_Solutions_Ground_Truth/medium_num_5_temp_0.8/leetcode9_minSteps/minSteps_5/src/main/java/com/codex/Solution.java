package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        /** You are given two strings s and t. In one step, you can append any character to either s or t.
         * Return the minimum number of steps to make s and t anagrams of each other.
         * An anagram of a string is a string that contains the same characters with a different (or the same) ordering.
         */
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        int step = 0;
        for (int i = 0; i < t.length(); i++) {
            hash[t.charAt(i) - 'a']--;
        }
        for(int h :hash)
            step+=Math.abs(h);
        return step;
    }

    }