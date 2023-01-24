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


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : nums) {
            pq.add(n);
        }
        if (pq.peek() >= k) {
            return 0;
        }
        int result = Integer.MAX_VALUE;
        while (!pq.isEmpty() && pq.peek() < k) {
            int cur = pq.poll();
            int curResult = 1;
            k -= cur;
            while (k > 0 && !pq.isEmpty()) {
                k -= pq.poll();
                curResult++;
            }
            if (k <= 0) {
                result = Math.min(result, curResult);
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
    }

    
}