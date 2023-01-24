package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        /** There is a special typewriter with lowercase English letters 'a' to 'z' arranged in a circle with a pointer. A character can only be typed if the pointer is pointing to that character. The pointer is initially pointing to the character 'a'.
         * Each second, you may perform one of the following operations:
         * Move the pointer one character counterclockwise or clockwise.
         * Type the character the pointer is currently on.
         * Given a string word, return the minimum number of seconds to type out the characters in word.
         */

        int[] pos = new int[26];
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            pos[ch - 'a'] = i++;
        }

        int cur = 0, res = 0;
        for (char ch : word.toCharArray()) {
            res += Math.min(Math.abs(pos[ch - 'a'] - cur), 26 - Math.abs(pos[ch - 'a'] - cur)) + 1;
            cur = pos[ch - 'a'];
        }
        return res;
    }}