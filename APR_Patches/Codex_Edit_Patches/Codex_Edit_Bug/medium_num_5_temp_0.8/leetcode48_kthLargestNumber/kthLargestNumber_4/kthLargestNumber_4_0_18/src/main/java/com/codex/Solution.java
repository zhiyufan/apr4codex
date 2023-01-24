package com.codex;

import java.util.*;

public class Solution {
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

    public static void main(String[] args) {
        String[] nums = {"3", "5", "2", "7", "2", "1", "6", "5", "1"};
        String result = SmallestNumber.kthLargestNumber(nums, 8);
        System.out.println(result);
        String[] nums2 = {"3", "5", "2", "7", "2", "1", "6", "5", "1"};
        String result2 = SmallestNumber.kthBitonicSequence(nums2, 8);
        System.out.println(result2);
    }

    

    
}