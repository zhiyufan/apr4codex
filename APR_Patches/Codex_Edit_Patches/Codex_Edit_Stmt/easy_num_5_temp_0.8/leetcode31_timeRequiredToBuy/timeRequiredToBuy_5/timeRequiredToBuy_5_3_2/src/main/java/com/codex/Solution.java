package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i : tickets) {
            pq.offer(i);
        }
        int cur = 0;
        while (k > 0) {
            int num = pq.poll();
            if (num > 1) {
                pq.offer(num - 1);
            }
            cur++;
            k--;
        }
        return cur;
    }

/* Time complexity: O(nlogn)
 */






/*
 * Another version:
 *
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> q = new LinkedList<Integer>();
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