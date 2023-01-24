package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivotPoint) {
        
        int i = 0, j = nums.length-1;
        while (i <= j) {
            if (nums[i] < pivotPoint) {
                i++;
            } else if (nums[j] > pivotPoint) {
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

    
}