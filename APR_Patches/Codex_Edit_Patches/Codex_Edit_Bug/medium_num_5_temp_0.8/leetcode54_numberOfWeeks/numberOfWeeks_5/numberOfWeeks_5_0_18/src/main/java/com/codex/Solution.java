package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        if (milestones == null) {
            throw new RuntimeException("Array is null");
        }
        int result = 0;
        int[] dp = new int[1000];
        for (int i = 0; i < 1000; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 1; i < milestones.length; i++) {
            for (int j = milestones[i - 1]; j < milestones[i]; j++) {
                if (dp[j] != Integer.MAX_VALUE) {
                    dp[milestones[i]] = Math.min(dp[j] + 1, dp[milestones[i]]);
                }
            }
            result = Math.max(result, (dp[milestones[i]] - dp[milestones[i - 1]]));
        }
        return result;
    }
}