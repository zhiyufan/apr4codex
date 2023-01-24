package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        /** You are given a 0-indexed array of n integers differences, which describes the differences between each pair of consecutive integers of a hidden sequence of length (n + 1). More formally, call the hidden sequence hidden, then we have that differences[i] = hidden[i + 1] - hidden[i].
         * You are further given two integers lower and upper that describe the inclusive range of values [lower, upper] that the hidden sequence can contain.
         * For example, given differences = [1, -3, 4], lower = 1, upper = 6, the hidden sequence is a sequence of length 4 whose elements are in between 1 and 6 (inclusive).
         * [3, 4, 1, 5] and [4, 5, 2, 6] are possible hidden sequences.
         * [5, 6, 3, 7] is not possible since it contains an element greater than 6.
         * [1, 2, 3, 4] is not possible since the differences are not correct.
         * Return the number of possible hidden sequences there are. If there are no possible sequences, return 0.
         */
        int n = differences.length;
        int[][] dp = new int[n + 1][2];
        dp[1][0] = 1;
        for (int i = 1; i <= n; ++i) {
            if (differences[i - 1] >= lower && differences[i - 1] <= upper)
                dp[i + 1][0] = (dp[i][0] + dp[i][1]) % MOD;

            if (i + 1 - lower >= 0 && i + 1 - lower <= n) {
                dp[i + 1][0] = (dp[i + 1][0] + dp[i + 1 - lower][0] + dp[i + 1 - lower][1]) % MOD;
            }
            if (i + 1 - upper >= 0 && i + 1 - upper <= n) {
                dp[i + 1][1] = (dp[i + 1][1] + dp[i + 1 - upper][0] + dp[i + 1 - upper][1]) % MOD;
            }
        }
        return (dp[n + 1][0] + dp[n + 1][1]) % MOD;
    }}