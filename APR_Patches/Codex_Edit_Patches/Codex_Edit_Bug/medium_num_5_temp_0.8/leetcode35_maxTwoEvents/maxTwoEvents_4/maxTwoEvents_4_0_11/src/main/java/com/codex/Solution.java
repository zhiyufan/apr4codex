package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        if (n < 1) {
            return 0;
        }
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int[] dp = new int[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        for (int i = 0; i < n; i++) {
            int[] e = events[i];
            pq.offer(e);            
            while (pq.peek()[0] < e[1]) {
                pq.poll();
            }
            dp[i] = Math.max(dp[i], pq.stream().mapToInt(a -> a[2]).sum() + e[2]);
            if (i > 0) {
                dp[i] = Math.max(dp[i - 1], dp[i]);
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    
}