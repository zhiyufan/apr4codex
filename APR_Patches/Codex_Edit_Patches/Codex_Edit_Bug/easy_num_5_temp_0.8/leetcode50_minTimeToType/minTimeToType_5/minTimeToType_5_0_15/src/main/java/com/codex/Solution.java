package com.codex;

import java.util.*;

public class Solution {
    public static int maxProduct(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int max = nums[0], imax = nums[0], imin = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < 0) {
				int temp = imax;
				imax = imin;
				imin = temp;
			}
			imax = Math.max(nums[i], i * imax);
			imin = Math.min(nums[i], i * imin);
			max = Math.max(max, imax);
		}
		return max;
	}

    

    
}