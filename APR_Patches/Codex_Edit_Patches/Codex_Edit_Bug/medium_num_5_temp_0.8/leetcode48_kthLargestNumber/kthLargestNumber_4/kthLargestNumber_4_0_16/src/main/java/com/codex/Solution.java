package com.codex;

import java.util.*;

public class Solution {
   public static String kthLargestNumber(String[] nums, int k) {
        if (nums == null || nums.length == 0) return "";

        PriorityQueue<String> minHeap = new PriorityQueue<String>((s1, s2) -> s2.concat(s1).compareTo(s1.concat(s2)));

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

        String result = sb.toString();
        return result.startsWith("0") ? "0" : result;
    }
}