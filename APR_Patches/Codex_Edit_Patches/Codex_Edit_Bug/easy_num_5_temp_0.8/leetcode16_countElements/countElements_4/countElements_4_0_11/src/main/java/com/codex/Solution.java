package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);

        int count = 0;
        int i = 0;
        int j = 1;
        while (i < nums.length) {
            while (j < nums.length && nums[i] == nums[j]) {
                j++;
            }
            if (j < nums.length && nums[i] == nums[j] - 1) {
                count += j - i;
            }
            i = j;
            j++;
        }
        return count;
    }
    

    public static int countElements(int[] nums) {
        
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);

        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            int j = i + 1;
            while (j < nums.length) {
                if (nums[j] - nums[i] == 1) {
                    count++;
                    break;
                } else if (nums[j] - nums[i] > 1) {
                    break;
                }
                j++;
            }
        }
        return count;

    }

    
}