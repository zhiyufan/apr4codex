package com.codex;

import java.util.*;

public class Solution {
// Write a function that returns a new array with the elements in order, but with the pivot element flipped (in other words, first element becomes last element, second element becomes second to last element, etc.).

// Note that this function should not modify the original array, but should return a new array instead.

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
                j++;
            }
        }
        return nums;
    }

    
}