package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {


        // when the condition is true, remove the top of the stack until it is false
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && stack.size() + nums.length - i > k && nums[i] < stack.peek()) {
            // if the size of the stack is smaller than k
                stack.pop();
            }
            if (stack.size() < k) {
                stack.push(nums[i]);
            }
        // starting from the end of the stack, add each element to the array
        }
        int[] ret = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            ret[i] = stack.pop();
        }
        return ret;
    }

    
}