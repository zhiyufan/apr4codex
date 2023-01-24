package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] exchange(int[] nums) {
        if (nums == null || nums.length == 0)
            return nums;
        
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        int left = 0, right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                res[i] = nums[left];
                left++;
            } else {
                res[i] = nums[right];
                right--;
            }
        }
        return res;
    }

    
}