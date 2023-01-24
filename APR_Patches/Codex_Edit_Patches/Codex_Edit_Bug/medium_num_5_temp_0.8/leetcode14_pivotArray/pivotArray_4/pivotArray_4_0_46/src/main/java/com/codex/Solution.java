package com.codex;

import java.util.*;

public class Solution {
    /**
    *   Program to pivot the array
    * 
    *   @param input the array to be pivoted
    *   @param the number to pivot around
    *   @return the pivoted array
    */
    public static int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int less = 0;
        int greater = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                result[less++] = nums[i];
            } else if (nums[i] > pivot) {
                result[greater--] = nums[i];
            }
        }
        while (less <= greater) {
            result[less++] = pivot;
        }
        return result;
    }

    
}