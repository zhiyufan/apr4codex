package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums) {
            pq.add(num);
        }
        int prev = 0;
        for(int i = 1; i <= k; i++) {
            if(pq.peek() < i && prev != 1) {
                prev = 1;
                pq.add(i);
            }
        }
        long sum = 0;
        while(!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }

    
}