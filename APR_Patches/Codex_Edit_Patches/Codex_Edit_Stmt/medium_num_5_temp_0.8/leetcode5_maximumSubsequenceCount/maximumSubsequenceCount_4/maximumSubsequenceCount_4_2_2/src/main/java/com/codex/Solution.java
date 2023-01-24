package com.codex;

import java.util.*;

public class Solution {
static final int ALPHABET_SIZE = 26;

    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long res = 0;
        long[] a = new long[ALPHABET_SIZE];
        long[] b = new long[ALPHABET_SIZE];
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            a[i] = 0;
            b[i] = 0;
        }

        for (int i = 0; i < text.length(); i++) {
            a[text.charAt(i) - 'a']++;
        }
        for (int i = 0; i < pattern.length(); i++) {
            b[pattern.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            res += Math.min(a[i], b[i]);
        }
        return res;
    }

    
}