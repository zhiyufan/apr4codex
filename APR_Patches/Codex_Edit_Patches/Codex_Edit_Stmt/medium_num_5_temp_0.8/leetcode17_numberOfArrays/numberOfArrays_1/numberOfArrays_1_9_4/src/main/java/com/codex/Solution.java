package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        
        int mod = 1000000007;
        int n = differences.length;
        long[] dp = new long[differences.length];
        dp[0] = 1;
        for (int i = 1; i < differences.length; i++) {
            if (differences[i - 1] >= 0) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = 0;
                break;
            }
            
            for (int j = i - 1; j >= 0; j--) {
                differences[j] += differences[i];
                if (differences[j] >= lower && differences[j] <= upper) {
                    dp[i] += dp[j];
                }                
            }
        }
        return (int)dp[n - 1];
    }

    
}