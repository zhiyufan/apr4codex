package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> q = new LinkedList<Integer>();
        
        int num = 0;
        
        for (int i : tickets) {
            q.offer(i);
        }
        
        int cur = 0;
        
        while (k > 0) {
            num = q.poll();
            if (num > 1) {
                q.offer(num - 1);
            }
            cur++;
            k--;
        }
        
        while (!q.isEmpty()) {
            num = q.poll();
            cur += num;
        }
        
        return cur;
    }


    
}