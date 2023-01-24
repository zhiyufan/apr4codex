package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        int mid = nums.length / 2;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < mid; i++) {
            if (stack.size() < k) {
                stack.push(nums[i]);
            } else {
                if (nums[i] < stack.peek()) {
                    stack.push(nums[i]);
                }
            }
        }
        Stack<Integer> tmp = new Stack<>();
        for (int i = mid; i < nums.length; i++) {
            tmp.push(nums[i]);
        }
        for (int i = nums.length - 1; i >= mid; i--) {
            while (!stack.isEmpty() && stack.size() + nums.length - i > k && nums[i] < stack.peek()) {
                stack.pop();
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