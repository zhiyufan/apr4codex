package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s, String t) {
        
        if (s == null || s.length() < 3) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            for (int j = 0; j < t.length() - 2; j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    res++;
                }
            }
        }
        return res;
    }

    
}