package com.codex;

import java.util.*;

public class Solution {
package com.test;

public class MainClass {

	public static int minimumCost(int[] cost, int n) {
		int[] dp = new int[n];
		dp[0] = 0;
		dp[1] = cost[1];
        
		for (int i = 2; i <= n; i++) {
			dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
		}
		return Math.min(dp[n - 1], dp[n - 2]);
	}
	
	public static void main(String[] args) {

		int[] cost = {0, 1, 2, 5, 10};
		//int[] cost = {0, 0, 1};
		
		System.out.println(minimumCost(cost, cost.length - 1));
	}
}
}