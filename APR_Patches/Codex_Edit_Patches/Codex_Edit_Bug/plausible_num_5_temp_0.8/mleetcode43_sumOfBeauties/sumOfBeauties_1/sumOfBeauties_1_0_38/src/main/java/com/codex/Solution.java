package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
class Program {

	static int[] dp(int[] nums) {
		int[] dp = new int[nums.length];
		dp[0] = 0;
		int min = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > min) {
				dp[i] = i;
			} else {
				dp[i] = dp[i - 1];
			}
			min = Math.min(nums[i], min);
		}
		return dp;
	}

	static int[] dp2(int[] nums) {
		int[] dp = new int[nums.length];
		dp[nums.length - 1] = nums.length - 1;
		int max = nums[nums.length - 1];
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] < max) {
				dp[i] = i;
			} else {
				dp[i] = dp[i + 1];
			}
			max = Math.max(nums[i], max);
		}
		return dp;
	}

	static int[] beauties(int[] nums) {
		int[] dp = dp(nums);
		int[] dp2 = dp2(nums);
		int[] ans = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (dp[i] == i && dp2[i] == i) {
				ans[i] = 2;
			} else if (dp[i] == i || dp2[i] == i) {
				ans[i] = 1;
			} else {
				ans[i] = 0;
			}
		}
		return ans;
	}

    public static int sumOfBeauties(int[] nums) {
    	int[] arr = beauties(nums);
    	int ans = 0;
    	for (int i = 0; i < nums.length; i++) {
    		ans += arr[i];
    	}
    	return ans;
    }

    public static void main(String[] args) {
    }
}
}