package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<String> pq = new PriorityQueue<>(k, (a, b) -> (b + a).compareTo(a + b));
        for (int i = 0; i < nums.length; i++) {
            pq.offer(nums[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<String> res = new ArrayList<>();
        while (k-- > 0) {
            res.add(pq.poll()); 
        }
        Collections.reverse(res);
        return String.join("", res);
    }

    
}