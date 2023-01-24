package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
            set2.add(num);
        }
        for (int num : nums3) {
            if (set1.contains(num) || set2.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    public static boolean canBalance(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            left[i] = nums[i];
            if (i != 0) {
                left[i] += left[i - 1];
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            right[i] = nums[i];
            if (i != nums.length - 1) {
                right[i] += right[i + 1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (left[i] == right[i]) {
                return true;
            }
        }
        return false;
    }
}