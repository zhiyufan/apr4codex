package com.codex;

import java.util.*;

public class Solution {
public static int[] maxSubsequence(int[] nums, int k) {
	
	if (k == 0) {
		return new int[0];
	}

	int[] res = new int[k];
	int sum = 0;
	for (int i = 0; i < k; i++) {
		res[i] = nums[i];
		sum += nums[i];
	}
	int maxSum = sum;
	if (k < nums.length) {
		for (int i = k; i < nums.length; i++) {
			sum -= nums[i-k];
			sum += nums[i];
			if (sum > maxSum) {
				maxSum = sum;
				for (int j = i-k+1; j <= i; j++) {
					res[j-i+k-1] = nums[j];
				}
			}
		}
	}
	return res;
}




public static int[] maxSubsequence(int[] nums, int k) {
	int[] sequence = new int[k];
	int max = Integer.MIN_VALUE;
	int[] res = new int[k];
	if (k == 0) {
		return new int[0];
	}
	for (int i = 0; i < nums.length-k+1; i++) {

        int[] res = new int[k];
        int sum = 0;
		for (int j = i; j < k+i; j++) {
			sequence[j-i] = nums[j];
			sum += nums[j];
		}
		if (sum > max) {
			max = sum;
			res = sequence;
		}
    }
}
}