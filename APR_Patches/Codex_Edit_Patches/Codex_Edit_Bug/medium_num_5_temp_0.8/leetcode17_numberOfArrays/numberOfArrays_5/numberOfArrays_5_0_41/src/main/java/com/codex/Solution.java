package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        

        int size = differences.length + 1;
        long[][] dp = new long[size][2];
        dp[0][0] = 1;
        dp[0][1] = 1;

        for(int i = 1; i < size; i++) {
            int max = Math.min(upper, differences[i - 1]);
            int min = Math.max(lower, differences[i - 1]);
            dp[i][0] = dp[i - 1][1] + dp[i][0];
            dp[i][1] = dp[i - 1][0] + dp[i][1];
            if(max < lower || min > upper) {


    public int rangeBitwiseAnd(int m, int n) {
        
        int range = n - m;
        int leftMost = 32;
        
        while(range > 0) {
            range = range >> 1;
            leftMost--;
        }
        
        int mask = ~((1 << (leftMost + 1)) - 1);
        return ~mask & n;
    }

    public int rangeBitwiseAnd(int m, int n) {
        
        int mask = Integer.MAX_VALUE;
        
        while((mask & m) != (mask & n)) {
            mask = mask << 1;
        }
        
        return mask & m;
    }
                dp[i][1] = 0;
            }
        }

        return (int) dp[size - 1][1];
    }
}