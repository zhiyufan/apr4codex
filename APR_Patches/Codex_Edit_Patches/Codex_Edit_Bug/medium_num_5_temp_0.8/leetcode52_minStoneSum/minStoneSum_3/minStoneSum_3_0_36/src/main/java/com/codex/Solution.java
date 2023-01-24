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

     public static int stoneSum(int[] piles, int k) {
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





// 方法二：
//     public static int stoneSum(int[] piles, int k) {
//         int N = piles.length;
//         int [][] dp = new int[N][k+1];
//         int [] sum = new int[N];
//         sum[0] = piles[0];
//         for (int i = 1; i < N; i++) {
//             sum[i] = sum[i-1] + piles[i];
//         }
//         for (int i = 0; i < N; i++) {
//             dp[i][0] = sum[i];
//         }
//         for (int i = 0; i < N; i++) {
//             for (int j = 1; j <= k; j++) {
//                 dp[i][j] = sum[i];
//                 int curSum = 0;
//                 for (int m = i; m >= 0; m--) {
//                     curSum += piles[m];
//                     if (i - m + 1 > j) {
//                         break;
//                     }
//                     dp[i][j] = Math.min(dp[i][j], Math.max(dp[m-1][j-1], curSum));
//                 }
//             }
//         }
//         return dp[N-1][k];
//     }
}