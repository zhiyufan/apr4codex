package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int smaller = 0, equal = 0, greater = nums.length, pivot;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < nums[0]) {
				swap(nums, i, smaller);
				smaller++;
				equal++;
			} else if (nums[i] == nums[0]) {
				swap(nums, i, equal);
				equal++;
			}
		}
		swap(nums, equal - 1, 0);
		return nums;
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    
}