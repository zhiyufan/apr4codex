package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        

        PriorityQueue<Double> pq = new PriorityQueue<>();
        for (int i = 0; i < dist.length; i++) {
            pq.add((double) dist[i] / speed[i]);
        }
        double cur = pq.poll();
        int count = 0;
        double min = Double.MAX_VALUE;
        while (!pq.isEmpty() && pq.peek() - cur <= min) {
            count++;
            pq.poll();
        }
        if (pq.isEmpty()) return dist.length;
        return count;
    }

    
}