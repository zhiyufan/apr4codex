package com.codex;

import java.util.*;

public class Solution {
    public static boolean areOccurrencesEqual(String s) {
        /** Given a string s, return true if s is a good string, or false otherwise.
         * A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).
         */

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        }