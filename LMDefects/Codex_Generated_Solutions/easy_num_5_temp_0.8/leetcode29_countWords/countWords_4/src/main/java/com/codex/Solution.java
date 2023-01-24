package com.codex;

import java.util.*;

public class Solution {
    public static int countWords(String[] words1, String[] words2) {
        /** Given two string arrays words1 and words2, return the number of strings that appear exactly once in each of the two arrays.
         */
        HashMap<String, Integer> map1 = new HashMap<>();
        for (String string : words1) {
            map1.put(string, map1.getOrDefault(string, 0) + 1);
        }
        HashMap<String, Integer> map2 = new HashMap<>();
        for (String string : words2) {
            map2.put(string, map2.getOrDefault(string, 0) + 1);
        }

        int result = 0;
        for (String s : words1) {
            if (map1.get(s) == 1 && map2.containsKey(s) && map2.get(s) == 1) {
                result++;
            }
        }

        for (String s : words2) {
            if (map2.get(s) == 1 && map1.containsKey(s) && map1.get(s) == 1) {
                result++;
            }
        }

        return result;
    }
}}