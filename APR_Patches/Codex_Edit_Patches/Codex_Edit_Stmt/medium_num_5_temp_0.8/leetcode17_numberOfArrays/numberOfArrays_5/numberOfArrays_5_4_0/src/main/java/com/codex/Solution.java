package com.codex;

import java.util.*;

public class Solution {
public static int numberOfArrays(int[] differences, int lower, int upper) {
    
    int size = differences.length + 1;
    long[][] dp = new long[size][2];
    dp[0][0] = 1;
    dp[0][1] = 1;
    for(int i = 1; i < size; i++) {
       long max = Math.min((long)upper, (long)differences[i - 1]);
       long min = Math.max((long)lower, (long)differences[i - 1]);
       dp[i][0] = dp[i - 1][1] + dp[i][0];
       dp[i][1] = dp[i - 1][0] + dp[i][1];
        if(max < lower || min > upper) {
            dp[i][1] = 0;
        }
    }
    return (int) dp[size - 1][1];
}
}