package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i : tickets) { 
            q.offer(i);
        }
        
        int cur = 0; 
        int cnt = 0;
        
        while (k > 0) {
            int num = q.poll();
            if (num > 1) {
                q.offer(num - 1);
                cnt++;
            } 
            if (cnt == 0 && !q.isEmpty()) {
                int num2 = q.poll();
                q.offer(num2);
            }
            cnt--;
            k--; 
        }
        return cur;  
    } 


    
}