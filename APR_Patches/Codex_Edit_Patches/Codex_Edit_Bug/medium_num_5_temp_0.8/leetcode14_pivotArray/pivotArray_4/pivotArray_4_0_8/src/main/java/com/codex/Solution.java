package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int[] result = new int[nums.length];
        int less = 0;
        int greater = nums.length - 1;
        for (int num : nums) {
            if (num < pivot) {
                result[less++] = num;
            } else if (num > pivot) {
                result[greater--] = num;
            }
        }
        while (less <= greater) {
            result[less++] = pivot;
        }
        return result;
    }

    
}