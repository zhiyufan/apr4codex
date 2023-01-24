package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        int left = 0, right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                res[i] = nums[right];
                right--;
            } else {
                res[i] = nums[left];
                left++;
            }
        }
        return res;
    }

    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 0, right = n - 1;
        Arrays.sort(nums);
        int i = 0;
        while (left <= right) {
            if (i % 2 == 0) {
                res[i++] = nums[right--];
            } else {
                res[i++] = nums[left++];
            }
        }
        return res;
    }
}