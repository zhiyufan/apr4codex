package com.codex;

import java.util.*;

public class Solution {

        public static int eliminateMaximum(int[] dist, int[] speed) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int charge = 0;

        for (int i = 0; i < dist.length; i++) {
            int point = dist[i] * speed[i];
            pq.add(point);
            charge += point;
        }
        int count = 0;

        while (!pq.isEmpty()) {
            charge -= pq.poll();
            count++;
            if (charge < 0) {
                break;
            }
        }

        return count;
    }

    
}