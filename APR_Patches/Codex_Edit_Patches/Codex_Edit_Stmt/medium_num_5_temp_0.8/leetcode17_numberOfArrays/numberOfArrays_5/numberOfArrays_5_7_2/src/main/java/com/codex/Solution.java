package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        

        int size = differences.length + 1;
        long[][] dp = new long[size][2];
        dp[0][0] = 1;  // 上一个取0，当前取0
        dp[0][1] = 0;  // 上一个取0，当前取1

        for(int i = 1; i < size; i++) {
            int max = Math.min(upper, differences[i - 1]); // 取0，最大值
            int min = Math.max(lower, differences[i - 1]); // 取1，最小值
            dp[i][0] = dp[i - 1][1] + dp[i][0];      // 取0: 上一个取1，还有上一个取0，当前取0
            dp[i][1] = dp[i - 1][0] + dp[i][1];      // 取1: 上一个取0，还有上一个取1，当前取1
            if(max < lower || min > upper) {         // 不能取1
                dp[i][1] = 0;
            }
        }

        return (int) dp[size - 1][1];
    }
}