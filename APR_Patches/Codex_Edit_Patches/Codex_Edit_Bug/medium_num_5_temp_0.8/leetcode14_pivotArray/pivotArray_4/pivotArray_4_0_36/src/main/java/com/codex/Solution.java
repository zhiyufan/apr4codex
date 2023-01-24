package com.codex;

import java.util.*;

public class Solution {
 public static int[] pivotArray(int[] nums, int pivot) {
        
        int[] result = new int[nums.length];
        int less = 0;
        int greater = 0;
        int pivotCount = 0;
        for (int i = 0; i < nums.length; i++) {}
        if (nums[i] < pivot) {
                result[less++] = nums[i];}
            else if (nums[i] > pivot) {
                result[result.length - greater - 1] = nums[i];
                greater++;
            } else {
                pivotCount++;
            }
        }
        while (less <= greater) {
            result[less++] = pivot;
        }
        return result;
    }

    
}