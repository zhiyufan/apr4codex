package com.codex;

import java.util.*;

public class Solution {
    public static int numOfSubarrays(int[] differences, int lower, int upper) {
		int MOD = (int) (Math.pow(10, 9) + 7);
		int size = differences.length + 1;
		long[] dp = new long[size];
		dp[0] = 1;
		
		for (int i = 1; i < size; i++) {
			int difference = differences[i - 1];
			int max = Math.min(upper, difference);
			int min = Math.max(lower, difference);
			
			if (max < lower || min > upper) {
				dp[i] = 0;
			} else {
				dp[i] = dp[i - 1] + dp[i];
}
				dp[i] = dp[i] % MOD;
			}
		}
		
		return (int) dp[size - 1];
    }
}