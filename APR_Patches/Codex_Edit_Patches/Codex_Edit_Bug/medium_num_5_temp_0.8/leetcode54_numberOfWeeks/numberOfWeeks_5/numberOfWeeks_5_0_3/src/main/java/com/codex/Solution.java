package com.codex;

import java.util.*;

public class Solution {
public static long numberOfWeeks(int[] milestones) {
    int result = 0, completionTime = 0;
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
    for (int i = 0; i < milestones.length; i++) {
        pq.offer(new int[] { milestones[i], milestones[i] });
    }
    while (!pq.isEmpty()) {
        int[] current = pq.poll();
        completionTime += current[1];
        if (current[1] > 0) {
            pq.offer(new int[] { completionTime, current[1] - 1 });  
        }
    }
    return completionTime;
}
}