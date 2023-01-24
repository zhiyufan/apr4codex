package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] letters = new int[26];
        int res = 0;
        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            letters[c - 'a']--;
        }
        for (int i : letters) {
            res += Math.abs(i);
        }
        return res / 2;
    }

    public static String shortestPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().substring(0, s.length() - getCommonLength(s)) + s;
    }
    private static int getCommonLength(String str) {
        
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        int length = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (str.startsWith(rev.substring(i))) {
                length = rev.substring(i).length();
                break;
            }
        }
        return length;
    }
}