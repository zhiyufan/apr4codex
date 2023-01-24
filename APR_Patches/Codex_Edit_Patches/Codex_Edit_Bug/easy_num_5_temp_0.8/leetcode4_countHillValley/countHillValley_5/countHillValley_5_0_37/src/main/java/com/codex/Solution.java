package com.codex;

import java.util.*;

public class Solution {
    private static int findPeakIndex(int[] nums, int low, int high) {
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static int findPeakElement(int[] nums) {

        int index = findPeakIndex(nums, 0, nums.length - 1);
        return index;

    }

    public static int findPeakElement2(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid1 = (low + high) / 2;
            int mid2 = mid1 + 1;

            if (nums[mid1] < nums[mid2]) {
                low = mid2;
            } else {
                high = mid1;
            }
        }
        
        return low;
    }

    
}