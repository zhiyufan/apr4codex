package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long count = 0;
        int count = 0, i;
        for (i=0;i<text.length();i++) {
            if (text.charAt(i) == pattern.charAt(1) && text.charAt(i+1) == pattern.charAt(2))
            count++;
        }
        return count;
    }

    
}