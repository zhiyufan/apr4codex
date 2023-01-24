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

        int res = 0;
        for (int i = 1; i < word.length(); i++) {
            res += Math.min(move(word.charAt(i - 1), word.charAt(i)), 26 - move(word.charAt(i - 1), word.charAt(i)));
        }
        return res;
    }

    private static int move(char c1, char c2) {
        int num1 = c1 - 'a';
        int num2 = c2 - 'a';
        return Math.abs(num1 - num2);
    }

    /**
     * 943. Find the Shortest Superstring
     */

    }