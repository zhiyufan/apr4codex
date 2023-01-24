package com.codex;

import java.util.*;

public class Solution {
    /**
     * Count palindromic substrings
     */
    public static int countPalindromicSubstrings(String s) {
        Set<String> set = new HashSet<>();
        if (s.length() < 2) {
            return s.length();
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub)) {
                    set.add(sub);
                }
            }
        }
        return set.size();
    }

    /**
     * Count palindromic subsequences
     */
    public static int countPalindromicSubsequence(String s) {
        
        Set<String> set = new HashSet<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub)) {
                    set.add(sub);
                }
            }
        }

        return set.size();
    }
    private static boolean isPalindrome(String s) {
        //System.out.println(s);
        if (s.length() == 1) {
            return true;
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    
}