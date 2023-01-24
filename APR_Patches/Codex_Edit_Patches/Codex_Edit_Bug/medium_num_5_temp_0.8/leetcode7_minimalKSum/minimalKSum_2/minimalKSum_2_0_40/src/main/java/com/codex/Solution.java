package com.codex;

import java.util.*;

public class Solution {

public class Solution {
    /**
     * @param nums: a list of integers.
     * @param k: length of window.
     * @return: the sum of the element inside the window at each moving.
     */
    public int[] winSum(int[] nums, int k) {
        // write your code here
        if(nums == null || nums.length == 0) {
            return nums;
        }
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }
        long sum = 0;
        while(!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }

    
}