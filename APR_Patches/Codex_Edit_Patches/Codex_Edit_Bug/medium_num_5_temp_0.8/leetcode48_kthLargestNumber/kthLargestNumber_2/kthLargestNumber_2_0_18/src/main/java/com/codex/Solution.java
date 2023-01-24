package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(int[] nums, int k) {
    
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : nums)
            pq.offer(s);
        while (!pq.isEmpty()) {
            k--;
            if (k == 0)
                return pq.poll() + "";
            pq.poll();
        }
        return "";
    }  

    
}