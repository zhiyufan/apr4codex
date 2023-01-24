package com.codex;

import java.util.*;

public class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            if (nums == null || nums.length == 0 || k <= 0) return new int[0];
            int n = nums.length;
            int[] res = new int[n-k+1];
            int left = 0, right = 0;
            Deque<Integer> q = new ArrayDeque<>();
            for (int i = 0; i < n; i++) {
                if (i >= k && q.peekFirst() == nums[i-k]) {
                    q.removeFirst();
                }
                while (!q.isEmpty() && q.peekLast() < nums[i]) {
                    q.removeLast();
                }
                q.addLast(nums[i]);
                if (i >= k-1) res[left++] = q.peekFirst();
            }
            return res;
        }
    
}