package com.codex;

import java.util.*;

public class Solution {
    public static int minStoneSum(int[] piles, int k) {
        

        int [][] pre = new int[N][k+1];
        int N = piles.length;
        int [][] dp = new int[N][k+1];
        int [] sum = new int[N];
        sum[0] = piles[0];
        for (int i = 1; i < N; i++) {
            sum[i] = sum[i-1] + piles[i];
        }
        for (int i = 0; i < N; i++) {
            dp[i][0] = sum[i];
            pre[i][0] = -1;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int m = 0; m < i; m++) {
                    int cur = Math.max(dp[m][j-1], sum[i] - sum[m]);
                    pre[i][j] = m;
                    dp[i][j] = Math.min(dp[i][j], cur);
                }
            }
        }
        int i = N - 1;
        int j = k;
        System.out.print(0 + " ");
        while (j > 0) {
            System.out.print(pre[i][j] + " ");
            i = pre[i][j];
            j = j - 1;
        }
        System.out.println();
        System.out.println();
        return dp[N-1][k];
    }
}