package com.codex;

import java.util.*;

public class Solution {
    public static int minStoneSum(int[] piles, int k) {
        

        int N = piles.length;
        int [][] dp = new int[N][k+1];

        for (int i = 0; i < N; i++) {
            dp[i][0] = i == (N-1) ? 0 : Math.max(piles[i], piles[i+1]);
            for (int j = 0; j < i; j++) {
                dp[i][0] += piles[j];
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int m = 0; m < i; m++) {
                    int cur = Math.max(dp[m][j-1], sum[i] - sum[m]);
                    System.out.println("max: "+ dp[m][j-1] + ", " + "min: " + (sum[i] - sum[m]));
                    dp[i][j] = Math.min(dp[i][j], cur);
                }
            }
        }
        return dp[N-1][k];
    }
}