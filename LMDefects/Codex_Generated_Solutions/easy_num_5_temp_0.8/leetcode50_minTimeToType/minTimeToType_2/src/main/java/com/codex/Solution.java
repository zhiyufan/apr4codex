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

                if (word == null || word.length() == 0) {
            return 0;
        }

        int res = 0, len = word.length();
        int cur = 0;

        for (int i = 0; i < len; i++) {
            int next = word.charAt(i) - 'a';
            res += Math.min(Math.abs(next - cur), 26 - Math.abs(next - cur));
            cur = next;
        }

        return res;
    }

    }