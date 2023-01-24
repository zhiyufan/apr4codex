package com.codex;

import java.util.*;

public class Solution {
package com.algorithms.learning.java;

import java.util.Arrays;

public class PivotArray {

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
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
		int[] nums = {8,5,6,9,3,2,10};
		System.out.println(Arrays.toString(pivotArray(nums, 6)));
	}
}
}