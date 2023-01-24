package com.codex;

import java.util.*;

public class Solution {
public static int[] maxSubsequence(int[] nums, int k) {
        

    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < nums.length; i++) {
        while (!stack.isEmpty() && stack.size() + nums.length - i > k && nums[i] < stack.peek()) {
            stack.pop();
        }
        if (stack.size() < k) {
            stack.push(nums[i]);
        }
        return ret;
    }

    
}