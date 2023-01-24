package com.codex;

import java.util.*;

public class Solution {
    //Move all elements smaller than pivot to the left side of the pivot, and all elements larger than the pivot to the right side of the pivot
    public static int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int right = n - 1, left = 0;
        while (left <= right) {
            while (left <= right && nums[left] < pivot) {
                left++;
            }
            while (left <= right && nums[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = nums[left];//Pay attention: should exchange nums[left] and nums[right]
                nums[left] = nums[right];//instead of: nums[left] = nums[right]
                nums[right] = temp;//and: nums[right] = nums[left]
                left++;
                right--;
            }
        }
        return nums;
    }
}