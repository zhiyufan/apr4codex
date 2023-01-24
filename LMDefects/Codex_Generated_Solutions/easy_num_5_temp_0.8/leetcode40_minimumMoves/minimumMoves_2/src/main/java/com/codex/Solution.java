package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        /** You are given a string s consisting of n characters which are either 'X' or 'O'.
         * A move is defined as selecting three consecutive characters of s and converting them to 'O'. Note that if a move is applied to the character 'O', it will stay the same.
         * Return the minimum number of moves required so that all the characters of s are converted to 'O'.
         */
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2) && s.charAt(i) == 'X') {
                count++;
                i += 2;
            }
        }
        return count;
    }

    }