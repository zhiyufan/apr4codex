package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> q = new LinkedList<Integer>();
        int total = 0;
        for (int i = 0; i < tickets.length; i++) {
            q.offer(tickets[i]);
            total += tickets[i];
        }
        int cur = 0;
        while (k > 0) {
            int num = q.poll();
            if (num > 0) {
                q.offer(num); // put the first ticket again, because it may be the largest, we need to put it to the end of the queue
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