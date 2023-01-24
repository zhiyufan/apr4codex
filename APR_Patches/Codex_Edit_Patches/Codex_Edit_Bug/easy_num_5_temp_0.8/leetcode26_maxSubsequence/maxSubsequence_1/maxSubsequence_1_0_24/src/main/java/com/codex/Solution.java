package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public List<Integer> maxSubsequence(int[] nums, int k) {
        

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && stack.size() + nums.length - i > k && nums[i] < stack.peek()) {
                stack.pop();
            }
            if (stack.size() < k) {
                stack.push(nums[i]);
            }
        }
        
        List<Integer> ret = new ArrayList<>();
        for (int i = k - 1; i >= 0; i--) {
            ret.add(stack.pop());
        }
        return ret;
    }


}
}