package com.codex;

import java.util.*;

public class Solution {
public static int sumOfBeauties(int[] nums) {
	
	int sum = 0;
	
	for (int i = 1; i < nums.length - 1; i++) {
		int curr = nums[i];
		
		boolean condition1 = true;
		boolean condition2 = true;
		for (int j = 0; j < i; j++) {
			if (nums[j] > curr) {
				condition1 = false;
				break;
			}
		}
		for (int k = i + 1; k < nums.length; k++) {
			if (nums[k] < curr) {
				condition1 = false;
				break;
			}
		}
		
		if (nums[i - 1] > curr || nums[i + 1] < curr) {
			condition2 = false;
		}
		
		if (condition1) {
			sum += 2;
		} else if (condition2) {
			sum += 1;
		}
	}
	
	return sum;
	
}
}