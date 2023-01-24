package com.codex;

import java.util.*;

public class Solution {
    // Move all the elements less than pivot to the left of pivot
    // Move all the elements greater than pivot to the right of pivot
    // Keep the elements equal to pivot in the middle
    // Return the index of the first element greater than pivot
    public static int pivotArray(int[] nums, int pivot) {
        int i = 0, j = nums.length-1;
        while (i <= j) {
            if (nums[i] < pivot) {
                i++;
            } else if (nums[j] >= pivot) {
                j--;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }
}