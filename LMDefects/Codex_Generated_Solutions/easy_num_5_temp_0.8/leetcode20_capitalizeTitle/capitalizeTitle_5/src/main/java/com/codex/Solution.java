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
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() <= 2) builder.append(words[i].toLowerCase());
            else {
                builder.append(words[i].substring(0, 1).toUpperCase());
                builder.append(words[i].substring(1, words[i].length()).toLowerCase());
            }
            builder.append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    }