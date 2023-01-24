package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {    
        char[] x = text.toCharArray();
        char[] y = pattern.toCharArray();
        int i = 0;
        int j = 0;
        int n = x.length;
        int m = y.length;
        int len = 0;
        int k = 0;
        int[] path = new int[m];
        while (i < n && j < m) {
            if ((x[i] == y[j]) && (i < n) && (j < m)) {
                path[k] = i;
                i = i + 1;
                j = j + 1;
                len = len + 1;
            } else {
                i = i + 1;
            }
        }
        return len;
    }
}