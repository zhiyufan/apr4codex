package com.codex;

import java.util.*;

public class Solution {
    public static int minStoneSum(int[] piles, int k) {
        
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums[0];
        for (int num : nums) {
            right += num;
            left = Math.max(left, num);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            for (int num : nums) {
                count += (num - 1) / mid + 1;
            }
            if (count <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }


    
        return left;
    }

    
}