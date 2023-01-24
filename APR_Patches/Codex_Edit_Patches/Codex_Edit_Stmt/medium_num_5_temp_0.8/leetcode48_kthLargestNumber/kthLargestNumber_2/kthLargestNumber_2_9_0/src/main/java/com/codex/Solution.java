package com.codex;

import java.util.*;

public class Solution {
    // k = 1
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        
        PriorityQueue<String> pq = new PriorityQueue<>(nums.length, (a, b) -> (b + a).compareTo(a + b));
        for (int i : nums) {
            pq.offer(Integer.toString(i));
        }
        List<String> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(pq.poll());
        }
        if ("0".equals(res.get(0))) {
            return "0";
        }
        return String.join("", res);
    }
    // k > 1
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

    
}