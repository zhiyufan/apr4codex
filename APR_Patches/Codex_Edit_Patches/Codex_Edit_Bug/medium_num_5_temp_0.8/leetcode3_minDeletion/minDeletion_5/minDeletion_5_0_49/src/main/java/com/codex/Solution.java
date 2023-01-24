package com.codex;

import java.util.*;

public class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int left = 0;
        int right = 0;
        // max heap is for tracking the max value in the sliding window
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // min heap is for tracking the min value in the sliding window
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // we start with sliding window of size 1 and try extending the right side till the absolute difference is less than equals to the limit and then keep shifting the window
        while (right < nums.length) {
            maxHeap.add(nums[right]);
            minHeap.add(nums[right]);
            // if difference is within limits we extend the window to the right
            if (maxHeap.peek() - minHeap.peek() <= limit) {
                // we keep tracking the max size of the sliding window
                result = Math.max(result, right - left + 1);
                right++;
            } else {
                // in case of absolute difference is greater than limit, we try to reduce the window size by shifting the left side
                maxHeap.remove(nums[left]);
                minHeap.remove(nums[left]);
                left++;
            }
        }
        return result;
    }

    
    
}