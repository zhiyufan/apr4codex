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

    //recursive

    public static long numberOfWeeks(int[] milestones) {
        int[] dp = new int[4001];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        int result = 0;
        for (int milestone : milestones) {
            result = Math.max(result, week(milestone, dp));
        }
        return result;
    }

    private static int week(int milestone, int[] dp) {
        if (dp[milestone] != -1){
            return dp[milestone];
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < milestone; i++) {
            if (dp[i] != -1){
                result = Math.min(result,  week(i, dp) + 1);
            }
        }
        dp[milestone] = result;
        return result;
    }
}