package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        // Write your solution here
        int i = 0, j = nums.length - 1;
        
        while (i <= j) {

            // find the first number that is less than pivot
            while (i <= j && nums[i] < pivot) {
                i ++;
            }

            // find the last number that is greater than pivot
            while (i <= j && nums[j] > pivot) {
                j --;
            }

            if (i <= j) {
                int temp = nums[i];
                nums[i ++] = nums[j];
                nums[j --] = temp;
            }
        }
        return nums;
    }

    
}