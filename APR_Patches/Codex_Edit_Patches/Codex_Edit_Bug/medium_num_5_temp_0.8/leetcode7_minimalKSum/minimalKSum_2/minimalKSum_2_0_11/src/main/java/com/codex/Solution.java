package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if (nums[i] > k) {
                sum += k;
            } else {
                sum += nums[i];
                k -= nums[i];
            }
        }
        long sum = 0;
        while(!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }

    
}