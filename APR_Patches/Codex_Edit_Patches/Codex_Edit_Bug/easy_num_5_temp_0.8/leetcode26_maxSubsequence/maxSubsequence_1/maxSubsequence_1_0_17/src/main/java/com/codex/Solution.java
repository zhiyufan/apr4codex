package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] res = new int[k];
        int l1 = nums1.length, l2 = nums2.length;
        for (int i = Math.max(0, k - l2); i <= k && i <= l1; i++) {
            int[] candidate = merge(maxSubsequence(nums1, i), maxSubsequence(nums2, k - i), k);
            if (greater(candidate, 0, res, 0)) {
                res = candidate;
            }
        }
        return res;
    }
    
    private int[] merge(int[] nums1, int[] nums2, int k) {
        int[] res = new int[k];
        for (int i = 0, j = 0, r = 0; r < k; r++) {
            res[r] = greater(nums1, i, nums2, j) ? nums1[i++] : nums2[j++];
        }
        return res;
    }


    private boolean greater(int[] nums1, int i, int[] nums2, int j) {
        while (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
            i++;
            j++;
        }
        return j == nums2.length || (i < nums1.length && nums1[i] > nums2[j]);
    }

    private int[] maxSubsequence(int[] nums, int k) {
        return k == 0 ? new int[0] : maxSubsequence(nums, 0, nums.length - 1, k);
    }

    private int[] maxSubsequence(int[] nums, int start, int end, int k) {
        if (k == 0) {
            return new int[0];
        }
        if (end - start + 1 <= k) {
            return Arrays.copyOfRange(nums, start, end + 1);
        }
        int[] res = new int[k];
        int x = nums[start];
        int r = 0;
        while (r < k) {
            res[r] = x;
            r++;
        }
        int rStart = 1;
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] == x) {
                continue;
            }
            if (nums[i] < x) {
                int[] temp = maxSubsequence(nums, rStart, i - 1, k);
                if (!greater(res, 0, temp, 0)) {
                    res = temp;
                    x = nums[i];
                }
                rStart = i + 1;
            } else {
                break;
            }
        }
        if (rStart <= end) {
            int[] temp = maxSubsequence(nums, rStart, end, k);
            if (!greater(res, 0, temp, 0)) {
                res = temp;
            }
        }
        return res;
    }
}
}