package com.codex;

import java.util.*;

public class Solution {
    // Time: O(knlogk) n is the number of nums, k is the average length of each num.
    // Space: O(k)
    
    public static String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> maxHeap = new PriorityQueue<String>((a, b) -> (b + a).compareTo(a + b));
        for (String num : nums) {
            maxHeap.offer(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        StringBuilder sb = new StringBuilder(); 
        while (!maxHeap.isEmpty()) { 
            sb.append(maxHeap.poll()); 
        } 
        return sb.toString(); 
    }
}