package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, char pattern) {

        long count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == pattern) count++;
        }
        return count;
    }
}