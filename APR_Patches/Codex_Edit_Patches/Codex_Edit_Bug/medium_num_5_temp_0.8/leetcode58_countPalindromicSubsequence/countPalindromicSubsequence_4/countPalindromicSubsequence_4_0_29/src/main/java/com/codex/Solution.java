package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        
        Set<String> set = new HashSet<>();
        int len = s.length();
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 2; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (s.charAt(i + 1) == s.charAt(j - 1)) {
                        set.add(s.substring(i, j + 1));
                    }
                }
            }
        }
        return set.size();
    }

    
}