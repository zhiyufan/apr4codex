package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        

        if (nums == null || nums.length == 0) return "";

        PriorityQueue<String> maxHeap = new PriorityQueue<String>((s1, s2) -> (s2 + s1).compareTo(s1 + s2));

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

        return sb.toString();

    }

    
}