package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long count = 0;
        for (int i = 0; i < text.length() - pattern.length(); i++) {
        int j = 0;
        while (j < pattern.length() && pattern.charAt(j) == text.charAt(i + j)) {
            j++;
        } 
        if (j == pattern.length()) {
            count++;
        }}
        return count;
    }

    
    
}