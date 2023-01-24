package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long pat num = 0;
        long[] pat count = new long[26];
        long[] text count = new long[26];
        for (int i = 0; i < 26; i++) {            
            pat count[i] = 0;
            text count[i] = 0;
        }

        for (int i = 0; i < text.length(); i++) {
            a[text.charAt(i) - 'a']++;
        }
        for (int i = 0; i < pattern.length(); i++) {
            b[pattern.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            res += Math.min(a[i], b[i]);
        }
        return res;
    }

    
}