package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int left = 0, right = nums.length;
        while (left < right) {
            if (nums[left] < pivot) {
                ++left++;
            }
            else if (nums[equal] == pivot) {
                ++equal;
            }
            else {
                swap(nums, equal, --greater);
            }
        }
        return nums;
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    
}