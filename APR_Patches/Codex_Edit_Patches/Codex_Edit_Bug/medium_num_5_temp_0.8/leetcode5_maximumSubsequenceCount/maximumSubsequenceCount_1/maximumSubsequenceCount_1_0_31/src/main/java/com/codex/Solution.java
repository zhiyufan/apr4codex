package com.codex;

import java.util.*;

public class Solution {
public class Solution {

    public static long[][] dp;

    private static void initializeDP(int textLength, int patternLength) {
        dp = new int[textLength + 1][patternLength + 1];
        for (int i = 0; i <= textLength; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= patternLength; j++) {
            dp[0][j] = j;
        }
    }

    
}