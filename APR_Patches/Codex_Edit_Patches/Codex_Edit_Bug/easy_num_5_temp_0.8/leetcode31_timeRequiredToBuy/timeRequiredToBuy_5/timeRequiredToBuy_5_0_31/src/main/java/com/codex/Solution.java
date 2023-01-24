package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        if (tickets == null || tickets.length == 0) {
            return 0;
        }
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
            int num = q.poll();
            cur += 1 + num;
            cur++;
        }
        return cur;
    }


    
}