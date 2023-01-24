package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {

        // We can do this in O(n lg n), but it's a bit easier to use a heap.
        PriorityQueue<Long> queue = new PriorityQueue<Long>();
        for (int milestone : milestones) {
            queue.add((long) milestone);
        }

        long total = 0;
        for (;;) {
            long top = queue.poll();
            total++;
            if (top <= 1) break;
            queue.add(top / 2);
            queue.add((top - 1) / 2);
        }
        
        return total;
    }  
}