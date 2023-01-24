package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] a = new int[nums.length];
        a[0] = nums[0];
        int nowmin = 1;
        int nowmax = 1;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i!=0&&nums[i] > a[i - 1]) {
                left[i] = 1;
            }
            a[i] = Math.min(nums[i], a[0]);
            if (i!=0&&nums[nums.length - 1 - i] < a[a.length - i]) {
                right[nums.length - 1 - i] = 1;
            }
            a[a.length - i] = Math.max(nums[nums.length - 1 - i], a[a.length-1]);
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (left[i] == 1 && right[i] == 1) {
                res[i] = 2;
            } else if (left[i] == 1 || right[i] == 1) {
                res[i] = 1;
            }
        }
        int sum = 0;
        for (int i = 1; i < res.length - 1; i++) {
            sum += res[i];
        }
        return sum;
    }

    
}