package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfArrays(int n, int m, int[] ops) {
        int[] differences = new int[ ops.length - 1];

        int size = differences.length + 1;
        for( int i = 0; i < ops.length - 1; i++ ) {
            differences[i] = ops[i+1] - ops[i];
        }

        long[][] dp = new long[size][m+1];
        dp[0][0] = 1;

        for(int i = 1; i < size; i++) {
            int max = Math.min(upper, differences[i - 1]);
            int min = Math.max(lower, differences[i - 1]);
            dp[i][0] = dp[i - 1][1] + dp[i][0];
            dp[i][1] = dp[i - 1][0] + dp[i][1];
            if(max < lower || min > upper) {
                dp[i][1] = 0;
            }
        }

        return (int) dp[size - 1][1];
    }
}