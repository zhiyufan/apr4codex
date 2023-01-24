package com.codex;

import java.util.*;

public class Solution {
    // maxTwoEvents: https://labuladong.gitbook.io/algo/gao-pin-mian-shi-xi-lie/zui-da-liang-ge-jian-li-ti-jin-xing-de-shi-jian-chong-jian-ji
    public static int maxTwoEvents(int[][] events) {
        

        if (events == null || events.length == 0) {
            return 0;
        }

        // Sort events by start time
        Arrays.sort(events, Comparator.comparingInt(e -> e[0]));
        for (int[] e : events) {
            System.out.println(Arrays.toString(e));
        }

        int n = events.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = events[i][2];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int res = dp[0][i];
            for (int j = i+1; j < n; j++) {
                dp[i+1][j] = Math.max(dp[i][j-1], dp[i+1][j-1]);

                if (events[j][0] >= events[i][1]) {
                    dp[i+1][j] = Math.max(dp[i+1][j], dp[i][i] + events[j][2]);
                }
                res = Math.max(res, dp[i+1][j]);
            }
            max = Math.max(max, res);
        }

        return max;
    public static void main(String[] args) {
        int[][] events = {{1,5,1},{6,9,9},{5,7,5}};
        System.out.println(maxTwoEvents(events));
    }
    }

    
}