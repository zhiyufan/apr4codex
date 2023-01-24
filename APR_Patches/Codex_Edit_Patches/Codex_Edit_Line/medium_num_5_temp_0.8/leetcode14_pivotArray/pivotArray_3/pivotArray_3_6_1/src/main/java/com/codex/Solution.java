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
            //swap
        }
        return nums;
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    
}