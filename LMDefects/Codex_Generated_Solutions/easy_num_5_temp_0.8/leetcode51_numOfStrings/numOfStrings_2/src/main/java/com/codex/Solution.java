package com.codex;

import java.util.*;

public class Solution {
    public static int numOfStrings(String[] patterns, String word) {
        /** Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.
         * A substring is a contiguous sequence of characters within a string.
         */

        int count = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                count++;
            }
        }
        return count;
    }

    }