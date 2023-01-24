package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(int[] nums, int k) {
        

        PriorityQueue<Double> pq = new PriorityQueue<>();
        for (int i = 0; i < dist.length; i++) {
            pq.add((double) dist[i] / speed[i]);
        }
        int count = 0;
        while (!pq.isEmpty() && pq.peek() - 1.0 >= nums[k]) {
            count++;
            pq.poll();
        }
        return pq.size();
    }

    
}