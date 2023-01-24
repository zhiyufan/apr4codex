package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        
        int mod = 1000000007;
        int n = differences.length;
        long[] dp = new long[n + 1];
        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum += differences[j];
                if (sum >= lower && sum <= upper) {
                    dp[i] = (dp[i] + dp[j + 1]) % mod;
                }
                if (sum > upper) break;
            }
        }
        return (int)dp[0];
    }

    public static void main(String[] args){
        Integer[] difference = new Integer[7];
        difference[0] = 1;
        difference[1] = 1;
        difference[2] = 1;
        difference[3] = 1;
        difference[4] = 1;
        difference[5] = 1;
        difference[6] = 1;
        int lower = 1, upper = 1;
        numberOfArrays(difference,lower,upper);
    }
}