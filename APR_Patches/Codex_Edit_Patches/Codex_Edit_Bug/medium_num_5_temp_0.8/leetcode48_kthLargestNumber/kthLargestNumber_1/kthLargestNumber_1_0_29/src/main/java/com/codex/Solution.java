package com.codex;

import java.util.*;

public class Solution {
public String kthLargestNumber(List<Integer> nums, int k) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for (Integer num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!minHeap.isEmpty()) {
            sb.append(minHeap.poll());
        }
        return sb.reverse().toString();
    }

    
}