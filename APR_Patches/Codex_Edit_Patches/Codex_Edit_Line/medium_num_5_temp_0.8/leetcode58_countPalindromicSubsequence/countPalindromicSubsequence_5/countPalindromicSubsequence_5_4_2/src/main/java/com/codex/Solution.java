package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        
        if (s == null || s.length() < 3) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                int count = 0;
                while (i + count < s.length() && j + count < s.length() && s.charAt(i + count) == s.charAt(j + count)) {
                    res++;
                }
            }
        }
        return res;
    }

    
}