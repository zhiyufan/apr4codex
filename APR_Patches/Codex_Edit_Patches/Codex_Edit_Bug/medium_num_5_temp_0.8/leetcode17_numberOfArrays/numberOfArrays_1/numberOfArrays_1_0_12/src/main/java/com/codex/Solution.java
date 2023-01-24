package com.codex;

import java.util.*;

public class Solution {
public class Main
{
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        int mod = 1000000007;
        int n = differences.length;
        long[] dp = new long[n + 1];
        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum += differences[j];
                if (sum >= lower && sum <= upper) {
                    dp[i] = (dp[i] + dp[j + 1]) % mod;
                }
                if (sum > upper) break;
            }
        }
        return (int)dp[0];
    }
    public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int lower = 1;
		int upper = 4;
		int result = numberOfArrays(array,lower,upper);
		System.out.println(result);
	}
}


    
}