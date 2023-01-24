package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
    
        long count = 0;
        int countP = 0;
        int countT = 0;
        for (int i = 0; i < pattern.length(); i++) {
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == pattern.charAt(i)) countP++;
            }
        }
        
        for (int k = 0; k < text.length(); k++) {
            if (text.charAt(k) == pattern.charAt(1)) countT++;
        }
        return count;
    }

    
}