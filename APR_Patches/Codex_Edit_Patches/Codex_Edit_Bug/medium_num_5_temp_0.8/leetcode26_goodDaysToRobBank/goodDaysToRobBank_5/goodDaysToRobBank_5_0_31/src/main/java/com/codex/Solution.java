package com.codex;

import java.util.*;

public class Solution {
    public static String commonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";

        int i = 0;
        for (; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, i);
    }

    public static String longestPalindrome(String s) {

        if (s == null || s.length() == 0) return "";

        int length = s.length();
        String result = "";
        for (int i = 0; i < length; i++) {

        int end = security.length - time;
        for (int i = time; i <= end; i++) {
            int j = 0;
            for (j = 1; j <= time; j++) {
                if (i - j < 0 || i + j >= length) break;
                if (s.charAt(i - j) != s.charAt(i + j)) break;
                if (j * 2 + 1 > result.length()) result = s.substring(i - j, i + j + 1);
            }
        }

        for (int i = 0; i < length; i++) {
            int j = 0;
            for (j = 1; j <= length; j++) {
                if (i - j + 1 < 0 || i + j >= length) break;
                if (s.charAt(i - j + 1) != s.charAt(i + j)) break;
                if (j * 2 > result.length()) result = s.substring(i - j + 1, i + j + 1);
            }
        }
        return result;
    }
}