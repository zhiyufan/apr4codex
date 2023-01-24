package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        if (k > nums.length) {
            return "";
        }

        PriorityQueue<String> pq = new PriorityQueue<>(k, (a, b) -> (b + a).compareTo(a + b));
        for (String s : nums) {
            pq.offer(s);
            if (pq.size() > k) { // 1,2,3 -> 123, 12, 13
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

    
}