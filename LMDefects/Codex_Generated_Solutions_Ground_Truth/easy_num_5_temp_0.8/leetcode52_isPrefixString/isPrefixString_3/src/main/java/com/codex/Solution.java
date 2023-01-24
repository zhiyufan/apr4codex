package com.codex;

import java.util.*;

public class Solution {
    public static boolean isPrefixString(String s, String[] words) {
        /** Given a string s and an array of strings words, determine whether s is a prefix string of words.
         * A string s is a prefix string of words if s can be made by concatenating the first k strings in words for some positive k no larger than words.length.
         * Return true if s is a prefix string of words, or false otherwise.
         */

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            sb.append(words[i]);

            if (sb.length() > s.length()) {
                return false;
            }

            if (sb.toString().equals(s)) {
                return true;
            }
        }

        return false;
    }

    }