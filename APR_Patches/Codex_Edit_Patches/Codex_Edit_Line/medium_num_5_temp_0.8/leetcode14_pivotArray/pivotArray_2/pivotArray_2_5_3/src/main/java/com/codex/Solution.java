package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        if (nums == null || nums.length == 0) return nums;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] < pivot) {
                left++;
            } else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
            }
        }
        return nums;
    }








        int i = 0, j = nums.length-1;
        while (i <= j) {
            if (nums[i] < pivot) {
                i++;
            } else if (nums[j] > pivot) {
                j--;
            } else {
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