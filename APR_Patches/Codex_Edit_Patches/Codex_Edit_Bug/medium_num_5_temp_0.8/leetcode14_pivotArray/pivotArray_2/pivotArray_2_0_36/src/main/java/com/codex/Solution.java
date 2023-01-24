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
/*
	In [8]: pivotArray([9,12,3,5,14,10,10], 10) Out[8]: [10, 10, 9, 3, 5, 14, 12]
	
	In [9]: pivotArray([9,12,3,5,14,10,10], 10) Out[9]: [9, 5, 3, 10, 10, 14, 12]
*/


    
}