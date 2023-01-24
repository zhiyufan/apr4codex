package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        if (n < 1) {
            return 0;
        }
        int[] dp = new int[n];
        Arrays.sort(events, Comparator.comparingInt(e -> e[0]));
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < n; i++) {
            dp[i] = events[i][2];
            for (int[] e : pq) {
                if (e[1] < events[i][0]) {
                    dp[i] = Math.max(dp[i], dp[i - 1] + e[2]);
                } else {
                    break;
                }
            }
            pq.offer(events[i]);
        }
        return Arrays.stream(dp).max().getAsInt();
    }

}
}