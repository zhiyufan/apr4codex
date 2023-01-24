package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(int[] nums, int k) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for(int num : nums){
            minHeap.offer(num);    
            if (minHeap.size() > k) {
                minHeap.poll();    
            }
        }
        int size = minHeap.size();
        int[] result = new int[size];
        for(int i = size - 1; i >= 0; i--){
            result[i] = minHeap.poll();    
        }
        return sb.reverse().toString();
    }

    
}