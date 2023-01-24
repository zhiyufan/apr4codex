package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
        }

        Stack<Integer> stack = new Stack<Integer>();
        int currentIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (stack.isEmpty() || dp[i] >= dp[stack.peek()]) {
                stack.push(i);
            }
        }
        while (!stack.isEmpty()) {
            int index = stack.pop();
            if (nums.length - index <= k) {
                currentIndex = index;
                break;
            }
        }
        return Arrays.copyOfRange(nums, end - k + 1, end + 1);
    }

    
}