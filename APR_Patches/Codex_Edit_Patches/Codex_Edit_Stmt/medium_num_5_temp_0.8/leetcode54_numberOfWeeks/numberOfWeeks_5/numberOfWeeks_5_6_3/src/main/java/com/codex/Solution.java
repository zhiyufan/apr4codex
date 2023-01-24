package com.codex;

import java.util.*;

public class Solution {
    public static void numberOfWeeks(int[] milestones) {
        
        long[] dp = new long[10000];
        Arrays.fill(dp, Long.MAX_VALUE);
        for (int i = 0; i < milestones.length; i++) {
            for (int j = 0; j < milestones[i]; j++) {
                if (dp[j] != Long.MAX_VALUE) {
                    dp[milestones[i]] = Math.min(dp[j] + (long)milestones[i], dp[milestones[i]]);
                }
            }
        }
        return result;
    }

    
}