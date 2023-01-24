package com.codex;

import java.util.*;

public class Solution {
    
    public static int eliminateMaximum(int[] dist, int[] speed) {
        Arrays.sort(dist);
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i : speed) {
            pq.add(i);
        }
        int count = 0;
        int idx = 0;
        int pre = dist[idx];
        int max = pq.peek();
        while (pq.size() > 0 && idx < dist.length) {
            int cur = dist[idx];
            if (cur - pre > 1) {
                pq.poll();
            } else {
                if (pq.peek() <= max) {
                    pq.poll();
                }
            }
            idx++;
            pre = cur;
            count++;
        }
        return count;
    }

    
}