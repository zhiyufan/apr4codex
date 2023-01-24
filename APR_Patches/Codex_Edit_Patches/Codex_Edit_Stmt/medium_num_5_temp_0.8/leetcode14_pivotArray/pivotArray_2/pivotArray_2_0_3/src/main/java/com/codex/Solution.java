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
        int[] temp = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                temp[k] = nums[i];
                k++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                temp[k] = nums[i];
                k++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                temp[k] = nums[i];
                k++;
            }
        }
        nums = temp;
        return nums;
    }

    
}