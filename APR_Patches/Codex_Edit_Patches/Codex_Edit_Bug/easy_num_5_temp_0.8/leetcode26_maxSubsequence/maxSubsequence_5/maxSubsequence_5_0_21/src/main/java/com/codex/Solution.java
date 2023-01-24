package com.codex;

import java.util.*;

public class Solution {
import java.util.PriorityQueue;

    public static int[] maxSubsequence(int[] nums, int k) {

        if (nums == null || nums.length == 0) return new int[]{};
        int n = nums.length;
        if (k <= 0) return new int[]{};
        if (k > n) return nums;
        if (k == n) return nums;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] res = new int[k];
        for (int i = 0; i < n; i++) {
            pq.add(nums[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        Iterator<Integer> it = pq.descendingIterator();
        for (int i = 0; i < k; i++) {
            res[i] = it.next();
        }
        return res;
    }
}