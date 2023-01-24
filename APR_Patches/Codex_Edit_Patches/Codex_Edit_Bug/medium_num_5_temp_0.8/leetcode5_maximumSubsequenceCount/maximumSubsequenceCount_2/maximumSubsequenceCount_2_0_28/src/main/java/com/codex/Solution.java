package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long count = 0;
        for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
            if (text.substring(i, i + pattern.length()).equals(pattern)) count++;
        }
        return count;
    }

    
}