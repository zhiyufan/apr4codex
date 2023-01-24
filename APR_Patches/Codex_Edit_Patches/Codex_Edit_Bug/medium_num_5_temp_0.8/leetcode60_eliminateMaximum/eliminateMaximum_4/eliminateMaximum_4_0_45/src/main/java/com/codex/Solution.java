package com.codex;

import java.util.*;

public class Solution {
public static int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        if (n <= 1) return n;
        int count = n;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> dist[b] - dist[a]);
        for (int i = 0; i < n; i++) pq.add(i);
        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            if (dist[b] - dist[a] <= Math.abs(speed[b] - speed[a])) count--;
            if (dist[b] + dist[a] <= Math.abs(speed[b] + speed[a])) count--;
            if (dist[a] + dist[a] <= Math.abs(speed[a] + speed[a])) count--;
            if (dist[b] + dist[b] <= Math.abs(speed[b] + speed[b])) count--;
            pq.poll();
        }
        return count;
    }
}