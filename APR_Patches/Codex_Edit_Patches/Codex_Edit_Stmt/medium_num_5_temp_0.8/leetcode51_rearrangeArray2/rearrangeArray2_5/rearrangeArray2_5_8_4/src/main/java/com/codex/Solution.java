package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left += 2;
            right -= 2;
        }
        return res;
    }

    
}