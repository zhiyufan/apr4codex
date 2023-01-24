package com.codex;

import java.util.*;

public class Solution {
    public static String reversePrefix(String word, char ch) {
        /** Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
         * For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
         * Return the resulting string.
         */
        int index = word.indexOf(ch);
        if (index != -1) {
            return reverse(word.substring(0, index + 1)) + word.substring(index + 1);
        }
        return word;
    }

    }