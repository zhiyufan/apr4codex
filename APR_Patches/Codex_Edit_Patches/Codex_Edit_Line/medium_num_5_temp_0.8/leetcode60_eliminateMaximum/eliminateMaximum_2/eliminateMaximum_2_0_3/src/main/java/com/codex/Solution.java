package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < dist.length; i++) {
            pq.add(dist[i] * speed[i]);
        }
        int count = 0;
        int charge = 0;
        while (!pq.isEmpty()) {
            charge += pq.poll();
            count++;
            if (charge < 0) {
                break;
            }
        }
        return count;
    }

    
            
    public static void main(String[] args) {
        int[] dist = {10, 20, 50, 40, 50, 40};
        int[] speed = {2, 3, 4, 5, 6, 8};
        System.out.print(eliminateMaximum(dist, speed));
    }
}
}