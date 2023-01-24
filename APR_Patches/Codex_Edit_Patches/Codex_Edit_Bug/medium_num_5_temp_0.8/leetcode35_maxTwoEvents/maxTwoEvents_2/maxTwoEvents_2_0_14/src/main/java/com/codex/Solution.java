package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        if (n == 0) return 0;
        int[][] dp = new int[n][3];
        int ans = 0;
        dp[0][0] = 0;
        dp[0][1] = events[0][2];
        dp[0][2] = events[0][2];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
            dp[i][1] = events[i][2] + Math.max(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = events[i][2] + dp[i-1][1];
            ans = Math.max(ans, Math.max(dp[i][0], Math.max(dp[i][1],dp[i][2])));
        }
        return ans;
    }



    public static int minCostPalindrome(String s, int[] cost) {
        int total = 0;
        int n = s.length();
        char[] c = s.toCharArray();
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; i++) {
            total += cost[i-1];
        }
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2]);
        }
        return total - dp[n];
    }



    public static int minPalindromeSubst(String s) {
        char[] c = s.toCharArray();
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) dp[i][i] = 0;
        for (int i = 0; i < n-1; i++) dp[i][i+1] = c[i] == c[i+1] ? 0 : 1;
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i < n-len+1; i++) {
                int j = i + len - 1;
                dp[i][j] = c[i] == c[j] ? dp[i+1][j-1] : dp[i][j-1]+1;
            }
        }
        return dp[0][n-1];
    }
    
    
}