package com.codex;

import java.util.*;

public class Solution {
    public static String firstPalindrome(String[] words) {
        /** Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".
         * A string is palindromic if it reads the same forward and backward.
         */
        if (words.length == 0) return "";
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                return words[i];
            }
        }
        return "";
    }

    }