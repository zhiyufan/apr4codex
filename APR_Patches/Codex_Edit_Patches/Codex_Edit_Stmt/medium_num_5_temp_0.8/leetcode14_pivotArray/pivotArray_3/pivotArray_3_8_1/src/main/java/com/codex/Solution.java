package com.codex;

import java.util.*;

public class Solution {
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




    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void sortByPivot(int[] nums, int pivot) {
        
        int smaller = 0, greater = nums.length;
        int equal = 0;
        while (equal < greater) {
            if (nums[equal] < pivot) {
                swap(nums, smaller++, equal++);
            }
            else if (nums[equal] == pivot) {
                ++equal;
            }
            else {
                swap(nums, equal, greater - 1);
                --greater;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[] {8, 2, 4, 2, 7, 8, 1, 4, 8, 3, 3, 8};
        sortByPivot(nums, 2);
        System.out.println(Arrays.toString(nums));
    }
}

    
}