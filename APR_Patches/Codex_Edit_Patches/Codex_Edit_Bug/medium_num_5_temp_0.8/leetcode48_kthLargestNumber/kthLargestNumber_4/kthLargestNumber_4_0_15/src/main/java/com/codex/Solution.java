package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        
        int n = nums.length;
        if (n == 0) return "";
        

        PriorityQueue<String> minHeap = new PriorityQueue<>(n, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));

        for (String num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!minHeap.isEmpty()) {
            sb.append(minHeap.poll());		
        }

        return sb.toString();

    }

    
}