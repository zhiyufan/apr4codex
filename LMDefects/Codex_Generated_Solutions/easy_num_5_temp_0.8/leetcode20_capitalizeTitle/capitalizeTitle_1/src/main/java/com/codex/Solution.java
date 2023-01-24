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
        StringBuilder newTitle = new StringBuilder();
        for (String word : words) {
            if (word.length() == 1 || word.length() == 2) {
                newTitle.append(word.toLowerCase() + " ");
            } else {
                newTitle.append(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ");
            }
        }
        return newTitle.toString().trim();
    }
}}