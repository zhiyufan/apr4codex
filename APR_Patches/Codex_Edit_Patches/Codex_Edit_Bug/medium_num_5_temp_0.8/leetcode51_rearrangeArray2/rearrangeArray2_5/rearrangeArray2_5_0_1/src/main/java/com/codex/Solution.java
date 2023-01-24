package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        
        Arrays.sort(nums);
        int len = nums.length / 2 + 1;
        int[] res = new int[len];
        int left = 0, right = nums.length - 1;
        for (int i = 0; i < len; i++) {
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