package com.codex;

import java.util.*;

public class Solution {
public class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) {
        // Sort array and scan for a + b + c = 0
		// Make sure a < b < c
		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			// If current number is larger than 0 or it duplicates with previous number
			// there is no need to continue
			if (nums[i] > 0 || (i > 0 && nums[i] == nums[i - 1])) continue;
			int a = nums[i];
			// Two pointer starting from the next element and the last element
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				int b = nums[j];
				int c = nums[k];
				if (a + b + c == 0) {
					// Found a valid triplet
					List<Integer> list = new ArrayList<>();
					list.add(a);
					list.add(b);
					list.add(c);
					result.add(list);
					j++;
					k--;
					// Skip duplicates of b and c
					while (j < k && nums[j] == nums[j - 1]) j++;
					while (j < k && nums[k] == nums[k + 1]) k--;
				}
				else if (a + b + c < 0) {
					// Move b to the right
					j++;
					while (j < k && nums[j] == nums[j - 1]) j++;
				}
				else {
					// Move c to the left
					k--;
					while (j < k && nums[k] == nums[k + 1]) k--;
				}
			}
		}
		return result;
	}
}
}