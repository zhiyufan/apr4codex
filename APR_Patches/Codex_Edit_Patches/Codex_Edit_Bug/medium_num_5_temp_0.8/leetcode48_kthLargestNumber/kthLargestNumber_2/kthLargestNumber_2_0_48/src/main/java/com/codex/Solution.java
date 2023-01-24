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
    public static int minSubArrayLen(int s, int[] nums) {
        int len = 0;
        int start = 0;
        int end = 0;
        int curSum = 0;
        while (end < nums.length) {
            while (end < nums.length && curSum < s) {
                curSum += nums[end++];
            }
            while (start < end && curSum >= s) {
                int curLen = end - start;
                if (len == 0 || curLen < len) {
                    len = curLen;
                }
                curSum -= nums[start++];
            }
        }
        return len;
    }
    

    
}