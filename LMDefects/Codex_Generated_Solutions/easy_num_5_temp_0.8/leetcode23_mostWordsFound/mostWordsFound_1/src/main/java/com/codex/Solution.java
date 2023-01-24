package com.codex;

import java.util.*;

public class Solution {
    public static int mostWordsFound(String[] sentences) {
        /** A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
         * You are given an array of strings sentences, where each sentences[i] represents a single sentence.
         * Return the maximum number of words that appear in a single sentence.
         */
        int max = 0;
        for (String sentence : sentences) {
            int count = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max + 1;
    }
}}