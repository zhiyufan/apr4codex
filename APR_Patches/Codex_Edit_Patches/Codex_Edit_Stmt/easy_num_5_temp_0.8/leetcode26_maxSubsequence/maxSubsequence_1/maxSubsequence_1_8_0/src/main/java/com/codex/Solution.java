package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        
        int remain = nums.length - k;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
                remain--;
            while (!stack.isEmpty() && remain > 0 && nums[i] < stack.peek()) {
                stack.pop();
            }
                remain--;
            if (remain > 0) {
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