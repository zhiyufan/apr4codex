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
        return count;
    }




//Second version without using PriorityQueue
    public static int eliminateMaximum(int[] dist, int[] speed) {
        Double[] distSpeed = new Double[speed.length];
        for (int i = 0; i < speed.length; i++) {
            distSpeed[i] = (double) dist[i] / speed[i];
        }
        Arrays.sort(distSpeed);

        int count = 0;
        double max = 0;
        for (int i = distSpeed.length - 1; i > 0; i--) {
            if (distSpeed[i] - distSpeed[i - 1] <= 1) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    
}