package com.codex;

import java.util.*;

public class Solution {
    public static String kthSmallestNumber(String[] nums, int k) {
        
        PriorityQueue<String> maxHeap = new PriorityQueue<String>((a, b) -> (b + a).compareTo(a + b));
        for (String num : nums) {
            maxHeap.offer(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            sb.append(maxHeap.poll());
        }
        return sb.reverse().toString();
    }

    
}