package com.codex;

import java.util.*;

public class Solution {
public static int countHillValley(int[] nums) {
        
	if (nums == null || nums.length < 3) return 0;
	int result = 0;
	int last = 0;
	for (int i = 1; i < nums.length - 1; i++) {
		int first = Integer.compare(nums[i-1], nums[i]);
		int second = Integer.compare(nums[i], nums[i+1]);
		if (data != last && first != second) {
			result++;
		}
		last = first;
	}
	return result;
}
}