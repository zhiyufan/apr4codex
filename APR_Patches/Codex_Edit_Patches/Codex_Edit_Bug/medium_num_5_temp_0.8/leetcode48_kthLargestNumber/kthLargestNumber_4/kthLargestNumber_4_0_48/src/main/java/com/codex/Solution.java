package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        

        if (nums == null || nums.length == 0) return "";

        PriorityQueue<String> minHeap = new PriorityQueue<String>((s1, s2) -> (s1 + s2).compareTo(s2 + s1));

        for (String num : nums) {
        // poll K numbers and the remain are what we want
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        StringBuilder sb = new StringBuilder();
        while (k > 0) {
            sb.append(minHeap.poll());
        }

        return sb.toString();

    }

    
}