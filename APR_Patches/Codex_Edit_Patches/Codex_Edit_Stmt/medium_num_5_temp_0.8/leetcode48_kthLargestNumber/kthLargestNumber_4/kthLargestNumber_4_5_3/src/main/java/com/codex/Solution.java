package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        

        if (nums == null || nums.length == 0) return "";

        PriorityQueue<String> minHeap = new PriorityQueue<String>((s1, s2) -> (s1 + s2).compareTo(s2 + s1));

        for (String num : nums) {
            minHeap.offer(num);
            /*
            // if this line is put here
            minHeap.offer(num);
            // then the minHeap.peek() would be the number with first largest number
            // which is 123456789 instead of 567891234
            */
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