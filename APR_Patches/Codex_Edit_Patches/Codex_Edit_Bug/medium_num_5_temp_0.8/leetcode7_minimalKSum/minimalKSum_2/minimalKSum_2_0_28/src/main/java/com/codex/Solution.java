package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int num : nums) {
            pq.add(num * -1);
        }
        for(int i = 1; i <= k; i++) {
            if(pq.peek() * -1 < i) {
                pq.poll();
                pq.add(i * -1);
            }
        }
        return pq.stream().mapToLong(Integer::intValue).map(n -> n * -1).sum();
    }

    
}