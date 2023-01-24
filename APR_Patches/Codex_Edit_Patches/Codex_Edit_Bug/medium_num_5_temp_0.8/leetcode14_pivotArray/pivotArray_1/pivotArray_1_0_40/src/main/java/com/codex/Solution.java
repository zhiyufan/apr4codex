package com.codex;

import java.util.*;

public class Solution {
public class ArrayExercise {
// 
//        public static void main(String[] args) {
//        int[] nums = {1, 5, 4, 6, 4, 5, 6, 7, 9, 4};
//        System.out.println(findDuplicates(nums));
// 
// 
//    }
// 
//    public static int findDuplicates(int[] nums) {
//        if (nums == null || nums.length == 0) {
//            return -1;
//        }
//        HashSet<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            if (!set.add(num)) {
//                return num;
//            }
//        }
//        return -1;
//    }
// 
//    public static int[] mergeSortedArray(int[] nums1, int[] nums2) {
//        if (nums1 == null || nums2 == null) {
//            return null;
//        }
//        int i = 0, j = 0;
//        int[] res = new int[nums1.length + nums2.length];
//        int index = 0;
//        while (i < nums1.length && j < nums2.length) {
//            if (nums1[i] < nums2[j]) {
//                res[index++] = nums1[i++];
//            } else {
//                res[index++] = nums2[j++];
//            }
//        }
//        while (i < nums1.length) {
//            res[index++] = nums1[i++];
//        }
//        while (j < nums2.length) {
//            res[index++] = nums2[j++];
//        }
//        return res;
//    }
// 
//    public static int[] pivotArray(int[] nums, int pivot) {
//        
//        int i = 0, j = nums.length - 1;
//        while (i <= j) {
//            while (i <= j && nums[i] < pivot) {
//                i++;
//            }
//            while (i <= j && nums[j] > pivot) {
//                j--;
//            }
//            if (i <= j) {
//                int temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//                i++;
//                j--;
//            }
//        }
//        return nums;
//    }
// 
//    public static int maxSubArray(int[] nums) {
//        if (nums == null || nums.length == 0) {
//            return -1;
//        }
//        int res = Integer.MIN_VALUE;
//        int sum = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            if (sum > 0) {
//                sum += nums[i];
//            } else {
//                sum = nums[i];
//            }
//            res = Math.max(res, sum);
//        }
//        return res;
//    }
// 
//    public static boolean checkDuplicatesWithinK(int[] nums, int k) {
//        if (nums == null || nums.length == 0) {
//            return false;
//        }
//        HashSet<Integer> set = new HashSet<>();
//        int i = 0;
//        while (i < nums.length) {
//            if (!set.add(nums[i])) {
//                return true;
//            }
//            if (i >= k) {
//                set.remove(nums[i - k]);
//            }
//            i++;
//        }
//        return false;
//    }
// 
//    public static int findKLargest(int[] nums, int k) {
//        if (nums == null || nums.length == 0) {
//            return -1;
//        }
//        return helper(nums, 0, nums.length - 1, k);
//    }
// 
//    private static int helper(int[] nums, int start, int end, int k) {
//        if (start >= end) {
//            return nums[start];
//        }
//        int left = start, right = end;
//        int pivot = nums[(start + end) / 2];
//        while (left <= right) {
//            while (left <= right && nums[left] < pivot) {
//                left++;
//            }
//            while (left <= right && nums[right] > pivot) {
//                right--;
//            }
//            if (left <= right) {
//                int temp = nums[left];
//                nums[left] = nums[right];
//                nums[right] = temp;
//                left++;
//                right--;
//            }
//        }
//        if (end - left + 1 >= k) {
//            return helper(nums, left, end, k);
//        } else {
//            return helper(nums, start, left - 1, k - (end - left + 1));
//        }
//    }
}
}