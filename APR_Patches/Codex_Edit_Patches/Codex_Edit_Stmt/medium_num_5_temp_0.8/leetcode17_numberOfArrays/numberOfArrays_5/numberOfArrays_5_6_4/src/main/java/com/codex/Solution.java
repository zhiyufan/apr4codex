package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        

        int size = differences.length + 1;
        long[][] dp = new long[size][2];
        dp[0][0] = 1;
        dp[0][1] = 0;

        for(int i = 1; i < size; i++) {
            int max = upper + differences[i - 1];
            int min = lower + differences[i - 1];

            dp[i][0] += dp[i - 1][0];
            dp[i][1] += dp[i - 1][1];

            if(min <= 0 && 0 <= max) {
                dp[i][0] += 1;
            }

            if(max < lower || min > upper) {
                dp[i][1] = 0; 
            } else {
                dp[i][1] += dp[i - 1][0];
            }
        }

        return (int) dp[size - 1][1];
    }
}