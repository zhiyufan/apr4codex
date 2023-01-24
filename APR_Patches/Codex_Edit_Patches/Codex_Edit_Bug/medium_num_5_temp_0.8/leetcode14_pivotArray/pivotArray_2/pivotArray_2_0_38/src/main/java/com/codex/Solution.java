package com.codex;

import java.util.*;

public class Solution {
public class SortArrayAroundPivot {
    
    public static void main(String[] args) {
        int[] nums = {10, 8, 2, 4, 7, 12, 6};
        int pivot = 6;
        
        System.out.println("nums: " + Arrays.toString(nums));
        int[] result = pivotArray(nums, 6);
        System.out.println("result: " + Arrays.toString(result));
    }


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
        return nums;
    }

}
}