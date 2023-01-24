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

        int minTime = 0;
        HashMap<Character, Integer> letterPosition = new HashMap<>();
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for(int i = 0; i < letters.length; i++) {
            letterPosition.put(letters[i], i);
        }

        for(int i = -1; i < word.length()-1; i++) {
            char current = i == -1 ? 'a' : word.charAt(i);
            char next = word.charAt(i+1);
            int currentPosition = letterPosition.get(current);
            int nextPosition = letterPosition.get(next);
            minTime += Math.min(Math.abs(nextPosition - currentPosition), 26 - Math.abs(nextPosition - currentPosition)) + 1;
        }
        return minTime;
    }

    }