package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        if (events == null) return 0;
        if (events.length < 2) return events[0][2];
        int n = events.length; 
        Arrays.sort(events, (a,b) -> a[1] - b[1]);
        for (int i = 0; i < n; i++) {
            System.out.println(events[i][0] + " " + events[i][1] + " " + events[i][2]);
        }
        int[] dp = new int[n];
        dp[0] = events[0][2];
        dp[1] = events[1][2];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], events[i][2] + dp[i - 2]);
        }
        return dp[n-1];
    }

    
}