package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
      
      if (nums.length == 0) return 0;
      if (nums.length == 1) return nums[0];
      if (nums.length == 2) return Math.min(nums[0] + nums[1], Math.max(nums[0], nums[1]));
      
         int dp[][] = new int[nums.length][3];
        for (int[] d : dp) Arrays.fill(d, Integer.MAX_VALUE);
        dp[0][1] = nums[0];
        
        for(int i = 2; i < nums.length; i++){
            if (nums[i - 2] == nums[i]){
                dp[i][2] = Math.min(dp[i][2], dp[i - 2][1] + nums[i]);
                dp[i][2] = Math.min(dp[i][2], dp[i - 2][2] + nums[i]);
            } else {
                dp[i][1] = Math.min(dp[i][1], dp[i - 2][1] + nums[i]);
                dp[i][1] = Math.min(dp[i][1], dp[i - 2][2] + nums[i]);
            }
            dp[i][1] = Math.min(dp[i][1], dp[i - 1][1] + nums[i - 1]);
            dp[i][1] = Math.min(dp[i][1], dp[i - 1][2] + nums[i -1]);
        }
        return Math.min(dp[nums.length - 1][1], dp[nums.length - 1][2]);
    }
    

//     public static int minimumOperations(int[] nums) {
//         if (nums.length == 0) return 0;
//         if (nums.length == 1) return nums[0];
//         if (nums.length == 2) return Math.min(nums[0] + nums[1], Math.max(nums[0], nums[1]));
//         int cache[][] = new int[nums.length][3];
//         cache[0][1] = nums[0];
//         cache[0][2] = nums[0];

//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i - 1]) {
//                 cache[i][1] = Math.min(nums[i] + cache[i - 1][1], nums[i] + cache[i - 1][2]);
//                 cache[i][2] = Math.min(nums[i] + cache[i - 1][2], nums[i] + cache[i - 2][1]);
//                 cache[i][2] = Math.min(cache[i][2], nums[i] + cache[i - 2][2]);
//                 cache[i][2] = Math.min(cache[i][2], nums[i] + cache[i - 1][1]);
//             }
//         }
//         return cache[nums.length - 1][2];
//     }



    public static int minimumOperations(int[] nums) {
        
        int dp[][] = new int[nums.length][3];
        for (int[] d : dp) Arrays.fill(d, Integer.MAX_VALUE);
        dp[0][1] = nums[0];
        dp[1][1] = nums[1];
        for(int i = 2; i < nums.length; i++){
            if (nums[i - 2] == nums[i]){
                dp[i][2] = Math.min(dp[i][2], dp[i - 2][1] + nums[i]);
                dp[i][2] = Math.min(dp[i][2], dp[i - 2][2] + nums[i]);
            } else {
                dp[i][1] = Math.min(dp[i][1], dp[i - 2][1] + nums[i]);
                dp[i][1] = Math.min(dp[i][1], dp[i - 2][2] + nums[i]);
            }
            dp[i][1] = Math.min(dp[i][1], dp[i - 1][1] + nums[i - 1]);
            dp[i][1] = Math.min(dp[i][1], dp[i - 1][2] + nums[i -1]);
        }
        return Math.min(dp[nums.length - 1][1], dp[nums.length - 1][2]);
    }

    
}