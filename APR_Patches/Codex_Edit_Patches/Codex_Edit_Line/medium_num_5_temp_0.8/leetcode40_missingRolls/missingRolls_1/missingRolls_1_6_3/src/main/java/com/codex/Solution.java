package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] res = new int[n];
        int sum = mean * (n + rolls.length);
        for (int roll : rolls) {
            sum -= roll;
        }
        for (int i = 0; i < n; i++) {
            if (sum % n == 0) {
                int avg = sum / n;
                if (avg > 0 && avg <= 6) {
                    res[i] = avg;
                    sum -= avg;
                } else {
                    return new int[0];
                }
            } else {
                return new int[0];
            }
        }
        return res;
    }
    

    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int[] res = new int[n];
        int sum = mean * n;
        for (int roll : rolls) {
            sum -= roll;
        }
        
        if (sum == 0) {
            Arrays.fill(res, mean);
            return res;
        }
        
        int[] dp = new int[sum + 1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i >= j) {
                    dp[i] = Math.min(dp[i], dp[i - j] + 1);
                }
                if (dp[i] <= n && dp[i] != Integer.MAX_VALUE) {
                    res[dp[i] - 1] = j;
                }
            }
        }
        return res;
    }
    
}