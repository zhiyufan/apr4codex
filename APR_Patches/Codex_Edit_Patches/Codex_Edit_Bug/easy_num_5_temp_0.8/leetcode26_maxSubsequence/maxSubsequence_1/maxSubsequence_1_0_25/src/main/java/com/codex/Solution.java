package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
		Stack<Integer> stack = new Stack<>();
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			while (!stack.isEmpty() && nums[i] < stack.peek()) {
				stack.pop();
			}
			if (index < k) {
				stack.push(nums[i]);
				index++;
			}
		}
		int[] ret = new int[Math.min(k, nums.length)];
		for (int i = ret.length - 1; i >=0; i--) {
			ret[i] = stack.pop();
		}
		return ret;
        

    }

    
}