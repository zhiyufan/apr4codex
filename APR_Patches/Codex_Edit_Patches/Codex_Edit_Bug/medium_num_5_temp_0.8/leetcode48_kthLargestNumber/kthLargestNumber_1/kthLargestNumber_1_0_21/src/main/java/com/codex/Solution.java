package com.codex;

import java.util.*;

public class Solution {
// @file:     kthLargestNumber.cpp
// @author:   attosky
// @date:     Sep 4, 2017
// @brief:
// 
public String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<String> minHeap = new PriorityQueue<String>((a, b) -> (a + b).compareTo(b + a));
        for (String num : nums) {
            minHeap.offer(num); // could use add instead
            if (minHeap.size() > k) {
                minHeap.poll(); // could use remove instead
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!minHeap.isEmpty()) {
            sb.append(minHeap.poll());
        }
        return sb.reverse().toString();
    }




















    
}