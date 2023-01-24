package com.codex;

import java.util.*;

public class Solution {

    public static int[] pivotArray(int[] nums, int pivot) {
		// This is a wrong solution
		int[] ans = new int[nums.length];
		int j = 0;
		for (int i = 0; i < ans.length; i++) {
			if (nums[i] < pivot) {
				ans[j++] = nums[i];
			}
		}
		for (int i = 0; i < ans.length; i++) {
			if (nums[i] == pivot) {
				ans[j++] = nums[i];
			}
		}
		for (int i = 0; i < ans.length; i++) {
			if (nums[i] > pivot) {
				ans[j++] = nums[i];
			}
		}
		return ans;
	}
    }
}