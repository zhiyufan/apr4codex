package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] ret = new int[k];
        for (int k1 = 0; k1 <= k; k1++) {
            int k2 = k - k1;
            if (k1 > nums1.length || k2 > nums2.length) continue;
            int[] list1 = maxSubsequence(nums1, k1);
            int[] list2 = maxSubsequence(nums2, k2);
            int[] merged = merge(list1, list2);
            if (greater(merged, 0, ret, 0)) ret = merged.clone();
        }
        return ret;
    }
    private int[] maxSubsequence(int[] nums, int k) {
        int[] ret = new int[k];
        for (int i = 0, j = 0; i < nums.length; i++) {
            while (j > 0 && nums[i] > ret[j-1] && nums.length - i > ret.length - j) j--;
            if (j < ret.length) ret[j++] = nums[i];
        }
        return ret;
    }
    private int[] merge(int[] nums1, int[] nums2) {
        int[] ret = new int[nums1.length + nums2.length];
        for (int i = 0, j = 0, k = 0; k < ret.length; k++) {
            ret[k] = greater(nums1, i, nums2, j) ? nums1[i++] : nums2[j++];
        }
        return ret;
    }
    private boolean greater(int[] nums1, int i, int[] nums2, int j) {
        for (; i < nums1.length && j < nums2.length; i++, j++) {
            if (nums1[i] > nums2[j]) return true;
            if (nums1[i] < nums2[j]) return false;
        }
        return i != nums1.length;
    }
}
}