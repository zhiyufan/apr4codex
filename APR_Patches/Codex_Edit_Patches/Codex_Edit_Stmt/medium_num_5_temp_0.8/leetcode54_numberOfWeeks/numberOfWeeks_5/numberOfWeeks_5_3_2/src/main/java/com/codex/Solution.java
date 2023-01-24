package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        int result = 0;
        int maxMilestone = 0;
        int[] dp = new int[10000];
        for (int i = 0; i < 10000; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int milestone : milestones) {
            for (int j = 0; j < milestone; j++) {
                if (dp[j] != Integer.MAX_VALUE) {
                    dp[milestone] = Math.min(dp[j] + 1, dp[milestone]);
                }
            }
            maxMilestone = Math.max(maxMilestone, milestone);
        }
        return result;
    }

    
}