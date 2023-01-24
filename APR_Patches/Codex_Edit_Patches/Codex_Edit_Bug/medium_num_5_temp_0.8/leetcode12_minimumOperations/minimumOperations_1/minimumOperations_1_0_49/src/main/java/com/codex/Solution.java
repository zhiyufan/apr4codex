package com.codex;

import java.util.*;

public class Solution {
    static int[][] d;
    public static int minimumOperations(int[] nums) {

        d = new int[nums.length][3];
        for (int[] a : d) Arrays.fill(a, -1);

        d[0][1] = nums[0];
        d[1][1] = nums[1];
        return Math.min(dp(nums.length, 1, nums), dp(nums.length, 2, nums));
    }
    public static int dp(int n, int y, int[] nums){
        if(d[n - 1][y] != -1) return d[n - 1][y];
        int ret = Integer.MAX_VALUE;
        if(y == 1){
            if (nums[n - 2] == nums[n - 1]){
                ret = Math.min(ret, dp(n - 2, 1, nums) + nums[n - 1]);
                ret = Math.min(ret, dp(n - 2, 2, nums) + nums[n - 1]);
            } else {
                ret = Math.min(ret, dp(n - 2, 1, nums) + nums[n - 1]);
                ret = Math.min(ret, dp(n - 2, 2, nums) + nums[n - 1]);
            }
            ret = Math.min(ret, dp(n - 1, 1, nums) + nums[n - 2]);
            ret = Math.min(ret, dp(n - 1, 2, nums) + nums[n - 2]);
        }
        return d[n - 1][y] = ret;
    }

    
}