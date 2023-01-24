package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> (b + a).compareTo(a + b));
        for (int s : nums) {
            pq.offer(Integer.parseInt(s));
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<Integer> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(pq.poll());
        }
        Collections.reverse(res);
        return String.join("", res.toString());
    }

    
}