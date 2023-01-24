package com.codex;

import java.util.*;

public class Solution {
    
    public static void pivotArray(int[] nums, int pivot) {
        int less = 0, greater = nums.length - 1;
        while (less <= greater) {
            if (nums[less] < pivot) {
                less++;
            } else if (nums[less] > pivot) {
                swap(nums, less, greater--);
            } else {
                swap(nums, less++, greater--);
            }
        }
        while (less <= greater) {
            result[less++] = pivot;
        }
        return result;
    }

    
}