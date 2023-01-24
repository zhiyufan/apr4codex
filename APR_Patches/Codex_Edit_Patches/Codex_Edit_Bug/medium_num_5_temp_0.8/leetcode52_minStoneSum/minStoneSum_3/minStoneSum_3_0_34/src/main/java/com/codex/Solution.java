package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.util.*;
class Solution {
    public static int minStoneSum(int[] piles, int K) {
        int N = piles.length;
        int [][] dp = new int[N][K+1];
        for (int j = 1; j <= K; j++) {
            for (int i = 0; i < N; i++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int m = 0; m < i; m++) {
                    int cur = Math.max(dp[m][j-1], piles[i] - piles[m]);
                    dp[i][j] = Math.min(dp[i][j], cur);
                }
            }
        }
        return dp[N-1][k];
    }
}