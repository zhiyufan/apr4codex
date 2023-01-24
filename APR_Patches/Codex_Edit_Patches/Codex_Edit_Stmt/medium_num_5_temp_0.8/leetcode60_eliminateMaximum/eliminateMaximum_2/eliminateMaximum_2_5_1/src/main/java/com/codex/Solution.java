package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < dist.length; i++) {
            pq.add(dist[i] * speed[i]);
        }
        int count = 0;
        int charge = dist.length / 2;
        while (!pq.isEmpty()) {
            charge += pq.poll();
            count++;
            if (charge < 0) {
                break;
            }
        }
        return count;
    }

    
}