package com.codex;

import java.util.*;

public class Solution {

    /*
    This is a leet code coding question
    */
    public static String kthLargestNumber(String[] nums, int k) {
        

        if (nums == null || nums.length == 0 || nums.length < k) return "";


        Comparator<String> minHeapComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s1.compareTo(s2);
            }
        };

        PriorityQueue<String> minHeap = new PriorityQueue<String>(minHeapComparator);

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