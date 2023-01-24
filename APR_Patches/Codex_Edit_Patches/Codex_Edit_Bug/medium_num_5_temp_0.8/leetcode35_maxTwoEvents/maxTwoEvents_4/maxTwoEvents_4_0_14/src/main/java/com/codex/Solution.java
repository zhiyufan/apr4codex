package com.codex;

import java.util.*;

public class Solution {

    public static int maxTwoEvents(int[][] events) {

        int n = events.length;
        if (n < 1) {
            return 0;
        }
        Arrays.sort(events, Comparator.comparingInt(e -> e[1]));
        int[] dp = new int[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        int i = 0;
        if (pq.isEmpty() || pq.peek()[1] > events[i][0]) {
            pq.offer(events[i]);
            dp[i] = Math.max(dp[i], pq.stream().mapToInt(a -> a[2]).sum());
            i++;
        } else {
            while (pq.peek()[1] < events[i][0]) {
                pq.poll();   
            }
            pq.offer(events[i]);
            dp[i] = Math.max(dp[i], pq.stream().mapToInt(a -> a[2]).sum());
            i++;
        }
        while (i < n) {
            while (!pq.isEmpty() && pq.peek()[1] < events[i][0]) {
                pq.poll();   
            }
            pq.offer(events[i]);
            dp[i] = Math.max(dp[i], pq.stream().mapToInt(a -> a[2]).sum());
            i++;
        }
        return Arrays.stream(dp).max().getAsInt();

    }
}

    
}