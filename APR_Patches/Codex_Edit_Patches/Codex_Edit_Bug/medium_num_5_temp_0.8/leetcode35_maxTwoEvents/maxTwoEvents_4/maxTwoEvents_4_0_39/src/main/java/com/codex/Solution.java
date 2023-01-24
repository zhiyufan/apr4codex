package com.codex;

import java.util.*;

public class Solution {
public static int maxTwoEvents(int[][] events) {
    
    int n = events.length;
    if (n < 1) {
        return 0;
    }
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);
    Arrays.sort(events, Comparator.comparingInt(e -> e[1]));
    int[] dp = new int[n + 1];
    for (int[] e : events) {
        pq.offer(e);
        while (!pq.isEmpty() && pq.peek()[1] < e[0]) {
            pq.poll();
        }
        // sum up all the points of events in the priority queue, including the current event e
        int points = pq.stream().mapToInt(a -> a[2]).sum() + e[2];
        dp[e[0]] = Math.max(dp[e[0]], points);
    }
    return Arrays.stream(dp).max().getAsInt();
}

//    
//    
        
    
}