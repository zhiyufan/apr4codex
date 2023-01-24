package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        
        int mod = 1000000007;
        int n = differences.length;
        long[] dp = new long[n + 1];
        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--) { //最后一位开始往前走
            long sum = 0;
            for (int j = i; j < n; j++) { //当前这一位往后走一位
                sum += differences[j];
                if (sum >= lower && sum <= upper) {
                    dp[i] = (dp[i] + dp[j + 1]) % mod; //dp[i] 表示 在index i 开始，有多少个合法的组合
                }
                if (sum > upper) break;
            }
        }
        return (int)dp[0];
    }

    
}