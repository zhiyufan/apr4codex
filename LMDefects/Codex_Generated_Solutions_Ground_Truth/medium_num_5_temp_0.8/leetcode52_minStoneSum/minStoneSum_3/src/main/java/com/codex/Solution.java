package com.codex;

import java.util.*;

public class Solution {
    public static int minStoneSum(int[] piles, int k) {
        /** You are given a 0-indexed integer array piles, where piles[i] represents the number of stones in the ith pile, and an integer k. You should apply the following operation exactly k times:
         * Choose any piles[i] and remove floor(piles[i] / 2) stones from it.
         * Notice that you can apply the operation on the same pile more than once.
         * Return the minimum possible total number of stones remaining after applying the k operations.
         * floor(x) is the greatest integer that is smaller than or equal to x (i.e., rounds x down).
         */

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
}