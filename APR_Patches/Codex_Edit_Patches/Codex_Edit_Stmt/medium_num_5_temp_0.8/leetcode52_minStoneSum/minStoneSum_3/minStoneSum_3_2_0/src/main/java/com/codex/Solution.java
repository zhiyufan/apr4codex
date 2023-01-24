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

    int minStoneSum2(int[] piles, int k) {
        int N = piles.length;
        int [] pre = piles;
        for (int i = 0; i < k-1; i++) {
            int [] cur = new int[N];
            for (int j = 0; j < N; j++) {
                int min = Integer.MAX_VALUE;
                for (int m = 0; m < j; m++) {
                    min = Math.min(min, Math.max(pre[m], cur[j-m-1]));
                }
                cur[j] = min;
            }
            pre = cur;
        }
        return pre[N-1];
    }
}