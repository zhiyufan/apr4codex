package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int dp = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);
        Arrays.sort(events, Comparator.comparingInt(e -> e[0]));
        for (int[] e : events) {
            pq.offer(e);
            while (!pq.isEmpty() && pq.peek()[1] < e[0]) {
                pq.poll();
            }
            int temp = pq.stream().mapToInt(a -> a[2]).sum() + e[2];
            dp = Math.max(dp, temp);
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    
}