package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String s = "aaaabaaa";
        System.out.println(longestPalindromicSubstring(s));
    }

    public static String longestPalindromicSubstring(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int begin = 0;
        int end = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = getMaxLength(s, i, i);
            int len2 = getMaxLength(s, i, i+1);
            int len = Math.max(len1, len2);
            if (len > end - begin + 1) {
                begin = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(begin, end+1);
    }

    public int getMaxLength(String s, int left, int right) {
        while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left --;
            right ++;
        }
        return right - left - 1;
    }
}