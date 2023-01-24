package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int i = 0, j = nums.length-1, temp;

        while (i <= j) {
            if (nums[i] < pivot) {
                i++;
            } else if (nums[j] > pivot) {
                j--;
            } else {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }

		int k = nums.length - 1;
		for (int l = i; l < k; l++) {
			temp = nums[l];
			nums[l] = nums[k];
			nums[k] = temp;
			k--;
		}

        return nums;
    }


    
    
}