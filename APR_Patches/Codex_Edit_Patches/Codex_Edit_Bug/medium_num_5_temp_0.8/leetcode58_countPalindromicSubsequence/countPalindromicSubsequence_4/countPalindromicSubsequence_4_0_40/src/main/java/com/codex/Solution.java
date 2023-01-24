package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        
        Set<String> set = new HashSet<>();
        int len = s.length();
        for (int i = 0; i < s.length(); ++i) {
            for (int j = 0, k = len - 1; j < k; ++j, --k) {
                if (j <= i && k >= i) continue;
                if (s.charAt(j) != s.charAt(k)) continue;
                set.add(s.substring(j, k + 1));
            }
        }
        return set.size();
    }

    
}