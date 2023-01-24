package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        Queue<Integer> pq = new PriorityQueue<>();
        int count = 0, i = 0;
        for (int day = 1; day <= 100000; day++) {
            while (!pq.isEmpty() && pq.peek() < day) pq.poll();
            while (i < events.length && events[i][0] == day) {
                pq.offer(events[i++][1]);
            }
            if (!pq.isEmpty()) {
                pq.poll();
                count++;
            }
            if (pq.isEmpty() && i == events.length) break;
        }
        return count;
    }

}
}