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
    
    public int findKthNumber(int[] nums, int k) {
        
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for(int i : nums) {
            q.add(i);    
        }
        
        int count = 0;
        int num = q.remove();
        count++;
        
        while(count < k) {
            q.add(num);
            num = q.remove();
            count++;
        }
        return num;
        
    }


}