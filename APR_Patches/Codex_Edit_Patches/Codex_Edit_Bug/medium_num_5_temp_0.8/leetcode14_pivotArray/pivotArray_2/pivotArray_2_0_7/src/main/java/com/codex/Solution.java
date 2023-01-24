package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int left = 0, right = nums.length-1;
        while (left <= right) {
            if (nums[left] < pivot) {
                left++;
            } else if (nums[right] > pivot) {
                right--;
            } else if (nums[left] < pivot && nums[right] > pivot) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }

    
}