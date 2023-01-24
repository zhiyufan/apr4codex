package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        /** You are given two strings s and t. In one step, you can append any character to either s or t.
         * Return the minimum number of steps to make s and t anagrams of each other.
         * An anagram of a string is a string that contains the same characters with a different (or the same) ordering.
         */
        int[] sArray = new int[26];
        int[] tArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sArray[s.charAt(i) - 'a']++;
            tArray[t.charAt(i) - 'a']++;
        }
        int result = 0;
        for (int i = 0; i < 26; i++) {
            result += Math.abs(sArray[i] - tArray[i]);
        }
        return result / 2;
    }

    }