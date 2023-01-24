package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        Set<String> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                if (isPalin(s.substring(j, i + 1))) {
                    set.add(s.substring(j, i + 1));
                }
            }
        }
        return set.size();
    }

    private static boolean isPalin(String s) {
        int len = s.length();
        for (int i = 0, j = len - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}