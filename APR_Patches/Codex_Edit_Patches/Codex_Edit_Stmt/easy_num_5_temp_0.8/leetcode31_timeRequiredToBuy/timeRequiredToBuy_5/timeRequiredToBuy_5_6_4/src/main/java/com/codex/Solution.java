package com.codex;

import java.util.*;

public class Solution {
    // Using Priority Queue
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i : tickets) {
            q.offer(i); // q.offer(i) is different from q.add(i)
        }
        
        int cur = 0;
        while (k-- > 0) {
            int num = q.poll();
            // If num > 1, we could still get a ticket, then offer (num-1) to the queue
            if (num > 1) {
                q.offer(num - 1);
            }
            cur++;

        }
        while (!q.isEmpty()) {
            q.poll();
            cur++;
        }
        return cur;
    }


    
}