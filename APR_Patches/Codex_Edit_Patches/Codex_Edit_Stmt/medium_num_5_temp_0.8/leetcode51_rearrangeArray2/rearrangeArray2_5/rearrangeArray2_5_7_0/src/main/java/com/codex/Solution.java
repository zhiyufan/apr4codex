package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        int left = nums.length / 2 - 1, right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (left >= 0) {
                res[i] = nums[left--];
                res[++i] = nums[right--];
            }
        }
        return res;
    }

    
}