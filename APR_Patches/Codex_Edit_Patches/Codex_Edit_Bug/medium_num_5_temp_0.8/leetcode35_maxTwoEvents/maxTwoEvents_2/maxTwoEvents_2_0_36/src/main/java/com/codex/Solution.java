package com.codex;

import java.util.*;

public class Solution {
public class Main {


	final static int MAX_CHAR = 26;

	// Driver program to test above function
	public static void main(String[] args) {
		String s = "GEEKSFORGEEKS";
		System.out.println(s);
		System.out.println(maxTwoEvents(s.toCharArray()));
	}

	private static int maxTwoEvents(char[] events) {
		int n = events.length;
		if (n == 0) return 0;
		int[][] dp = new int[n][3];
        int ans = 0;
        dp[0][0] = 0;
        dp[0][1] = events[0] - 'A' + 1;
        dp[0][2] = events[0] - 'A' + 1;
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
            dp[i][1] = (events[i] - 'A' + 1) + Math.max(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = (events[i] - 'A' + 1) + dp[i-1][1];
            ans = Math.max(ans, Math.max(dp[i][0], Math.max(dp[i][1],dp[i][2])));
        }
        return ans;
	}

}


    
}