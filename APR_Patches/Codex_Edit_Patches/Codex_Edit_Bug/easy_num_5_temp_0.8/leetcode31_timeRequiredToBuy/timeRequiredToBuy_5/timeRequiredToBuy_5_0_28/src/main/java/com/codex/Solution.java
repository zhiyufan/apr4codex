package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i : tickets) {
            queue.offer(i);
        }
        int cur = 0;
        while (k > 0) {
            int num = queue.poll();
            if (num > 1) {
                queue.offer(num - 1);
            }
            cur++;
            k--;
        }
        while (!queue.isEmpty()) {
            queue.poll();
            cur++;
        }
        return cur;
    }


    
}