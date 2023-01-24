package com.codex;

import java.util.*;

public class Solution {
	
	public static int[] maxSubsequence(int[] nums, int k) {
        
        int[] ret = new int[k];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (stack.size() > 0 && stack.size() + nums.length - i > k && nums[i] < stack.peek()) {
                stack.remove(stack.size() - 1);
            }
            if (stack.size() < k) {
                stack.push(nums[i]);
            }
        }
        int[] ret = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            ret[i] = stack.pop();
        }
        return ret;
    }

    
}