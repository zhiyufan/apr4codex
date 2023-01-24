package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int smaller = 0, equal = 0, greater = nums.length;
        while (equal < greater) {
            if (nums[equal] < pivot) {
                swap(nums, smaller++, equal++);
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
        int temp = nums[i]; // save the first value in a temp
        nums[i] = nums[j]; // copy the value of the second into the first
        nums[j] = temp; // copy the value of the temp into the second
    }

    
}