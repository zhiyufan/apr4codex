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


    public static String largestNumber(String[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        PriorityQueue<String> minHeap = new PriorityQueue<String>((a, b) -> (b + a).compareTo(a + b));
        for (String num : nums) {
            minHeap.offer(num);
        }
        StringBuilder sb = new StringBuilder();
        while (!minHeap.isEmpty()) {
            sb.append(minHeap.poll());
        }
        return sb.charAt(0) == '0' ? "0" : sb.toString();
    }

    
}