package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        long sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums) {
            pq.add(num);
        }
        for(int i = 1; i <= k; i++) {
            if(pq.peek() < i || pq.size() < k) {
                pq.add(i);
                sum += i;
            } else {
                sum += pq.poll();
            }
        }
        while(pq.size() > k) {
            pq.poll();
        }

        while(!pq.isEmpty()) sum += pq.poll();

        return sum;
    }

    
}