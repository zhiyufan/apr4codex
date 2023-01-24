package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int i = -1, j = 0;
        while (i <= j) {
            while (j < nums.length && nums[j] < pivot) {
                j++;
                i++;
            }
            if (j >= nums.length) {
                return nums;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
        return nums;
    }

    
}