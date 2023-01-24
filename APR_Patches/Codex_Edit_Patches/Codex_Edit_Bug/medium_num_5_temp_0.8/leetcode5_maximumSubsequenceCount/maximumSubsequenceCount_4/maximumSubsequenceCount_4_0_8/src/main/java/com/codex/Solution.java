package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text1, String text2) {
        
        long res = 0;
        long[] a = new long[26];
        long[] b = new long[26];
        for (int i = 0; i < 26; i++) {
            a[i] = 0;
            b[i] = 0;
        }

        for (int i = 0; i < text1.length(); i++) {
            a[text1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < text2.length(); i++) {
            b[text2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            res += Math.min(a[i], b[i]);
        }
        return res;
    }

    
}