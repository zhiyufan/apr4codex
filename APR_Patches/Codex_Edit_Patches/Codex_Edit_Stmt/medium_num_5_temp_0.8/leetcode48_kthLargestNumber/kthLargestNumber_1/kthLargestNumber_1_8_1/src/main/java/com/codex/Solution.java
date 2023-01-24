package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        
        Comparator<String> comp = new Comparator<String>(){
            public int compare(String a, String b) {
                return Integer.compare(Integer.parseInt(a + b), Integer.parseInt(b + a));
            }
        };
        PriorityQueue<String> minHeap = new PriorityQueue<String>(comp);
        
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
        return sb.reverse().toString();
    }

    
}