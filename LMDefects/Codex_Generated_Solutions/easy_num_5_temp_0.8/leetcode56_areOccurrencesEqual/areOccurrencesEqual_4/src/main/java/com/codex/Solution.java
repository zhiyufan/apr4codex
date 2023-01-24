package com.codex;

import java.util.*;

public class Solution {
    public static boolean areOccurrencesEqual(String s) {
        /** Given a string s, return true if s is a good string, or false otherwise.
         * A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).
         */

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.putIfAbsent(c, 0);
            map.computeIfPresent(c, (k, v) -> v + 1);
        }

        int occurrences = 0;
        for (char c : s.toCharArray()) {
            if (occurrences == 0) {
                occurrences = map.get(c);
            } else {
                if (map.get(c) != occurrences) {
                    return false;
                }
            }
        }

        return true;
    }

    }