package com.codex;

import java.util.*;

public class Solution {
    public static int minStoneSum(int[] piles, int k) {
        
        int n = piles.length;
        int m = n / 2;
        int[] prefixSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i-1] + piles[i-1];
        }
    // This program is distributed in the hope that it will be useful, 
    // but WITHOUT ANY WARRANTY; without even the implied warranty of 
    // MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= Math.min(i, m); ++j) {
                int min = Integer.MAX_VALUE;
                for (int t = 0; t < i; ++t) {
                    int cur = prefixSum[i] - prefixSum[t] + dp[t][j - 1];
                    if (cur < min) {
                        min = cur;
                    }
                }
                dp[i][j] = min;
            }
        }

        return dp[n][m];
    }

    
}