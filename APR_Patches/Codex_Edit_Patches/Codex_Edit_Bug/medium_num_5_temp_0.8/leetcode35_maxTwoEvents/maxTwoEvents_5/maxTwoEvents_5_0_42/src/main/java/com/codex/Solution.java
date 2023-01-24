package com.codex;

import java.util.*;

public class Solution {
    /**
     * @param events: the n events
     * @return: the time points of two events that have the maximum attractive value
     */
    public static int maxTwoEvents(int[][] events) {
        if (events == null || events.length == 0) {
            return 0;
        }
        Arrays.sort(events, new Comparator<int[]>() {
            public int compare(int[] e1, int[] e2) {
                return e1[0] - e2[0];
            }
        });
        // dp[i][j] represents the maximum value that two selected events can have when the last two events are i and j
        int[][] dp = new int[events.length + 1][events.length + 1];
        for (int i = 1; i <= events.length; i++) { //scan through all events
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
            for (int j = 1; j <= i; j++) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]); 
                int prevEndTime = (j == 1) ? -1: events[j-2][1];
                if (events[i-1][0] >= prevEndTime + 1) { //only try a new event when the new event starts after the previous event ends
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1] + events[i-1][2]); //dp[i-1][j-1] means the maximum value when only considering the previous j events
                }
            }
        }
        return Math.max(dp[events.length][events.length], dp[events.length][events.length - 1]);
    }

    
}