package com.codex;

import java.util.*;

public class Solution {
    public static int minStoneSum(int[] piles, int k) {
        
// 1
        int N = piles.length;
        int [][] dp = new int[N][k+1];
        int [] sum = new int[N];
        sum[0] = piles[0];
        for (int i = 1; i < N; i++) {
            sum[i] = sum[i-1] + piles[i];
        }
        for (int i = 0; i < N; i++) {
            dp[i][0] = sum[i];
        }
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int m = 0; m < i; m++) {
                    int cur = Math.max(dp[m][j-1], sum[i] - sum[m]);
                    dp[i][j] = Math.min(dp[i][j], cur);
                }
            }
        }
        return dp[N-1][k];
    }

// 2
    public int maxProfit(int k, int[] prices) {
        
        int n = prices.length;
        if (n == 0) return 0;
        int[][] dp = new int[k+1][n];
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = 0;
            }
        }
        for (int i = 1; i <= k; i++) {
            int max = dp[i-1][0] - prices[0];
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i][j-1], prices[j] + max);
                max = Math.max(dp[i-1][j] - prices[j], max);
            }
        }
        return dp[k][n-1];
    }

    // 3
    public int maxProfit2(int[] prices) {
        
        int n = prices.length;
        if (n==0) return 0;
        int[][] dp = new int[3][n];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = 0;
            }
        }
        for (int i = 1; i < 3; i++) {
            int max = dp[i-1][0] - prices[0];
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i][j-1], prices[j] + max);
                max = Math.max(dp[i-1][j] - prices[j], max);
            }
        }
        return dp[2][n-1];
    }
}