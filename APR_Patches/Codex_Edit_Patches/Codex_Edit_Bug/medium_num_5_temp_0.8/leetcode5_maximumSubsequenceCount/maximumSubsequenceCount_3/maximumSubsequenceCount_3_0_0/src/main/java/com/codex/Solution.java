package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long res = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == pattern.charAt(0)) {
                if (i + 1 < text.length()) {
                    if (text.charAt(i + 1) == pattern.charAt(1)) {
                        res += 1; }
                }
            }
        }
        return res;
    }
}