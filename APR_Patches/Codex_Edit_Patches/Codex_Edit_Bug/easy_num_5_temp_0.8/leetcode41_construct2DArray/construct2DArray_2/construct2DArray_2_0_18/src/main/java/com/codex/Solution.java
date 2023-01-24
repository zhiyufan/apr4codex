package com.codex;

import java.util.*;

public class Solution {
    public void nextPermutation(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) {
			return;
		}
        int p = 0;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				p = i;
				break;
			}
		}
		int q = 0;
		for (int i = nums.length - 1; i > p; i--) {
			if (nums[i] > nums[p]) {
				q = i;
				break;
			}
		}

		if (p == 0 && q == 0) {
			reverse(nums, 0, nums.length - 1);
			return;
		}

		swap(nums, p, q);
		if (p < nums.length - 1) {
			reverse(nums, p + 1, nums.length - 1);
		}
		return;
    }


	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private void reverse(int[] num, int start, int end) {
		for (int i = start, j = end; i < j; i++, j--) {
			swap(num, i, j);
		}
	}
}