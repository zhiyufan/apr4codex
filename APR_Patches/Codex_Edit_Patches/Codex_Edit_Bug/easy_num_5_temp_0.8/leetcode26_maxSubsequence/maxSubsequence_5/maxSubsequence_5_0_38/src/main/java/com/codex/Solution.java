package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        
        if (nums == null || nums.length == 0 || k <= 0) return new int[]{};
        int n = nums.length;
        if (k == n) return nums;

        //priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) pq.add(nums[i]);
        for (int i = k; i < n; i++) if (nums[i] > pq.peek()) pq.poll(); pq.add(nums[i]);
        
        int[] res = new int[k];
        for (int i = 0; i < k; i++) res[i] = pq.poll();
        
        return res;
    }

    
}