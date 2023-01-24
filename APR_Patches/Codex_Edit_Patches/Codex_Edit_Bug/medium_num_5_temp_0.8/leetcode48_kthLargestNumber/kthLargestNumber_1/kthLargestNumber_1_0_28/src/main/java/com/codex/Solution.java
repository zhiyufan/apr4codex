package com.codex;

import java.util.*;

public class Solution {
    public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<String> minHeap = new PriorityQueue<String>((a, b) -> (a + b).compareTo(b + a));
        for (String num : nums) {
        	if(!num.equals("null")) {
        		minHeap.offer(num);
        	}
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int size = minHeap.size();
        if(size == 1) {
        	return minHeap.peek();
        }
        StringBuilder sb = new StringBuilder(minHeap.poll());
        for (int i = 0; i < size - 1; i++) {
            sb.append(minHeap.poll());	
        }
        return sb.toString();
    }

}
    
}