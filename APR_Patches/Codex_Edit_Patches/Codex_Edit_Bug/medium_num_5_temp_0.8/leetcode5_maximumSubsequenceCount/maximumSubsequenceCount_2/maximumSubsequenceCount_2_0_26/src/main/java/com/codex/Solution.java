package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long count = 0;
        int patternLength = pattern.length();
        boolean checker = false;
        for (int i = 0; i < text.length() - (patternLength - 1); i++) {
            if (text.charAt(i) == pattern.charAt(0)) {
                checker = true;
                for (int j = 1; j < patternLength; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        checker = false;
                        j = patternLength;
                    }
                }
                if (checker) count++;
        }
        return count;
    }


}