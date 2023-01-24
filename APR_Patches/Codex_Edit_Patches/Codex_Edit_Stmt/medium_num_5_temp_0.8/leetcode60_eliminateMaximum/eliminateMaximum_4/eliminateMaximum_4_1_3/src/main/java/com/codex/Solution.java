package com.codex;

import java.util.*;

public class Solution {
    // Greedy
    public static int eliminateMaximum(int[] dist, int[] speed) {
        

        PriorityQueue<Double> pq = new PriorityQueue<>();
        for (int i = 0; i < dist.length; i++) {
            pq.add((double) dist[i] / speed[i]);
        }
        double cur = pq.poll();
        int count = 0;
        while (!pq.isEmpty() && pq.peek() - cur <= 1) {
            count++;
            pq.poll();
        }
        if (pq.isEmpty()) return dist.length - 1;
        return count;

    // DP

    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        double[] time = new double[dist.length];
        for (int i = 0; i < dist.length; i++) {
            time[i] = (double) dist[i] / speed[i];
        }
        Arrays.sort(time);
        int result = 1;
        for (int i = 0; i < time.length - 1; i++) {
            if (time[i + 1] - time[i] <= 1) {
                result++;
            }
        }
        return dist.length - result;
    }
    }

    
}