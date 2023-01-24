package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 3, 2};
        System.out.println(kthLargestNumber(arr, 3));
    }

    public static int kthLargestNumber(int[] nums, int k) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!minHeap.isEmpty()) {
            sb.append(minHeap.poll());
        }
        return sb.reverse().toString();
    }

    
}