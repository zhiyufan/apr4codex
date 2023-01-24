package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int maxEvents(int[][] events) {
        if (events == null || events.length == 0) {
            return 0;
        }
        if (events.length == 1) {
            return 1;
        }
        Arrays.sort(events, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return b[1] - a[1];
                } else {
                    return a[0] - b[0];
                }
            }
        });
        int[][] dp = new int[events.length][events.length];
        for (int i = 0; i < events.length; i++) {
            dp[i][0] = 1;
            for (int j = 1; j < events.length; j++) {
                dp[i][j] = Math.max(dp[i][j-1], 1);
                int prevEndTime = j == 1 ?  -1 : events[j-2][1];
                if (events[j-1][0] >= prevEndTime + 1) {
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i][j-2]);
                }
            }
        }
        return dp[events.length - 1][events.length - 1];
    }

}
}