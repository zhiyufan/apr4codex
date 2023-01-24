package com.codex;

import java.util.*;

public class Solution {
public static int eliminateMaximum(int[] dist, int[] speed) {
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
        double first = dist[a] / (double) speed[a];
        double second = dist[b] / (double) speed[b];
        return (int) (second - first);
    });
    for (int i = 0; i < dist.length; i++) {
        pq.add(i);
    }
    int res = 0;
    double cur = dist[pq.poll()] / (double) speed[pq.poll()];
    while (!pq.isEmpty()) {
        double next = dist[pq.poll()] / (double) speed[pq.poll()];
        if (next - cur > 1) {
            cur = next;
            pq.poll();
        }
        res++;
    }

    return res;
}
}