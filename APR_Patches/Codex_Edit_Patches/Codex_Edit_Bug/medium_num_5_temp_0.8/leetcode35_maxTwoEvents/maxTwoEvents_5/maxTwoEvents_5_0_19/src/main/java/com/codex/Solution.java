package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a,b) -> a[0] - b[0]); // sort events by the first dimension (starting time)
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){ // max-heap
            public int compare(int[] a, int[] b) {
                return b[1] - a[1];
             }
        });
        int total = 0;
        for (int i = 0; i < events.length; i++) {
            if (!pq.isEmpty() && pq.peek()[1] <= events[i][0]) { // if the first event in the pq is not overlapping with the current event
                total -= pq.poll()[1]; // remove the event with the largest end time from the pq
            }
            pq.offer(events[i]); // push the current event into the pq
            total += events[i][2];
        }
        return total;
}