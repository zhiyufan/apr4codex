package com.codex;

import java.util.*;

public class Solution {
    public static boolean checkAlmostEquivalent(String word1, String word2) {
        /** Two strings word1 and word2 are considered almost equivalent if the differences between the frequencies of each letter from 'a' to 'z' between word1 and word2 is at most 3.
         * Given two strings word1 and word2, each of length n, return true if word1 and word2 are almost equivalent, or false otherwise.
         * The frequency of a letter x is the number of times it occurs in the string.
         */
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            freq1[word1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            freq2[word2.charAt(i) - 'a']++;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freq1[i] - freq2[i] > 3 || freq2[i] - freq1[i] > 3) {
                return false;
            }
        }
        return true;
    }


    }