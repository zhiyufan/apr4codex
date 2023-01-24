package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int minStoneSum(int[] piles, int k) {
        int len = piles.length;
        int[] presum = new int[len + 1];
        presum[0] = 0;
         for(int i = 1; i <= len; ++i) presum[i] = presum[i - 1] + piles[i - 1];
        int[][] dp = new int[k + 1][len + 1];
        for(int i = 1; i <= k; ++i) dp[i][1] = piles[0];
        for(int i = 1; i <= k; ++i) 
            for(int j = 2; j <= len; ++j) dp[i][j] = Integer.MAX_VALUE;
        for(int i = 2; i <= k; ++i) 
            for(int j = i; j <= len; ++j) {
                for(int m = 0; m < j; ++m)
                    dp[i][j] = Math.min(dp[i][j], Math.max(dp[i - 1][m], presum[j] - presum[m]));
            }     
        return dp[k][len];
    }
}
}