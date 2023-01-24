package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        
        int left = nums.length / 2;
        int right = nums.length - 1;
        int left_start = 0;
        while (left >= 0 && right > left) {
            res[left_start++] = nums[left--];
            res[left_start++] = nums[right--];
        }
        return res;
    }

    
}