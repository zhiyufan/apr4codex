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



    int fact(int a) {
        int res = 1;
        for (int i = 0; i < a; i++) {
            res *= (i + 1);
        }
        return res;
    }
    public static double probability(int n, int f) {
        double res = 0.0;
        int x = n - 2;
        for (int i = 0; i <= n - f; i++) {
            res += (fact(x) / (fact(n - f - i) * fact(i)) * (1.0 / Math.pow(2, x)));
        }
        return res;
    }
        
    
    
}