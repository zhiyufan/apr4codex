package com.codex;

import java.util.*;

public class Solution {
/**
 * Problem: Given a pivot integer and an array of integers, 
 *          reorder the array so that all elements less than 
 *          the pivot appear first, followed by elements equal 
 *          to the pivot, followed by elements greater than the pivot.
 * 
 * Solution: 
 *          Using 3 pointers: smaller, equal, greater
 *          smaller <= equal < greater
 *          smaller keeps track of values that are smaller than the pivot
 *          equal keeps track of values that are equal to the pivot
 *          greater keeps track of values that are greater than the pivot
 *          swap(nums, equal, --greater); compares the "greater" pointer to the "equal" pointer
 * 
 *          NOTE: smaller++ is the same as doing smaller = smaller + 1
 */

    public static int[] pivotArray(int[] nums, int pivot) {
        
        int smaller = 0, equal = 0, greater = nums.length;
        while (equal < greater) {
            if (nums[equal] < pivot) {
                swap(nums, smaller++, equal++); // smaller++
            }
            else if (nums[equal] == pivot) {
                ++equal; // equal = equal + 1
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

    
}