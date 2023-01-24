package com.codex;

import java.util.*;

public class Solution {
    public static int countWords(String[] words1, String[] words2) {
        /** Given two string arrays words1 and words2, return the number of strings that appear exactly once in each of the two arrays.
         */
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word : words2) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        int count = 0;
        for (Integer value : map.values()) {
            if (value == 2) {
                count++;
            }
        }
        return count;
    }

    }