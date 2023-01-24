package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long res = 0;
        long[] a = new long[26];
        long[] b = new long[26];
        
        if (text.length() < pattern.length()) {
            return 0;
        }

        for (int i = 0; i < 26; i++) {
            a[i] = 0;
            b[i] = 0;
        }
        for (int i = 0; i < text.length(); i++) {
            a[text.charAt(i) - 'a']++;
        }
        for (int i = 0; i < pattern.length(); i++) {
            b[pattern.charAt(i) - 'a']++;
        }

        long min = 0;
        long tmp = 0;
        long count = 0;
        long len = 0;
        for (char c : pattern.toCharArray()) {
            if (b[c - 'a'] > 1 && len > pattern.length()) {
                min = Math.max(min, tmp);
                tmp = 0;
            }
            count = Math.min(b[c - 'a'], a[c - 'a']);
            tmp += count;
            len++;
        }

        return Math.max(min, tmp);

    }

    
}