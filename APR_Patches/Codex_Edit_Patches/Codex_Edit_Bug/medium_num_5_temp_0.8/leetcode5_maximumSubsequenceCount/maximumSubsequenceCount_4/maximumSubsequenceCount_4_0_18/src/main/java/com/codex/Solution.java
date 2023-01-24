package com.codex;

import java.util.*;

public class Solution {
public static long maximumSubsequenceCount(String text, String pattern) {
        
        long res = 0;
        long[] a = new long[123];
        long[] b = new long[123];
        for (int i = 0; i < 123; i++) {
            a[i] = 0;
            b[i] = 0;
        }

        for (int i = 0; i < text.length(); i++) {
            a[text.charAt(i) - 'a']++;
        }
        for (int i = 0; i < pattern.length(); i++) {
            b[pattern.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 123; i++) {
            res += Math.min(a[i], b[i]);
        }
        return res;
    }

    
}