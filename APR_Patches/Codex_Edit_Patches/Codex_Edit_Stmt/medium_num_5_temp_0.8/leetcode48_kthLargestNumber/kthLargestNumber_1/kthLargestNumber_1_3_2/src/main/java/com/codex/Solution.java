package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<String> minHeap = new PriorityQueue<String>((a, b) -> (a + b).compareTo(b + a));
        for (String num : nums) {
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
    // Input: ["1", "4", "67", "88"], k = 4
	// Output: "11488"
	// Explanation: 4 numbers, 1, 4, 67, 88 -> smallest number: 4, which is "11488".

    
}