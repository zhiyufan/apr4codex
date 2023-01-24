package com.codex;

import java.util.*;

public class Solution {
public static int[] getAverages(int[] nums, int k) {
		int[] result = new int[nums.length];
		if (k <= nums.length) {
			int sum = 0;
			for (int i = 0; i < k; i++) {
				sum += nums[i];
			}
			result[k - 1] = sum / k;
			for (int i = 0; i < nums.length - k; i++) {
				sum -= nums[i];
				sum += nums[i + k];
				result[k + i] = sum / k;
			}
		}
		return result;
	}
}