package com.codex;

import java.util.*;

public class Solution {
    public static int stoneGameII(int[] piles, int k) {
        

        int N = piles.length;
        int [][] dp = new int[N][N];
        int [] sum = new int[N];
        sum[0] = piles[0];
        for (int i = 1; i < N; i++) {
            sum[i] = sum[i-1] + piles[i];
        }
        for (int i = 0; i < N; i++) {
            dp[i][0] = sum[i]; 
        }
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int m = 0; m < i; m++) {
                    int cur = Math.max(dp[m][j-1], sum[i] - sum[m]);                    
                    dp[i][j] = Math.min(dp[i][j], cur);
                }
            }
        }
        return dp[N-1][k];
    }
}