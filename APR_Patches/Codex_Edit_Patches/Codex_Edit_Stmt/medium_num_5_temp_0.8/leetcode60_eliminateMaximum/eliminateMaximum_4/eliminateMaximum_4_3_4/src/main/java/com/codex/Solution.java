package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        

        PriorityQueue<int> pq = new PriorityQueue<>();
        for (int i = 0; i < dist.length; i++) {
            pq.add(( int ) dist[i] / speed[i]);
        }
        int cur = pq.poll();
        int count = 0;
        while (!pq.isEmpty() && pq.peek() - cur <= 1) {
            count++;
            pq.poll();
        }
        if (pq.isEmpty()) return dist.length;
        return count;
    }

    
}