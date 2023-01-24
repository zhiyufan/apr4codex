package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        int result = 0;
        int[] dp = new int[10000];
        for (int i = 0; i < 10000; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 0; i < milestones.length; i++) {
            for (int j = 0; j < milestones[i]; j++) {
                if (dp[j] != Integer.MAX_VALUE) {
                    dp[milestones[i]] = Math.min(dp[j] + 1, dp[milestones[i]]);
                }
            }
            result = Math.max(result, dp[milestones[i]]);
        }
        return result;
    }
    public static int leadCandy(int[][] studentCandy) {

        int[] dp = new int[10000];
        for (int i = 0; i < 10000; i++) {
            dp[i] = -1;
        }
        dp[0] = 0;
        for (int i = 1; i <= studentCandy.length; i++) {
            int best = -1;
            for (int j = 1; j < i; j++) {
                if (dp[j - 1] != - 1) {
                    int current = studentCandy[i - 1][0] - dp[j - 1];
                    if (current >= 0) {
                        best = Math.max(best, Math.min(current, studentCandy[i - 1][1]));
                    }
                }
            }
            dp[i] = best;
        }
        return dp[studentCandy.length];
    }

    

    
}