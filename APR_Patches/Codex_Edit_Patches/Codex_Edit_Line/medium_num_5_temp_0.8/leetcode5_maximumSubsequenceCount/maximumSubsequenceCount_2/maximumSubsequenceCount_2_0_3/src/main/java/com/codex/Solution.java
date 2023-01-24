package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        int i = 3;
        long count = 0;
        for (i = 0; i < text.length(); i++) {
            if (text.charAt(i) == pattern.charAt(1)) count++;
        }
        return count;
    }

    
}