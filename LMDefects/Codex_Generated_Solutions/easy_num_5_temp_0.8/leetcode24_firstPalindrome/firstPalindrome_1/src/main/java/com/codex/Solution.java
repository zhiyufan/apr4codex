package com.codex;

import java.util.*;

public class Solution {
    public static String firstPalindrome(String[] words) {
        /** Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".
         * A string is palindromic if it reads the same forward and backward.
         */
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    private static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    }