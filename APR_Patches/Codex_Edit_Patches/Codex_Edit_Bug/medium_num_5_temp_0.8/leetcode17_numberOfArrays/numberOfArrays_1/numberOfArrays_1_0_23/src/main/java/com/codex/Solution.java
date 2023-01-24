package com.codex;

import java.util.*;

public class Solution {
    public static int minNumbersOfArrays(int[] differences, int lower, int upper) {
            int n = differences.length;
            int[][] dp = new int[n+1][n+1];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    dp[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        return (int)dp[0];
    }

    
}