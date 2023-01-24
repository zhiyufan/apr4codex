package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfArrays(int[] differences, int lower, int upper) {

        int size = differences.length + 1;
        long[][][] dp = new long[size][2][200];
        dp[0][0][0] = 1;
        dp[0][1][100] = 1;

        for(int i = 1; i < size; i++) {
            for(int j = 0; j < 200; j++) {
                if(i == 1) {
                    dp[i][0][j] = dp[i - 1][1][j] + dp[i][0][j];
                } else {
                    dp[i][0][j] = dp[i - 1][1][j] + dp[i][0][j];
                    dp[i][0][j] = dp[i - 1][0][j] + dp[i][0][j];
                }

                int index = j - differences[i - 1] + 100;
                if(index >= 0 && index < 200) {
                    dp[i][1][j] = dp[i - 1][0][index] + dp[i][1][j];
                    dp[i][1][j] = dp[i - 1][1][index] + dp[i][1][j];
                }

                if(j + lower < 100) {
                    dp[i][1][j] = 0;
                }

                if(j - upper > 100) {
                    dp[i][1][j] = 0;
                }
            }
        }

        return (int) dp[size - 1][1][100];
    }

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
                dp[i][1] = 0;
            }
        }

        return (int) dp[size - 1][1];
    }
}