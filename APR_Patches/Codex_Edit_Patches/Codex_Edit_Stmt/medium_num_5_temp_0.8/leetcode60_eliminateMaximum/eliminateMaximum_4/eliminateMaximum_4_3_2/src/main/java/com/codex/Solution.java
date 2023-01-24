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
        while (!pq.isEmpty() && pq.peek() - cur <= 1) {
            count++;
            pq.poll();
        }
        if (pq.isEmpty()) return dist.length;
        return count;
    public static int eliminateMaximum(int[] dist, int[] speed) {
        if (dist == null || speed == null || dist.length != speed.length) {
            return 0;
        }
        int n = dist.length;
        double[] time = new double[n];
        for (int i = 0; i < n; i++) {
            time[i] = (double) dist[i] / speed[i];
        }
        Arrays.sort(time);
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (time[i] - time[i-1] <= 1) {
                count++;
            } else {
                return count;
            }
        }
        
        return count;
    }


    }

    
}