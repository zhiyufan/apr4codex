package com.codex;

import java.util.*;

public class Solution {
    public static int eliminateMaximum(List<Integer> dist, List<Integer> speed) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(dist.size(), Collections.reverseOrder());
        for (int i = 0; i < dist.size(); i++) pq.add(dist.get(i) * speed.get(i));
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
}