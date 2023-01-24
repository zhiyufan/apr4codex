package com.codex;

import java.util.*;

public class Solution {
/*

Problem:

There are n events taking place at the same venue. These events will occur 
on different days. The start and end time of each event is given. 
(The end time of an event will never be equal to the start time of another event).
You have to attend at most two events such that the time duration of your 
attendance to the events is maximized.

*/

    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        if (n == 0) return 0;
        int[][] dp = new int[n][3];
        int ans = 0;
        dp[0][0] = 0;
        dp[0][1] = events[0][2];
        dp[0][2] = events[0][2];
        for (int i = 1; i < n; ++i) {
            dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2])); // do not choose current event
            dp[i][1] = events[i][2] + Math.max(dp[i-1][0], dp[i-1][2]); // choose first event and current
            dp[i][2] = events[i][2] + dp[i-1][1]; // choose second event and current
            ans = Math.max(ans, Math.max(dp[i][0], Math.max(dp[i][1],dp[i][2]))); // max of 0, 1, 2 case
        }
        return ans;
    }

    
}