package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> maxScoreIndices(int[] nums) {
    
    int n = nums.length;
    if (n == 0) return new ArrayList<>();
    int[] leftCount = new int[n];
    int[] rightCount = new int[n];
    int cur = 0;
    for (int i = 0; i < n; i++) {
        cur += nums[i];
        leftCount[i] = cur;
    }
    cur = 0;
    for (int i = n - 1; i >= 0; i--) {
        cur += nums[i] ^ 1;
        rightCount[i] = cur;
    }
    int max = 0;
    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        int left = i == 0 ? 0 : leftCount[i - 1];
        int right = i == n - 1 ? 0 : rightCount[i + 1];
        int sum = left + right;
        if (sum > max) {
            max = sum;
            res = new ArrayList<>();
            res.add(i);
        } else if (sum == max) {
            res.add(i);
        }
    }
    return res;
}


//recursive way

public static List<Integer> maxScoreIndices(int[] nums) {
    
    List<Integer> res = new ArrayList<>();
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
        int left = 0;
        if (i != 0) left = helper(Arrays.copyOfRange(nums, 0, i));
        int right = 0;
        if (i != nums.length - 1) right = helper(Arrays.copyOfRange(nums, i + 1, nums.length));
        if (max < left + right) {
            max = left + right;
            res = new ArrayList<>();
            res.add(i);
        } else if (max == left + right) {
            res.add(i);
        }
    }
    return res;
}
public static int helper(int[] nums) {
        
    int res = 0;
    for (int i = 0; i < nums.length; i++) {
        res += nums[i] == 1 ? 0 : 1;
    }

    return res;
}
}