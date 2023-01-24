package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];
        int n = nums.length;
        int[] dp = new int[n - k + 1];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < k; i++) {
            pq.offer(nums[i]);
        }
        for (int i = 0; i < n - k + 1; i++) {
            dp[i] = pq.peek();
            pq.remove(nums[i]);
            if (i + k < n) {
                pq.offer(nums[i + k]);
            }
        }
        return dp;
    }
}

}