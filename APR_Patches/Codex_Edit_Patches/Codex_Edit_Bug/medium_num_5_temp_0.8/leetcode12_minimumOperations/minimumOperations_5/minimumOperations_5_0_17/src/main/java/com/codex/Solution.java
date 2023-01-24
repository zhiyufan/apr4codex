package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n; i++){
            dp[i] = dp[i - 1] + 1;
            if(nums[i] == nums[i - 2]){
                dp[i] = Math.min(dp[i - 2] + 1, dp[i]);
            }
        }
        return dp[n - 1];
    }

    public int maxArea(int[] height) {
        int n = height.length;
        int lo = 0;
        int hi = n - 1;
        int ans = 0;
        while (lo < hi){
            int area = Math.min(height[lo], height[hi]) * (hi - lo);
            ans = Math.max(ans, area);
            if (height[lo] < height[hi]){
                lo++;
            }
            else{
                hi--;
            }
        }
        return ans;
    }
    
}