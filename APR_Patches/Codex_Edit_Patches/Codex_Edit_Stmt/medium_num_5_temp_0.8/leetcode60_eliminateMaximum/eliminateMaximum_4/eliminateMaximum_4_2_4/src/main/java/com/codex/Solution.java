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

        // for "while (!pq.isEmpty() && pq.peek() - cur <= 1) {"
        // this kind of "while" condition can be used in form of "breakpoints":
        // basiacally, so long as the condition is met, you keep performing the loop action
        // when the while condition is no longer met, you directly exit the while loop
        // this is useful when you have to check and do some operations on elements in the while loop
    }

    
}