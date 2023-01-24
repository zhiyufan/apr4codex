package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        

        if (nums == null || nums.length == 0) return "";

        //PriorityQueue<String> minHeap = new PriorityQueue<String>((s1, s2) -> (s1 + s2).compareTo(s2 + s1));
        PriorityQueue<String> minHeap = new PriorityQueue<String>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1 + s2).compareTo(s2 + s1);
            }
        });

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