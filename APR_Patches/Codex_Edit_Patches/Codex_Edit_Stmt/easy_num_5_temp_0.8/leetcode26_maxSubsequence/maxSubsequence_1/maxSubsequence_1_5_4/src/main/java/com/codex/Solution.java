package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        

            // 这一步是让stack中的数字保持递减顺序，保证当前最大的数字在栈顶
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && stack.size() + nums.length - i > k && nums[i] < stack.peek()) {
                stack.pop();
            }
            if (stack.size() < k) { // 当栈中的元素小于k的时候，才继续入栈
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