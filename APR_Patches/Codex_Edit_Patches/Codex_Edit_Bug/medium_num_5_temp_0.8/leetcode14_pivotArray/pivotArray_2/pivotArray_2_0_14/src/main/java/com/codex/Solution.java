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



    public static void pivoted_on_rightmost_element(int[] nums) {

        int pivot = nums[nums.length-1];
        int j = 0, i = nums.length-2;
        while(i >= 0) {
            if (nums[i] > pivot) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i--;
                j++;
            } else if (nums[i] == pivot) {
                i--;
            } else {
                i--;
            }
        }
    } 

    
}