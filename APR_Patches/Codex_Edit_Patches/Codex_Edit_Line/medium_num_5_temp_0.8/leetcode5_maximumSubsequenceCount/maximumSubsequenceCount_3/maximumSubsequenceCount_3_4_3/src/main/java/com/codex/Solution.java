package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        if (pattern.length() != 2) {
            return 0;
        }
        long res = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == pattern.charAt(0)) {
                for (int j = i + 1; j < text.length(); j++) {
                    if (text.charAt(j) == pattern.charAt(1)) {
                        res += 1;
                    }
                }
            }
        }
        return res;
    }
}