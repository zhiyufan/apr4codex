package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int i = 0, j = nums.length-1;
        while (i <= j) {
            if (nums[i] < pivot) {
                i++;
            } else if (nums[j] > pivot) {
                j--;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        return nums;
    }
    public static int[] pivotArray(int[] nums, int pivot) {
        int low = 0;
        int high = nums.length - 1;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                result[low++] = nums[i];
            } else if (nums[i] > pivot) {
                result[high--] = nums[i];
            }
        }
        return result;

    }


    
}