package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int[] result = new int[nums.length];
        int equal = 0;
        int greater = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                result[equal++] = nums[i];
            } else if (nums[i] > pivot) {
                result[greater--] = nums[i];
            }
        }
        while (equal <= greater) {
            result[equal++] = pivot;
        }
        return result;
    }

    
}