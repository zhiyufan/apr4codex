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
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);

        for(int i = 0; i < n; i++) {
            int[] e = events[i];

            while (!pq.isEmpty() && pq.peek()[1] <= e[0]) {
                int[] tmp = pq.poll();
                dp[tmp[1]] = Math.max(dp[tmp[1]], pq.stream().mapToInt(a -> a[2]).sum() + tmp[2]);
            }
            pq.offer(e);           
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    
}