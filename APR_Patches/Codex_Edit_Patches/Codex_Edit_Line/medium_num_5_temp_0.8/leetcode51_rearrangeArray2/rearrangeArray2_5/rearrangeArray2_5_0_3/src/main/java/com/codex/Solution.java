package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        
        Arrays.sort(nums);
        int[] res = new int[nums.length]; // this is a new array
        int left = 0, right = nums.length - 1; // this is left and right pointer
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                res[i] = nums[right];
                right--;
            } else {
                res[i] = nums[left];
                left++;
            }
        }
        return res;
    }

    
}