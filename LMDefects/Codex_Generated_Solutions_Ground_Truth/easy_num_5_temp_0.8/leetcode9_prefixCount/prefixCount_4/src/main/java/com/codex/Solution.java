package com.codex;

import java.util.*;

public class Solution {
    public static int prefixCount(String[] words, String pref) {
        /** You are given an array of strings words and a string pref.
         * Return the number of strings in words that contain pref as a prefix.
         * A prefix of a string s is any leading contiguous substring of s.
         */
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(pref)) {
                count++;
            }
        }
        return count;
    }

    }