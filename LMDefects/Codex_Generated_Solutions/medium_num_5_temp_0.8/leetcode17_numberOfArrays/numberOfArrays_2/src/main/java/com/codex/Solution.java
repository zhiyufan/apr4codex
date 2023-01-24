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
        int[][] dp = new int[differences.length][differences.length];
        return numberOfArrays(differences, 0, lower, upper, dp);
    }

    private static int numberOfArrays(int[] differences, int i, int lower, int upper, int[][] dp) {
        if (i == differences.length) return 1;
        if (dp[i][i] > 0) return dp[i][i];

        long res = 0, cur = 0;
        for (int j = i; j < differences.length; j++) {
            if (differences[j] == 0 && j > i) break;
            cur = cur * 10 + differences[j];
            }