package com.codex;

import java.util.*;

public class Solution {
    public static int minStoneSum(int[] piles, int k) {
        

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
            for (int j = 0; j < N; j++) {
                for (int m = 1; m <= k; m++) {
                    dp[j][m] = Integer.MAX_VALUE;
                    for (int n = 0; n < i; n++) {
                        int cur = Math.max(dp[n][m-1], sum[j] - sum[n]);
                        dp[j][m] = Math.min(dp[j][m], cur);
                    }
                }
            }
        }
        return dp[N-1][k];
    }
}