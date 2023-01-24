package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        
        if (s == null || s.length() < 3) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            for (int j = i + 2; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && palindromic(s, i, j)) {
                    res++;
                }
            }
        }
        return res;

        private static boolean palindromic(String s, int i, int j) {
            while (j - i >= 1) {
                if (s.charAt(j--) != s.charAt(i++)) {
                    return false;
                }
            }
            return true;
        }
    }

    
}