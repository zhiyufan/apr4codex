package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int[][] dp = new int[events.length + 1][events.length + 1];
        /*
        events = { {1,2,50},//{startingTime, endingTime, Profit}
                    {3,5,20},
                    {4,6,40},
                    {5,7,50},
                    {5,9,100}};
        */

        for (int i = 1; i <= events.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
            for (int j = 1; j <= events.length; j++) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]);
                int prevEndTime = (j == 1) ? -1: events[j-2][1];
                if (events[i-1][0] >= prevEndTime) { //make sure that the startingTime of current / new Event >= endingTime of previous Event
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1] + events[i-1][2]);
                }
            }
        }
        return Math.max(dp[events.length][events.length], dp[events.length][events.length - 1]);
    }

    
}