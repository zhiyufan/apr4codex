package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> maxScoreIndices(int[] nums) {

		List<Integer> result = new ArrayList<>();
		int maxScore = 0;
		for (int i = 0; i < nums.length; i++) {
            int zeroLeft = getNumberOfZeros(nums, 0, i - 1);
            int oneRight = getNumberOfOnes(nums, i, nums.length - 1);
			if (zeroLeft + oneRight > maxScore) {
				maxScore = zeroLeft + oneRight;
				result.clear();
				result.add(i);
			} else if (zeroLeft + oneRight == maxScore) {
				result.add(i);
			}
		}

		return result;
	}

	private static int getNumberOfOnes(int[] nums, int left, int right) {
		int result = 0;
		if (right >= nums.length) {
			right = nums.length - 1;
		}
		for (int i = left; i <= right; i++) {
			if (nums[i] == 1) {
				result++;
			}
		}
		return result;
	}

	private static int getNumberOfZeros(int[] nums, int left, int right) {
		int result = 0;
		if (right >= nums.length) {
			right = nums.length - 1;
		}
		for (int i = left; i <= right; i++) {
			if (nums[i] == 0) {
				result++;
			}
		}
		return result;
	}

    
}