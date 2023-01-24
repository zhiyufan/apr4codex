package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int minimumOperations(int[] nums) {
        //Difference between adjacent elements
        //But can add any value
        //Ex. 2,4,6,7 -> 2,6,13,13
        int[][] dp = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            dp[i][0] = Integer.MAX_VALUE;
            dp[i][1] = Integer.MAX_VALUE;
            if (i > 0) {
                //Adding number < current number
                dp[i][0] = Math.min(dp[i][0], dp[i - 1][0] + nums[i] - nums[i - 1]);
                //Adding number > current number
                dp[i][1] = Math.min(dp[i][1], dp[i - 1][1] + nums[i] - nums[i - 1] + 1);
                //Adding number = current number
                dp[i][0] = Math.min(dp[i][0], dp[i - 1][1]);
                dp[i][1] = Math.min(dp[i][1], dp[i][0] + 1);
            } else {
                dp[i][0] = 0;
                dp[i][1] = 0;
            }
        }
        return dp[n - 1];
    }

    
}