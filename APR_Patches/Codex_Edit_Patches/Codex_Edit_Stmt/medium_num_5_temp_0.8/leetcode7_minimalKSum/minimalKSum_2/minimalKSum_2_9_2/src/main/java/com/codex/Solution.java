package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(nums.length, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return (int) (a - b);
            }
        });
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