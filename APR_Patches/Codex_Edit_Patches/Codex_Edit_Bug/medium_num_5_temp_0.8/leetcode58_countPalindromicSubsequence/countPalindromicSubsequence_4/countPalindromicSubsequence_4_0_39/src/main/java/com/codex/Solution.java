package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        
        Set<String> set = new HashSet<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len - i - 1; j++) {
                if (s.charAt(i) == s.charAt(i + j)) {
                    set.add(s.substring(i, j + i + 1));
                }
            }
        }
        return set.size();
    }

    
}