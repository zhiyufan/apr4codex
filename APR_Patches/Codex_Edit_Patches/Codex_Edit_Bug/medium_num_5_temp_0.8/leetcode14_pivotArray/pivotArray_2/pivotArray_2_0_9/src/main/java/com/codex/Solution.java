package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int pivotIndex = -1;
        int smallestIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (pivot == nums[i]) {
                pivotIndex = i;
            }
        }
        return nums;
    }

    
}