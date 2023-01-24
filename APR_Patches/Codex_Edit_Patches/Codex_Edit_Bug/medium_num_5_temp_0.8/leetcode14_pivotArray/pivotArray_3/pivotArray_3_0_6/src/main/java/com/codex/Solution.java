package com.codex;

import java.util.*;

public class Solution {
//The code below failed in the Leetcode LC.
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int smaller = 0, equal = 0, greater = nums.length;
        while (equal < greater) {
            if (nums[equal] < pivot) {
                swap(nums, smaller++, equal++);
            }
            else if (nums[equal] == pivot) {
                ++equal;
            }
            else {
                swap(nums, equal, --greater);
            }
        }
        return nums;
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

//The code below is the correct one which helped me pass the Leetcode LC.    

public static int[] partitionArray(int[] nums, int pivot) {
        
        int smaller = 0, equal = 0, greater = nums.length - 1;
        while (equal <= greater) {
            if (nums[equal] < pivot) {
                swap(nums, smaller++, equal++);
            }
            else if (nums[equal] == pivot) {
                equal++;
            }
            else {
                swap(nums, equal, greater--);
            }
        }
        return nums;
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


//The code below did not return a pivot, because the question requires to return pivot.

public static int[] pivotArray(int[] nums, int pivot) {
        
        int smaller = 0, equal = 0, greater = nums.length - 1;
        while (equal <= greater) {
            if (nums[equal] < pivot) {
                swap(nums, smaller++, equal++);
            }
            else if (nums[equal] == pivot) {
                equal++;
            }
            else {
                swap(nums, equal, greater--);
            }
        }
        return nums;
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}