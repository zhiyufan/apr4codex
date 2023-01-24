package com.codex;

import java.util.*;

public class Solution {
    public static int maxNumEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[1] - b[1]);
        // Use a priority queue to keep track of all conflicting events, 
        // the top of the queue is the event with earliest ending time.
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int numEvents = 0;
        int day = 1;
        int i = 0;
        while (i < events.length || !pq.isEmpty()) {
            while (i < events.length && events[i][0] == day) {
                pq.offer(events[i]);
                i++;
            }
            if (!pq.isEmpty()) {
                numEvents++;
                pq.poll();
            }
            day++;
        }
        return numEvents;
    }
}