package com.codex;

import java.util.*;

public class Solution {
    public static void eliminateMaximum(int[] dist, int[] speed) {
        

        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < dist.length; i++) {
            pq.add((double) dist[i] / speed[i]);
        }
        double cur = pq.poll();
            cur = pq.poll();
        while (!pq.isEmpty() && cur - pq.peek() <= 1) {
            pq.poll();
        }
        System.out.println(dist.length - pq.size());
    }

    
}