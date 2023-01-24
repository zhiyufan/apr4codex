package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) 
    {
        

        Stack<Integer> stack = new Stack<>(); // A stack that stores k number
        for (int i = 0; i < nums.length; i++) 
        {
            // To avoid the last numbers are the same, and the larger number will be put into the stack.
            while (!stack.isEmpty() && stack.size() + nums.length - i > k && 
                nums[i] < stack.peek()) 
            {
                stack.pop();
            }
            // Add the number into the stack

            if (stack.size() < k) 
            {
                stack.push(nums[i]);
            }
        }
        int[] ret = new int[k];

        for (int i = k - 1; i >= 0; i--) 
        {
            ret[i] = stack.pop();
        }
        return ret;
    }

    
}