package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        int left = 0, right = nums.length;
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            if (flag) {
                res[i] = nums[right - 1];
                right--; 
            }
            else {
                res[i] = nums[left]; 
                left++; 
            }
            flag = !flag; 
        }

        return res;
    }
}