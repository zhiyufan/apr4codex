package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public String largestNumber(int[] nums) {
        String[] numsstr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsstr[i] = String.valueOf(nums[i]);
        }
        PriorityQueue<String> pq = new PriorityQueue<>(k, (a, b) -> (b + a).compareTo(a + b));
        for (String s : numsstr) {
            pq.offer(s);
            if (pq.size() > nums.length) {
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