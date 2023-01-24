package com.codex;

import java.util.*;

public class Solution {
    long sum = 0;
    for(int i = 1; i < k; i++) {
        sum += i;
        for(int num : nums) {
            if(num == i) {
                sum -= num;
            }
        }
    }
    for(int num : nums) {
        sum += num;
    }
    return sum;


    // PriorityQueue
    public static long minimalKSum(int[] nums, int k) { 
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums) {
            pq.add(num);
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