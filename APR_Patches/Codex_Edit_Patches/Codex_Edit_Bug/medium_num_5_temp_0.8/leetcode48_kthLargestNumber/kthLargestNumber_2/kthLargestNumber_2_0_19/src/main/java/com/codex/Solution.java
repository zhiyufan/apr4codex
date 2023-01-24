package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<String> pq = new PriorityQueue<>(k, (a, b) -> (b + a).compareTo(a + b));
        for (String s : nums) {
            pq.offer(s);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            sb.append(pq.poll());
        }

        return sb.toString();
    }

    
}