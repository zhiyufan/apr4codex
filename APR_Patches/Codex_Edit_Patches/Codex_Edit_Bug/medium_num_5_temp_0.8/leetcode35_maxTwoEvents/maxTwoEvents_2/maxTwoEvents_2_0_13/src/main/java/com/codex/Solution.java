package com.codex;

import java.util.*;

public class Solution {
public class Events {
    public static void main(String[] args) {
        int [][] arg = {{4,6,4},{1,2,2},{5,8,5}};
        System.out.println(maxTwoEvents(arg));
    }

    public static int maxTwoEvents(int[][] events) {      
        if (events == null || events.length == 0) return 0;
        Arrays.sort(events, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                } else if (o1[1] != o2[1]) {
                    return o1[1] - o2[1];
                } else {
                    return o1[2] - o2[2];
                }
            }
        });
        int[] dp = new int[3];
        dp[0] = 0;
        dp[1] = events[0][2];
        dp[2] = events[0][2];
        for (int i = 1; i < events.length; i++) {
            dp[0] = Math.max(dp[0], Math.max(dp[1], dp[2]));
            dp[1] = events[i][2] + Math.max(dp[0], dp[2]);
            dp[2] = events[i][2] + dp[1];
        }
        return Math.max(dp[0], Math.max(dp[1], dp[2]));
    }

}
}