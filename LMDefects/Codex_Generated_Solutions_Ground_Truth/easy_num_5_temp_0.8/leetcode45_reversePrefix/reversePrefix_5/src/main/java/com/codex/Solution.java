package com.codex;

import java.util.*;

public class Solution {
    public static String reversePrefix(String word, char ch) {
        /** Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
         * For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
         * Return the resulting string.
         */
        String word1 = "";
        String word2 = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                word1 = word.substring(0, i + 1);
                word2 = word.substring(i + 1);
                word1 = reverse(word1);
                word = word1 + word2;
                break;
            }
        }
        return word;
    }

    }