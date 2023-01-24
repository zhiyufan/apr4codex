package com.codex;

import java.util.*;

public class Solution {
    public static int countWords(String[] words1, String[] words2) {
        /** Given two string arrays words1 and words2, return the number of strings that appear exactly once in each of the two arrays.
         */

        HashMap<String, Integer> count = new HashMap<>();
        int res = 0;

        for (String word : words1) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        for (String word : words2) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        for (String word : count.keySet()) {
            if (count.get(word) == 2) {
                res++;
            }
        }

        return res;
    }

    }