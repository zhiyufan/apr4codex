package com.codex;

import java.util.*;

public class Solution {
public static int[] pivotArray(int[] nums, int pivot) {
        
        int n = nums.length;
        int right = n - 1, left = 0;
        while (left <= right) {
            if (left <= right) {
                if (nums[left] < pivot) {
                    left++;
                } else if (nums[right] > pivot) {
                    right--;
                } else {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                    right--;
                }
            }
        }
        return nums;
    }

    
}