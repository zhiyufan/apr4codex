package com.codex;

import java.util.*;

public class Solution {
public static int eliminateMaximum(int[] dist, int[] speed) {

    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    for (int i = 0; i < dist.length; i++) {
        if (i == 0) {
            pq.add(dist[i] * speed[i]);
        } else {
            pq.add((dist[i] - dist[i - 1]) * speed[i]);
        }
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
}