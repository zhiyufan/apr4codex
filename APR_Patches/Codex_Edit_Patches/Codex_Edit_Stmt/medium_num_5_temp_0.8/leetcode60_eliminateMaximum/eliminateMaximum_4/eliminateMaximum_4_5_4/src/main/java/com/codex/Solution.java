package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        

        PriorityQueue<Double> pq = new PriorityQueue<>(new Comparator<Double>() {
            public int compare(Double d1, Double d2) {
                return Double.compare(d1, d2);
            }
        });
        for (int i = 0; i < dist.length; i++) {
            if (speed[i] != 0)
        
                pq.add((double) dist[i] / speed[i]);
        }
        double cur = pq.poll();
        int count = 1;
        while (!pq.isEmpty() && pq.peek() - cur <= 1) {
            count++;
            pq.poll();
        }
        if (pq.isEmpty()) return dist.length;
        return count;
    }

    
}