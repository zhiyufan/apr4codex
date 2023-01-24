package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int nowmin = nums[0];
        int nowmax = nums[nums.length - 1];
        int ans = 0;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nowmin) {
                left[i] = 1;
            }
            nowmin = Math.min(nums[i], nowmin);
            if (nums[nums.length - 1 - i] < nowmax) {
                right[nums.length - 1 - i] = nums[nums.length - 1 - i];
            }
            nowmax = Math.max(nums[nums.length - 1 - i], nowmax);
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (left[i] == 1 && right[i] == 1) {
                ans += (nums[i] - left[i]);
            } else if (left[i] == 1 || right[i] == 1) {
                ans += (nums[i] - Math.min(nums[i], Math.max(left[i], right[i])));
            }
        }
        int sum = 0;
        for (int i = 1; i < res.length - 1; i++) {
            sum += res[i];
        }
        return sum;
    }

    
}