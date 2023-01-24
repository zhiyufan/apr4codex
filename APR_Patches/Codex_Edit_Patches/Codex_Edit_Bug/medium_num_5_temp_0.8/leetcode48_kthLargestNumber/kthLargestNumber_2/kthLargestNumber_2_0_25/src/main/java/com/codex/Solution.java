package com.codex;

import java.util.*;

public class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (String s : nums) {
            pq.offer(Integer.parseInt(s));
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return new String("" + pq.poll());
        }
    
}