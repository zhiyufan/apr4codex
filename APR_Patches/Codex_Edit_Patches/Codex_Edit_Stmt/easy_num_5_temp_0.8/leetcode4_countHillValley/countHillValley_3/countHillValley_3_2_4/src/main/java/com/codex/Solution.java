package com.codex;

import java.util.*;

public class Solution {
	public static int countHillValley(int[] nums) {
		if (nums == null || nums.length < 3) {
			return 0;
		}
		int result = 0;
		int status = nums[1] - nums[0];
		for (int i = 2; i < nums.length; i++) {
			if (status < 0) {
				if (nums[i] > nums[i - 1]) {
					result++;
					status = 1;
				}
			} else {
				if (nums[i] < nums[i - 1]) {
					result++;
					status = 0;
				}
			}
		}
		return result;
	}
}