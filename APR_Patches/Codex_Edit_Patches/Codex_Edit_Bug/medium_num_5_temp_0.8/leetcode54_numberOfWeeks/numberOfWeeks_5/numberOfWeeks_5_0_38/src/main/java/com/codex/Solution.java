package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        int[] dp = new int[milestones[milestones.length - 1] + 1];
        for (int i = 0; i < milestones[milestones.length - 1] + 1; i++) {
            dp[i] = -1;
        }
        dp[0] = 0;
        for (int i = 0; i < milestones.length; i++) {
            for (int j = 0; j < milestones[i]; j++) {
                if (dp[j] != -1) {
                    dp[milestones[i]] = Math.min(dp[j] + 1, dp[milestones[i]]);
                }
            }
            
        }
        return dp[milestones[milestones.length - 1]];
    }

    
}