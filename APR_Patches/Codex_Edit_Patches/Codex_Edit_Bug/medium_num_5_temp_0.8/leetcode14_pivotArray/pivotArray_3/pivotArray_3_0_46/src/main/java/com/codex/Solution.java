package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        int lower = 0;
        int upper = nums.length - 1;

        for (int i = 0; i <= upper; i++) {

            if (nums[i] < pivot) {
                swap(nums, i, lower);
                lower++;
            }
            else if (nums[i] > pivot) {
                swap(nums, i, upper);
                upper--;
                i--;
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