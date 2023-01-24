package com.codex;

import java.util.*;

public class Solution {
    public static int maxSubArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (sum > max) {
				max = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		return max;
	}
		int max = Integer.MIN_VALUE;
		int sum = 0;
    
}