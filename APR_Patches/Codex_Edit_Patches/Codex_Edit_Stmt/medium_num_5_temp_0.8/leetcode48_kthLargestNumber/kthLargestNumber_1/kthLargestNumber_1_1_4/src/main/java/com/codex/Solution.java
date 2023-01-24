package com.codex;

import java.util.*;

public class Solution {
import java.util.PriorityQueue;

class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> minHeap = new PriorityQueue<String>((a, b) -> (a + b).compareTo(b + a));
        for (String num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int size = minHeap.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(minHeap.poll());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String[] input = { "1", "2", "3" };
        int k = 2;
        Solution sol = new Solution();
        System.out.println(sol.kthLargestNumber(input, k));
    }
}
}