package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        
        if (s == null || s.length() < 3) {
            return 0;
        }
        int res = 0;
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                total++;
                if (isPalindromic(s.substring(i, j + 1))) {
                    res++;
                }
            }
        }
        return res;   
    }
    
    private static boolean isPalindromic(String s) {
        int i = 0, j = s.length() -1 ;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    
}