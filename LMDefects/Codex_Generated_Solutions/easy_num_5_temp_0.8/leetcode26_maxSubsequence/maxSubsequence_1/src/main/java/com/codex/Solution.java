package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        /** You are given an integer array nums and an integer k. You want to find a subsequence of nums of length k that has the largest sum.
         * Return any such subsequence as an integer array of length k.
         * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
         */

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
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