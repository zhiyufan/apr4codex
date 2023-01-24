package com.codex;

import java.util.*;

public class Solution {
    // Use queue to simulate the situation.
    // Time and space are both O(n).
    public static int timeRequiredToBuy(int[] tickets, int k) {
        if (tickets == null || tickets.length == 0 || k == 0) {
            return 0;
        }

        Queue<Integer> q = new LinkedList<Integer>();
        // Use for each to add all elements in the array into the queue.
        for (int i : tickets) {
            q.offer(i);
        }
        int cur = 0;
        while (k > 0) {
            int num = q.poll();
            if (num > 1) {
                q.offer(num - 1);
            }
            cur++;
            k--;
        }
        while (!q.isEmpty()) {
            q.poll();
            cur++;
        }
        return cur;
    }


    
}