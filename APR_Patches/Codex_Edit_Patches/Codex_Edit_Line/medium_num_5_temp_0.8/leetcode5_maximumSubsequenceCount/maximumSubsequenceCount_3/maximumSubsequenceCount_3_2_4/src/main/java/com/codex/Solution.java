package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long res = 0;

        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == text.charAt(0)) {

                for (int j = i + 1; j < text.length(); j++) {
                    if (text.charAt(j) == pattern.charAt(i)) {
                        res += 1; 
                    }
                }
            }
        }
        return res;
    }
}