package com.codex;

import java.util.*;

public class Solution {
    /**
     * Given an array of 2-D arrays that represent the start time, end time and the value of events. 
     * The task is to choose 2 events such that the sum of the value of chosen events is maximized. 
     * The events are non-overlapping.
     */
    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        if (n < 1) {
            return 0;
        }
        Arrays.sort(events, Comparator.comparingInt(e -> e[1]));
        int[] dp = new int[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);
        for (int[] e : events) {
            pq.offer(e);
            while (!pq.isEmpty() && e[0] > pq.peek()[1]) {
                pq.poll();
            }
            dp[e[0]] = Math.max(e[0] > 0 ? dp[e[0] - 1] : 0,
                                pq.stream().mapToInt(a -> a[2]).sum() + e[2]);
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    
}