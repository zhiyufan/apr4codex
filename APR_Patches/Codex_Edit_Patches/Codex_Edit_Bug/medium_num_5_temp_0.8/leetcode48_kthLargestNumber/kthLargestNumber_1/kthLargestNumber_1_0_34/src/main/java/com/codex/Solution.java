package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(int[] nums, int k) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((a, b) -> (a + b).compareTo(b + a));
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!minHeap.isEmpty()) {
            sb.append(minHeap.poll());
        }
        return "0".equals(sb.toString()) ? "0" : sb.reverse().toString();
    }

    
}