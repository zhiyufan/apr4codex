package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
		int max = nums[0], curr = nums[0];
		for (int i = 1; i < nums.length; i++) {
			curr = Math.max(nums[i], curr+nums[i]);
			max = Math.max(max, curr);
		}
		return max;
    }
}
}