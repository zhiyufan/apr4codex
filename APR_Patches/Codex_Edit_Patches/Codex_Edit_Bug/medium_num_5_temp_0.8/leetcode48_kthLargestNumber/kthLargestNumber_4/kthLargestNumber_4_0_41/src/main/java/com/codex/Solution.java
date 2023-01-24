package com.codex;

import java.util.*;

public class Solution {
 
    public static String kthLargestNumber(String[] nums, int k) {
        //from big to small

        if (nums == null || nums.length == 0) return "";

        PriorityQueue<String> minHeap = new PriorityQueue<String>((s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        for (String num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        StringBuilder result = new StringBuilder();
        while(!minHeap.isEmpty()) {
            result.append(minHeap.poll());
        }

        return result.toString();
    }
}