package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(int[] nums, int k) {
        

        if (nums == null || nums.length == 0) return "";

        PriorityQueue<String> minHeap = new PriorityQueue<String>((s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        for (int num : nums) {
            minHeap.offer(String.valueOf(num));
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!minHeap.isEmpty()) {
            sb.append(minHeap.poll());
        }

        if (sb.charAt(0) == '0') {
            return "0";
        }
        return sb.toString();

    }

    
}