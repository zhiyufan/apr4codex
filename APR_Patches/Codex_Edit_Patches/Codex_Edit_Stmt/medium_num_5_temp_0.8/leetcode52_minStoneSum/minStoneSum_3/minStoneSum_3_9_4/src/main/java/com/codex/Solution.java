package com.codex;

import java.util.*;

public class Solution {
    public static int minStoneSum(int[] piles, int k) {
        

        int n = piles.length;
        int [][] dp = new int[n + 1][k + 1];
        int [] sum = new int[n + 1];
        sum[0] = piles[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i-1] + piles[i];
        }
        for (int i = 0; i < n; i++) {
            dp[i][0] = sum[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int m = 0; m < i; m++) {
                    int cur = Math.max(dp[m][j-1], sum[i] - sum[m]);
                    dp[i][j] = Math.min(dp[i][j], cur);
                }
            }
        }
        return dp[n][k];
    }
}