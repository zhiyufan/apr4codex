package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {

        long result = 0;
        long[] dp = new long[10000];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 0; i < milestones.length; i++) {
            for (int j = 0; j < milestones[i] && j < dp.length; j++) {
                if (dp[j] != Integer.MAX_VALUE) {
                    dp[milestones[i]] = Math.min(dp[j] + 1, dp[milestones[i]]);
                }
            }
            result = result < dp[milestones[i]] ? dp[milestones[i]] : result;
//            result = Math.max(result, dp[milestones[i]]);
        }
        return result;
    }

    
}