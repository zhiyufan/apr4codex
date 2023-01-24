package com.codex;

import java.util.*;

public class Solution {

    public static String kthLargestNumber(String[] nums, int k) {

        // TODO: Write your code here
        
        if (nums == null || nums.length == 0) return "";

        int n = nums.length;

        if (k + 1 > n) return "";

        if (k == n) return String.join("", nums);

        PriorityQueue<String> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (String s : nums)
            maxHeap.offer(s);

        StringBuilder sb = new StringBuilder();
        while(k > 0) {
            sb.append(maxHeap.poll());
            k--;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"1", "2", "3", "4", "5"};
        int k = 3;
        System.out.println(kthLargestNumber(strs, k));
    }

















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