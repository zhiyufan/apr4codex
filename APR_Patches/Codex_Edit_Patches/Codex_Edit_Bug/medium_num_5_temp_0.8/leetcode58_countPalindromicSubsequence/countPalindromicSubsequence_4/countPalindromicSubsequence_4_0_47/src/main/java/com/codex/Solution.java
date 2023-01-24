package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        
        Set<String> set = new HashSet<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                boolean isP = true;
                for (int k = j; k < j + i / 2; k++) {
                    if (s.charAt(k) != s.charAt(j + i - k)) {
                        isP = false;
                        break;
                    }
                }
                if (isP) {
                    set.add(s.substring(j, j + i + 1));
                }
            }
        }
        return set.size();
    }
}