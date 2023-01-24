package com.codex;

import java.util.*;

public class Solution {

// Problem Statement:
// Given an array of events where events[i] = [startDayi, endDayi]. Every event i starts at startDayi and ends at endDayi.

// You can attend an event i at any day d where startTimei <= d <= endTimei. Notice that you can only attend one event at any time d.

// Return the maximum number of events you can attend.


public static int maxEvents(int[][] events) {
        
        int[][] dp = new int[events.length + 1][events.length + 1];
        for (int i = 1; i <= events.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
            for (int j = 1; j <= events.length; j++) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]);
                int prevEndTime = (j == 1) ? -1: events[j-2][1];
                if (events[i-1][0] >= prevEndTime + 1) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1] + events[i-1][2]);
                }
            }
        }
        return Math.max(dp[events.length][events.length], dp[events.length][events.length - 1]);
    }

    
}