package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        
        Arrays.sort(nums);
        int[] result = new int[nums.length];
        int left = 0, right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = nums[right];
                right--;
            } else {
                result[i] = nums[left];
                left++;
            }
        }
        return res;
    }

    
}