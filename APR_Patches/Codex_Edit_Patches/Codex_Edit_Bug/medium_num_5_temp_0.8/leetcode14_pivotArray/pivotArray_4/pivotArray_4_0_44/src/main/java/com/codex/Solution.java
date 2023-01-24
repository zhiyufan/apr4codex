package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int[] result = new int[nums.length];
        int less = -1;
        int greater = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                result[++less] = nums[i];
            } else if (nums[i] > pivot) {
                result[--greater] = nums[i];
            }
        }
        for (int i = 0; i <= less; i++) result[i] = pivot;

        return result;
    }

    
}