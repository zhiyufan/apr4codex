package com.codex;

import java.util.*;

public class Solution {
    public static String capitalizeTitle(String title) {
        /** You are given a string title consisting of one or more words separated by a single space, where each word consists of English letters. Capitalize the string by changing the capitalization of each word such that:
         * If the length of the word is 1 or 2 letters, change all letters to lowercase.
         * Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
         * Return the capitalized title.
         */
        List<String> words = Arrays.asList(title.split(" "));
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() >= 3) {
                words.set(i, words.get(i).substring(0, 1).toUpperCase() + words.get(i).substring(1).toLowerCase());
            } else {
                words.set(i, words.get(i).toLowerCase());
            }
        }
        return String.join(" ", words);
    }

    }