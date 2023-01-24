package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public ArrayList<int[]> isContinuous(int[] nums) {
        int numberOfZero = 0;
        int numberOfGap = 0;
        int length = nums.length;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < length; i++) {
            if (nums[i] == 0) {
                numberOfZero++;
                stack.pop();
            }
        }

        Arrays.sort(nums);
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] == nums[i + 1] && nums[i] != 0) {
                return false;
            }
        }

        for (int i = numberOfZero; i < length - 1; i++) {
            numberOfGap += nums[i + 1] - nums[i] - 1;
        }
        return ret;
    }

    
}