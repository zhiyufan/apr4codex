package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<String> pq = new PriorityQueue<>(k, (a, b) -> (b + a).compareTo(a + b));
        for (String s : nums) {
            pq.offer(s);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<String> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(pq.poll());
        }
        Collections.reverse(res);
        return String.join("", res);
    }

    public static String kthLargestNumber(String[] nums, int k) {
    
		Comparator<String> comp = (a, b) -> (a + b).compareTo(b + a);
		PriorityQueue<String> pq = new PriorityQueue(k, comp);
		for (int i = 0; i < nums.length; i++) {
			pq.add(nums[i]);
			if (pq.size() > k)
				pq.remove();
		}
		LinkedList<String> res = new LinkedList<>();
		while (!pq.isEmpty()) {
			res.addFirst(pq.poll());
		}
		return String.join("", res);
	}
    
    
}