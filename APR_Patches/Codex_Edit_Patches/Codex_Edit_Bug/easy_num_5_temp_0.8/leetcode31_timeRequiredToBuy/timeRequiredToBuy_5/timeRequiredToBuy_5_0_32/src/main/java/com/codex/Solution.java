package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i : tickets) {
            q.offer(i);
        }
        int cur = 0;
        while (k > 0) {
            for (int i = 0; i < k; i++) {
                int curMax = q.peek();
                int tmpMax = q.poll();
                if (curMax < tmpMax) {
                    curMax = tmpMax;
                }
                q.offer(tmpMax);
            }
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