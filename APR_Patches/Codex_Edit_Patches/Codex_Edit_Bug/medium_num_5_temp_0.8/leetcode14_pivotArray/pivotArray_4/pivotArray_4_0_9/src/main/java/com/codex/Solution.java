package com.codex;

import java.util.*;

public class Solution {
package com.corejava.arrays;

public class ArrayPrograms {

    public static int[] pivotArray(int[] nums, int pivot) {

        int[] result = new int[nums.length];
        int less = 0;
        int greater = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                result[less++] = nums[i];
            } else if (nums[i] > pivot) {
                result[greater--] = nums[i];
            }
        }
        while (less <= greater) {
            result[less++] = pivot;
        }
        return result;
    }

    public static void rotateArray(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return;
        }

        k = k % nums.length;

        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int start = -1;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (start == -1) {
                    start = i;
                }
            } else {
                if (start != -1) {
                    maxCount = Math.max(maxCount, i - start);
                    start = -1;
                }
            }
        }

        if (start != -1) {
            maxCount = Math.max(maxCount, nums.length - start);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        System.out.println(ArrayPrograms.findMaxConsecutiveOnes(nums));
    }
}
}