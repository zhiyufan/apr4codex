package com.codex;

import java.util.*;

public class Solution {
public static int[] getAverages(int[] nums, int k) {
	int[] averages = new int[nums.length - 2 * k];
	for (int i = 0; i < k; ++i) {
		int sum = nums[i];
		for (int j = i + 1; j < i + k; ++j) {
			sum += nums[j];
		}
		averages[i] = sum / k;
	}
	for (int i = k; i < nums.length - k; ++i) {
		int sum = nums[i];
		for (int j = i + 1; j < i + k; ++j) {
			sum += nums[j];
		}
		averages[i - k] = sum / k;
	}
	return averages;
}
}