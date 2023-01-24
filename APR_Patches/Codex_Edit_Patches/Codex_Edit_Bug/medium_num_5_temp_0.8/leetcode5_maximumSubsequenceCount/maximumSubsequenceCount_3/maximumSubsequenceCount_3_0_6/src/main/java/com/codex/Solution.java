package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long res = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == pattern.charAt(0)) {
                int j = i + 1;
                while (j < pattern.length() - 1 && j < text.length()) {
                    if (text.charAt(j) == pattern.charAt(j - i)) {
                        if (j == pattern.length() - 2) {
                            res++;
                        }
                        j++;
                    } else {
                        break;
                    }
                }
            }
        }
        return res;
    }
}