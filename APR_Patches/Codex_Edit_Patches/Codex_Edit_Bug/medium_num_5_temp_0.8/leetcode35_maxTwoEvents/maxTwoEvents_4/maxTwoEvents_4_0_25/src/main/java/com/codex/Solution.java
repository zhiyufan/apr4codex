package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {

        
        int n = events.length;
        if (n < 1) {
            return 0;
        }
        dp[0] = events[0][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);

        Arrays.sort(events, Comparator.comparingInt(e -> e[1]));

        for (int[] e : events) {
            pq.offer(e);
            while (!pq.isEmpty() && pq.peek()[1] < e[0]) {
                pq.poll();
            }
            dp[e[0]] = Math.max(dp[e[0]], pq.stream().mapToInt(a -> a[2]).sum() + e[2]);
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    
}