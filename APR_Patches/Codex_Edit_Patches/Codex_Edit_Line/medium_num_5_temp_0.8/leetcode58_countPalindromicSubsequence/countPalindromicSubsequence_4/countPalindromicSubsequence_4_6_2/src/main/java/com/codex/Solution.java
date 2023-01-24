package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        
        Set<String> set = new HashSet<>();
        int len = s.length();
        for (int i = 0; i < len - 3; i++) {
            for (int j = i + 3; j < len; j++) {
                if (s.charAt(i) == s.charAt(j) && s.charAt(i+1) == s.charAt(j-1)) {
                    set.add(s.substring(i, j + 2));
                }
            }
        }
        return set.size();
    }

    
}