package com.codex;

import java.util.*;

public class Solution {


        private static class StringComparator implements Comparator<String> {

        public int compare(String s1, String s2) {
            String str1 = s1 + s2;
            String str2 = s2 + s1;

            return str1.compareTo(str2);
        }

        public boolean equals(String s1, String s2) {
            return s1.equals(s2);
        }
    }


    public static String kthLargestNumber(String[] nums, int k) {
        

        if (nums == null || nums.length == 0) return "";

        PriorityQueue<String> minHeap = new PriorityQueue<String>((s1, s2) -> (s1 + s2).compareTo(s2 + s1));

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