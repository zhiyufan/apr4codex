package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        

        int[][] dp = new int[s.length()][s.length()];

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }

        return dp[0][s.length()-1];
    }

    def countWays(n, m):
        
      # create a 2D table 
      # to store results of subproblems 
      count = [[0 for x in range(m)] for x in range(n)]

      # Count ways to reach last cell 
      # for all possible combinations 
      for i in range(n):
          count[i][m - 1] = 1

      # Count ways to reach last cell 
      # for all possible combinations 
      for j in range(m):
          count[n - 1][j] = 1

      # Calculate number of ways to reach each cell 
      for i in range(n - 2, -1, -1):
          for j in range(m - 2, -1, -1):
              count[i][j] = count[i + 1][j] + count[i][j + 1]

      return count[0][0]
}