package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        if (nums == null || nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);

        // 使用左右指针来统计
        int left = 0;
        int right = 1;
        while(right < nums.length) {
            if (nums[right] == nums[left]) {
                right++;
            } else if (nums[right] ==  nums[left] + 1) {
                count++;
            }
        }
        return count;
    }

    
}