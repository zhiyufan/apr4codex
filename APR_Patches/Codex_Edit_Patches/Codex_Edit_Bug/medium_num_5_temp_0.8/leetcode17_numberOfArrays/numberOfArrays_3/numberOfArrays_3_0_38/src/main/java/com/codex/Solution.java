package com.codex;

import java.util.*;

public class Solution {
// dp[i][j] means the number of valid arrays if the ith element is j;
// dp[i][0] stands for the number of valid arrays which has no element is greater than upper
// dp[i][1] stands for the number of valid arrays which has some element is greater than upper

class Solution {
    public int numberOfArrays(String s, int k) {
        int n = s.length();
        long mod = (long)1e9 + 7;
        long[][] dp = new long[n + 1][2];
        dp[0][0] = 1;
        dp[0][1] = 0;
        long upper = 0;
        long lower = 1;
        int i = 0;
        while (upper < k && i < s.length()) {
            upper = upper * 10 + s.charAt(i++) - '0';
            lower = lower * 10;
        }
        for (i = 1; i <= n; i++) {
            upper = upper * 10 + s.charAt(i - 1) - '0';
            lower = lower * 10;
            if (s.charAt(i - 1) == '0') {
                continue;
            }
            dp[i][0] = (dp[i][0] + dp[i - 1][0] * Math.min(upper, k)) % mod;
            dp[i][1] = (dp[i][1] + dp[i - 1][0] * (upper - Math.min(upper, k))) % mod;
            dp[i][1] = (dp[i][1] + dp[i - 1][1] * Math.min(upper, k)) % mod;
        }
        return (int) (dp[n][1] + dp[n][0] * Math.min(upper, k) % mod);
    }

}
}