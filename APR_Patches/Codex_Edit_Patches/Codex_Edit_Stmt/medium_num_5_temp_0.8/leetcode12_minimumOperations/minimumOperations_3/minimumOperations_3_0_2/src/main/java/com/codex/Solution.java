package com.codex;

import java.util.*;

public class Solution {
	public static int minimumOperations(int[] nums) {
		// DP[i][j] = minimumOperations(nums[0~i]) where nums[i] = j
		//          = min(DP[i-1][0] + 1, DP[i-1][1]) if j == 0 
		//          = min(DP[i-1][0], DP[i-1][1] + 1) if j == 1 && i > 1 && nums[i-1] == 0
		//          = min(DP[i-1][0] + 1, DP[i-1][1]) if j == 1 && i > 1 && nums[i-1] == 1
		//          = min(DP[i-1][0] + 1, DP[i-1][1] + 1) if j == 1 && i == 1
		int len = nums.length;
		int[][] dp = new int[len][2];
		dp[0][0] = 0;
		dp[0][1] = 1;
		dp[1][0] = dp[1][1] = 1;
		for (int i = 2; i < len; i++) {
			dp[i][0] = dp[i-1][1];
			if (nums[i] != nums[i-1]) {
				dp[i][0] += 1;
			}
			dp[i][1] = Math.min(dp[i-1][0], dp[i-1][1]);
			if (nums[i] != nums[i-1]) {
				dp[i][1] += 1;
			}
		}
		return Math.min(dp[len-1][0], dp[len-1][1]);
	}

    
}