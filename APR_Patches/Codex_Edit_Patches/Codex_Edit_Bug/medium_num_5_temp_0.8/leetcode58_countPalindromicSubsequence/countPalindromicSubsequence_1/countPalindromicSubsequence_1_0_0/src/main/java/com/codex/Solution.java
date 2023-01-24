package com.codex;

import java.util.*;

public class Solution {
public class Solution {

	
	public static int countPalindromicSubsequence(String s) {
		
		if (s.length() == 0) {
			return 0;
		}

		int n = s.length();


        int[][] dp = new int[s.length()][s.length()];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1] + 2;
                } else {
                    dp[i][j] = dp[i+1][j] + dp[i][j-1] - dp[i+1][j-1];
                }
            }
        }

        return dp[0][s.length()-1];
    }

    
}