package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> (a[0] - b[0]));
        int n = events.length;
        int active = 0;
        int j = 0;
        int count = 0;
        Queue<int[]> heap = new PriorityQueue<int[]>((a, b) -> (a[1] - b[1]));
        for (int i = 1; i <= 100000; i++) {
            while (j < n && events[j][0] == i) {
                heap.offer(events[j++]);
            }
            while (!heap.isEmpty() && heap.peek()[1] < i) {
                heap.poll();
            }
            while (heap.size() > active) {
                heap.poll();
            }
            if (!heap.isEmpty()) {
                heap.poll();
                active = 0;
                count++;
            } else {
                if (active == 0 && j == events.length) {
                    break;
                }
                active = 1;
            }
        }
        return count;
    }

}
}