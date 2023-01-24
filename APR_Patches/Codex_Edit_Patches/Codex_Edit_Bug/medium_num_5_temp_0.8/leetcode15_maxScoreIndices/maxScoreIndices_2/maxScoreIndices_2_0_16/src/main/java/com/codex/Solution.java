package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> maxScoreIndices(int[] nums) {
        
        int[] a = new int[nums.length];
        int[] b = new int[nums.length];
        a[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            a[i] = a[i - 1] + nums[i];
        }
        b[nums.length - 1] = nums[nums.length - 1] == 0 ? 1 : 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            b[i] = b[i + 1] + (nums[i] == 0 ? 1 : 0);
        }
        int max = Integer.MIN_VALUE;
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int left = i == 0 ? 0 : a[i - 1];
            int right = i == nums.length - 1 ? 0 : b[i + 1];
            if (left + right > max) {
                max = left + right;
                res.clear();
                res.add(i);
            } else {
                if (left + right == max) {
                    res.add(i);
                }
            }
        }
        return res;
    }

    
}