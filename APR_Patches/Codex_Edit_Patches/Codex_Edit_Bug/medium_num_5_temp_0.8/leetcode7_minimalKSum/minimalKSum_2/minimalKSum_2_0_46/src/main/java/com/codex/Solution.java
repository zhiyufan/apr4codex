package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {

        long sum = 0;
        
        if(nums.length <= k) {
            for(int num : nums) {
                sum += num;
            }
            return sum;
        } else {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int num : nums) {
                pq.add(num);
            }
            for(int i = 1; i <= k; i++) {
                pq.add(i);
            }
            while(!pq.isEmpty()) {
                sum += pq.poll();
            }
        }
        return sum;
    }

    
}