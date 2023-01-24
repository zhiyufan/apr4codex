package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int stoneGameII(int[] piles) {
        // TODO:
        int n = piles.length;
        int[][] dp = new int[n + 1][n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += piles[i];
            dp[i][n] = sum;
        }
        return dfs(piles, 0, 1, dp);
    }
    
    private int dfs(int[] piles, int i, int M, int[][] dp) {
        if (i == piles.length) return 0;
        if (2 * M >= piles.length - i) return dp[i][piles.length];
        if (dp[i][M] > 0) return dp[i][M];
        int min = Integer.MAX_VALUE;
        for (int x = 1; x <= 2 * M; x++) {
            int next = dfs(piles, i + x, Math.max(M, x), dp);
            if (next < min) {
                min = next;
                if (min == dp[i][piles.length] - dp[i + x][piles.length]) {
                    break;
                }
            }
        }
        dp[i][M] = dp[i][piles.length] - min;
        return dp[i][M];
    }
}