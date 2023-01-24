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
            if(cur==0){
                cur = q.poll();
            }
            int num = q.poll();
            if (num -1 > 0) {
                q.offer(num - 1);
            }
            k--;
            cur++;
        }
        while (!q.isEmpty()) {
            cur++;
        }
        return cur;
    }


    
}