package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int right = n - 1, left = 0;
        while (left <= right) {
            while (left <= right && nums[left] < pivot) {
                left++;
            }
            while (left <= right && nums[right] > pivot) {
                right--;
            }
            if (left <= right) {
                left++;
                right--;
            }
        }
        return nums;
    }

    
}