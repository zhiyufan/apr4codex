package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int maxSumAfterPartitioning(int[] A, int K) {
        int n = A.length;

        if(n == 0){
            return 0;
        }

        int[] dp = new int[n];

        for(int i = 0; i < n; ++i){
            int max = A[i];
            for(int j = 0; j < K && i - j >= 0; ++j){
                max = Math.max(max, A[i - j]);
                dp[i] = Math.max(dp[i], (j == 0 ? 0 : dp[i - j - 1]) + (j + 1) * max);
            }
        }

        return dp[n - 1];
    }
}