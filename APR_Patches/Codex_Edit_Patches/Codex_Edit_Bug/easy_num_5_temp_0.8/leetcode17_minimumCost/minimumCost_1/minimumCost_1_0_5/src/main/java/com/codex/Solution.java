package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        if (cost.length == 1) return cost[0];
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
    }

  

    public static int[] findHighScore(int[] scores, int k) {
        
        int[] highScore = new int[k];
        if (scores.length == 0) return highScore;
        
        for (int i = 0; i < k; i++) {
            highScore[i] = Integer.MIN_VALUE;
        }
        
        int[] dp = new int[k];
        dp[0] = highScore[0];
        int index = 1;
        for (int i = 0; i < scores.length; i++) {
            
            if (scores[i] > dp[0]) {
                dp[0] = scores[i];
                for (int j = 1; j < k; j++) {
                    if (dp[j] < dp[j-1]) {
                        int temp = dp[j];
                        dp[j] = dp[j-1];
                        dp[j - 1] = temp;
                    } else {
                        break;
                    }
                }
            }
            if (i >= (k - 1)) {
                highScore[index++] = dp[0];
            }
        }
        
        return highScore;
    }
}