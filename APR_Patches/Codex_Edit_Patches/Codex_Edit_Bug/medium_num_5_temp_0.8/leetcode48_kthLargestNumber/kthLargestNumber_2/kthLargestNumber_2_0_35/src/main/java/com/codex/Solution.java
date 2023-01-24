package com.codex;

import java.util.*;

public class Solution {
    public static String kthSmallestNumber(String[] nums, int k) {
        
        PriorityQueue<String> pq = new PriorityQueue<>(k, (a, b) -> (b + a).compareTo(a + b));
        for (String s : nums) {
            pq.offer(s);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        String res = "";
        while (!pq.isEmpty()) res += pq.poll();
        return res;
    }

    
}