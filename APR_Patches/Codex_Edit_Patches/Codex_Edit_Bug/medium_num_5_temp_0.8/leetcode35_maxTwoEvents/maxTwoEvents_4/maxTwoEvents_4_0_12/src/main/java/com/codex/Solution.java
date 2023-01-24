package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[] events) {
        int n = events.length;        
        int dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + events[i - 1]);
        }        
        return dp[n];
    }
}