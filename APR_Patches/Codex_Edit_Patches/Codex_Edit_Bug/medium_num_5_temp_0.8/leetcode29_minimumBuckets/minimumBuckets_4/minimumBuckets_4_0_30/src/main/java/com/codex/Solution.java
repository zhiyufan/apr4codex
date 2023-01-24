package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		int[] dp = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		dp[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			dp[i] = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] > arr[i]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		int res = 0;
		for (int i = 0; i < n; i++) {
			res = Math.max(res, dp[i]);
		}
		System.out.println(res);
	}
}