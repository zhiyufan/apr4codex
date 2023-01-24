package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> pq = new PriorityQueue<>(k, (a, b) -> (b + a).compareTo(a + b));//priority queue to sort candidate strings by comparing the strings itself
        for (String s : nums) {
            pq.offer(s);
            if (pq.size() > k) {//keep k elements in the queue
                pq.poll();
            }
        }
        List<String> res = new ArrayList<>();//build the result list
        while (!pq.isEmpty()) {
            res.add(pq.poll());
        }
        Collections.reverse(res);//reverse, because the last elements are put into the queue first
        return String.join("", res);
    }

    
}