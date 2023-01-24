package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            while (i <= j && nums[i] < pivot) {
                i++;
            }
            while (i <= j && nums[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = nums[i]; //save the place of i
                nums[i] = nums[j]; // the place of i is equals with the place of j
                nums[j] = temp; // the place of j is equals with the place of i in the first time
                i++;
                j--;
            }
        }
        return nums;
    }

    
}