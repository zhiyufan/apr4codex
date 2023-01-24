package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfArrays(String s, int k) {
        

        int n = s.length();
        long mod = (long) Math.pow(10, 9) + 7;
        long[][] dp = new long[n][k + 1];
        dp[0][0] = s.charAt(0) == '0' ? 0 : 1;

        for(int i = 1; i < n; i++) {
            if(s.charAt(i) == '0') continue;
            dp[i][0] = dp[i - 1][0];
            for(int j = 1; j <= k; j++) {
                long cur = dp[i - 1][j];
                if(s.charAt(i) == '0') {
                    dp[i][j] = cur;
                    continue;
                }
                if(s.charAt(i - 1) == '0') {
                    dp[i][j] = (dp[i - 1][j - 1] * (s.charAt(i) - '0')) % mod;
                } else {
                    int val = Integer.parseInt(s.substring(i - 1, i + 1));
                    if(val > 26) {
                        dp[i][j] = (dp[i - 1][j - 1] * (s.charAt(i) - '0')) % mod;
                    } else {
                        dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - 1] * (s.charAt(i) - '0')) % mod;
                    }
                }
            }
        }

        return (int) dp[n - 1][k];
    }
}