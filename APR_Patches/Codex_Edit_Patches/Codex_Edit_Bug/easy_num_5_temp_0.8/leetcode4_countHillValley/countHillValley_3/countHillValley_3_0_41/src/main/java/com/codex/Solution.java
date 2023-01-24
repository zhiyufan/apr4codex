package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int result = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if ((nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) ||
                    (nums[i - 1] > nums[i] && nums[i] < nums[i + 1])) {
                result++;
            }
        }
        int max = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                stack.push(max);
            } else {
                stack.push(max);
            }
        }
        if (stack.size() > 1) {
            int top = stack.pop();
            int cur = stack.peek();
            while (cur > top) {
                cur = stack.pop();
            }
            if (stack.size() > 1 || stack.pop() != top || !stack.isEmpty()) {
                return -1;
            }
        }
        return result;
    }
}