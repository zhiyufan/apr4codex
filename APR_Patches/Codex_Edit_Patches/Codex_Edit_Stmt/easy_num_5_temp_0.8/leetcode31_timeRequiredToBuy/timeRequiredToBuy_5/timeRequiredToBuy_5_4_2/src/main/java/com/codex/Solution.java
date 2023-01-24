package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i : tickets) {
            q.offer(i);
        }
        int cur = 0;
        while (!q.isEmpty() && k > 0) {
            cur = q.peek();
            int num = cur;
            q.poll();
            if (num > 1) {
                q.offer(num - 1);
            }
            k--;
        }
        return cur;
    }


    
}