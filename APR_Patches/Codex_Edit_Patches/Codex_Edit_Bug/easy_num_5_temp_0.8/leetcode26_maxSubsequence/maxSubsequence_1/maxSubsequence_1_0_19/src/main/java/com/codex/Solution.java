package com.codex;

import java.util.*;

public class Solution {
to reproduce bug:

        //testcase 1
        int[] nums = {4,4,4,4,4,4,4,4,4,4,4,4};
        int k = 5;
        int[] result = maxSubsequence(nums,k);

        //testcase 2
        int[] nums = {1,2,2,5,7,5,5,5,5,5};
        int k = 5;
        int[] result = maxSubsequence(nums,k);


    public static int[] maxSubsequence(int[] nums, int k) {
        

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