package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {  
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < dist.length; i++) pq.add(new int[] {dist[i], speed[i]});

        int count = 0;
        int charge = 0;
        while (!pq.isEmpty()) {  
            int[] top = pq.poll();
            charge += top[0] * top[1];
            count++;
            if (charge < 0) {
                break;
            }
        }
        return count;    
    }

    
}