package com.codex;

import java.util.*;

public class Solution {
    public static String capitalizeTitle(String title) {
        /** You are given a string title consisting of one or more words separated by a single space, where each word consists of English letters. Capitalize the string by changing the capitalization of each word such that:
         * If the length of the word is 1 or 2 letters, change all letters to lowercase.
         * Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
         * Return the capitalized title.
         */

        String[] words = title.split(" ");
        StringBuilder capitalizedTitle = new StringBuilder();
        for (String word : words) {
            if (word.length() == 1 || word.length() == 2) {
                word = word.toLowerCase();
                capitalizedTitle.append(word).append(" ");
            } else {
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
                capitalizedTitle.append(word).append(" ");
            }
        }
        return capitalizedTitle.toString().trim();
    }

    }