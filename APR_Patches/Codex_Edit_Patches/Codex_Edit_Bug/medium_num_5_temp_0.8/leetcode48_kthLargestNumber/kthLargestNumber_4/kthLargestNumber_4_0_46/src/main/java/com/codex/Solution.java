package com.codex;

import java.util.*;

public class Solution {
public static String kthLargestNumber(String[] nums, int k) {
        // Write your solution here

        if (nums == null || nums.length == 0) return "";
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1 + o2).compareTo(o2 + o1);
            }
        };
        PriorityQueue<String> minHeap = new PriorityQueue<>(comparator);
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

        return sb.toString();

    }
}
}