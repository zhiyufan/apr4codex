package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        int i = 0, j = 0, length = nums.length - 1;
        while (i <= j) {
            while (nums[i] < pivot) {
                i++; 
            }
            while (j <= length  && nums[j] > pivot) {
                j--;
            }
            if (i <= j) { 
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }

    
}