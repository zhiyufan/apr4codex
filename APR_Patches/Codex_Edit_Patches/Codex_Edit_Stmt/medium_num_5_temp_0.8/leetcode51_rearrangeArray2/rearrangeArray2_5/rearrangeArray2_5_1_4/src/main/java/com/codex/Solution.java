package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        int left = 0, right = nums.length - 1, count = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                if (--count > 0) {
                    res[i] = nums[right--];
                } else {
                    break;
                }
            } else {
                if (--count > 0) {
                    res[i] = nums[left++];
                } else {
                    break;
                }
            }
        }
        return res;
    }

    
}