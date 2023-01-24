package com.codex;

import java.util.*;

public class Solution {
## 1676. Number of Array Queries

### Description

You are given an array queries of positive integers between 1 and n,
where queries[i] represents the number of times that i should be added to the sum initially. Return the number of ways to assign symbols to make queries by replacing the integers with the indicated symbols sum to 0.

### Example

Input: queries = [1,2,1,2,1,2,1], m = 2
Output: 18

Input: queries = [1,1,2,2,1], m = 2
Output: 8

### Solution

    class Solution {
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        int mod = 1000000007;
        int n = differences.length;
        long[] dp = new long[n + 1];
        dp[n] = 1;
        for (int i = n - 1; i >= 0; --i) {
            for (int j = i; j < n; ++j) {
                differences[j] += differences[j - 1];
            }
            for (int j = i; j < n; ++j) {
                if (differences[j] >= lower) dp[j] = (dp[j] + dp[j + 1]) % mod;
                if (differences[j] > upper) break;
            }
        }
        return (int)dp[0];
    }

    }
}