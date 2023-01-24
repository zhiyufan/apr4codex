package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < dist.length; i++) {
            pq.add(dist[i] * speed[i]);
        }
        int count = 1;
        int charge = 0;
        while (!pq.isEmpty()) {
            int speed = pq.poll();
            charge += speed;

            if (charge < 0) {
                break;
            }
        }
        return count;
    }

    
}