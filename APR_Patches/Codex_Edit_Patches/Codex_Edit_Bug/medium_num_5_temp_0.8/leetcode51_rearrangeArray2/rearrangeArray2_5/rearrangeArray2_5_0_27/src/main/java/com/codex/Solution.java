package com.codex;

import java.util.*;

public class Solution {
package codeX.codex;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] array = {1,5,3,7,5,3,5,3,8};
        int[] result = rearrangeArray(array);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] += (nums[nums[i]] % n) * n;
        }
        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }
        return nums;
    }

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
}
}