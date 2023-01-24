package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int i = 0, j = nums.length - 1, k = pivot;
        while (i <= j) {
            while (i <= j && nums[i] < k) {
                i++;
            }
            while (i <= j && nums[j] > k) {
                j--;
            }
            if (i <= j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        return nums;
    }

    
}