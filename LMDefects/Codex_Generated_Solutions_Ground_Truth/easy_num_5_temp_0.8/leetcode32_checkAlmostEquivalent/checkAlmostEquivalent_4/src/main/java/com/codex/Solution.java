package com.codex;

import java.util.*;

public class Solution {
    public static boolean checkAlmostEquivalent(String word1, String word2) {
        /** Two strings word1 and word2 are considered almost equivalent if the differences between the frequencies of each letter from 'a' to 'z' between word1 and word2 is at most 3.
         * Given two strings word1 and word2, each of length n, return true if word1 and word2 are almost equivalent, or false otherwise.
         * The frequency of a letter x is the number of times it occurs in the string.
         */
        Map<Character, Integer> map1 = new TreeMap<>();
        Map<Character, Integer> map2 = new TreeMap<>();
        for (int i = 0; i < word1.length(); i++) {
            char ch = word1.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (int j = 0; j < word2.length(); j++) {
            char ch2 = word2.charAt(j);
            map2.put(ch2, map2.getOrDefault(ch2, 0) + 1);
        }
        int diff = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            diff += Math.abs(map1.getOrDefault(c, 0) - map2.getOrDefault(c, 0));
        }
        return diff <= 3;
    }

    }