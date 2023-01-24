package com.codex;

import java.util.*;

public class Solution {
    // Sort the array based on the start time
    // The time complexity of this algorithm is n^2
    public static int maxTwoEvents(int[][] events) {


        if (events == null || events.length == 0) {
            return 0;
        }

        // dp[i] means the results when the last event is i
        int[] dp = new int[events.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < events.length; i++) {
            max = Math.max(max, dp[i]);
            for (int j = i+1; j < events.length; j++)
                if (events[i][1] + 1 <= events[j][0])
                    dp[j] = Math.max(dp[j], dp[i] + events[j][2]);
        }

        return max;
    }
}