package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> 
		(b + "" + a).compareTo(a + "" + b));
        for (int s : nums) {
            pq.offer(s);		
            if (pq.size() > k) {
                pq.poll();
            }
        }
        StringBuilder res = new StringBuilder();
        while (!pq.isEmpty()) {
            res.append(pq.poll());
        }
	
	if (res.length() > 0 && res.charAt(0) == '0') {
	    return "0";
	}
        return res.toString();
    }

    
}