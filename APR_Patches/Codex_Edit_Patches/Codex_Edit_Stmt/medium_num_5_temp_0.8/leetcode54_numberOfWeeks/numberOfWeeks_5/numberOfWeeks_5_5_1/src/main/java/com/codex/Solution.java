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
        for (int i = 0; i < milestones.length; i++) { // O(n)
            for (int j = 0; j < milestones[i]; j++) { // O(milestones[i] * n) => O(n ^ 2)
                if (dp[j] != Integer.MAX_VALUE) { // O(n ^ 2)
                    dp[milestones[i]] = Math.min(dp[j] + 1, dp[milestones[i]]); // O(n ^ 2)
                }
            }
            result = Math.max(result, dp[milestones[i]]); // O(n)
        }
        return result;
    }

    
}