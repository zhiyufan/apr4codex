package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        

        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i = 0; i < dist.length; i++) {
            pq.add((long) dist[i] * speed[i]);
        }
        long prev = pq.poll();
        int count = 0;
        while (!pq.isEmpty() && pq.peek() - prev >= dist[0]) {//dist[0] is the maximum distance, so if the time taken is greater than that, then we can eliminate the car
            count++;
            pq.poll();
        }
        if (pq.isEmpty()) return count + 1; //We are returning count plus 1 because the first car is the slowest, so it will definitely reach the police station
        return count + 2; //we are returning count plus 2 because the first car won't reach the police station and the second will reach it, so it should be added in the count
    }

    
}