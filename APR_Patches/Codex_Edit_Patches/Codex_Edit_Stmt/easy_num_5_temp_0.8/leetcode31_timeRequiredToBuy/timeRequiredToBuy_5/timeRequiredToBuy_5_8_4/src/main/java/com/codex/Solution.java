package com.codex;

import java.util.*;

public class Solution {
    /**
     * Solution
     * https://monotone.tistory.com/15
     */
    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i : tickets) {
            q.offer(i);
        }
        
        int cur = 0;
        while(k > 0) {
            int curCnt = q.poll()-1;
            if(curCnt > 0) {
                q.offer(curCnt);
            }            
            cur++;
            k--;
        }

        while(!q.isEmpty()) {
            q.poll();
            cur++;
        }
        
        return cur;
    }    
    
    
    
}