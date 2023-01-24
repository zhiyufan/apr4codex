package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        
        Set<String> set = new HashSet<>();
        if (s.length() <= 1) return (s.length());
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
        	len++;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && isPal(s, i, j)) {
                    set.add(s.substring(i, j));
                }
            }
        }
        return set.size();
    }

    // return true if s is palindromic from i to j
    public static boolean isPal(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }
}