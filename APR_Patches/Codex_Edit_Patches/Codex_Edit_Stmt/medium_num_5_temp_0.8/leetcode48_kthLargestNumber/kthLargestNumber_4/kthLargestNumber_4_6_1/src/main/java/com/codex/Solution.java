package com.codex;

import java.util.*;

public class Solution {
 public static String kthLargestNumber(String[] nums, int k) {
        if (nums == null || nums.length == 0) {
           return "";
    }

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for (int i = 0; i < nums.length; i++) {
           minHeap.offer(Integer.parseInt(nums[i]));
           if (minHeap.size() > k) {
              minHeap.poll();
           }
        }
        int res = minHeap.poll();
        return String.valueOf(res);
 }
}