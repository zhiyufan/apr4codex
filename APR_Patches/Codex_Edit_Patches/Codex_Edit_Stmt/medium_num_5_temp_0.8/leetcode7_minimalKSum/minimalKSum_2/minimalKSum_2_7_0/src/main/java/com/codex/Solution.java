package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums) {
            //pq.add(num);
            pq.add(0);
            pq.add(num);//use "add(0)" to add the numbers that are greater than k
        }
        for(int i = 1; i <= k; i++) {
            if(pq.peek() < i) {
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