package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            while (i <= j && nums[i] < pivot) {
                i++;
            }
            while (i <= j && nums[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        return nums;
    }

    int[] nums = {2, 1, 5, 4, 3};

    public static int[] reverseArray(int[] nums) {

		if (nums.length == 1) {
			return nums;
		}

		for (int i = 0; i < nums.length / 2; i++) {
			int temp = nums[i];
			nums[i] = nums[nums.length - i - 1];
			nums[nums.length - i - 1] = temp;
		}

		return nums;
	}

	// another method

	public static int[] reverseArrayMethod2(int[] nums) {
		int left = 0, right = nums.length - 1;

		while (left < right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;

			left++;
			right--;
		}
		return nums;
	}
}